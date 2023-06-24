import java.util.*;//using scanner,linkedlist and queue
class Buffer
{
    int maxsize;
    private Queue <Integer> queue; 
    public Buffer(int maxsize)
    {
        this.queue = new LinkedList<>();
        this.maxsize = maxsize;
    }
    public synchronized void produce(int item)
    {
        while(queue.size() == maxsize)
        {
            try
            {
                wait();//waits for consumer to consume.
            }
            catch(InterruptedException e)
            {
                Thread.currentThread().interrupt();
                return;
            }
            
        }
        queue.add(item);
        System.out.println("produce:"+item);
        notifyAll();//notifies consumer to consume new items.
    }

     public synchronized void consume()
     {
        while(queue.isEmpty())//checks whether the queue is empty or not
        {
            try
            {
                wait();//waits for the producer to produce
            }
            catch(InterruptedException e)
            {
                Thread.currentThread().interrupt();
                return;
            }

        }
        int val = queue.poll();//consuming items
        System.out.println("consumed:"+val);
        notifyAll();//notifies the producer to producer
     }
}

    
class Producer implements Runnable
{
    private Buffer buffer;

    public Producer(Buffer buffer)
    {
        this.buffer = buffer;
    }

    @Override
    public void run()
    {
       for(int i=1;i<=10;i++)
       {
        buffer.produce(i);
       }
        
    }
    
}
class Consumer implements Runnable
 {
    private Buffer buffer;

    public Consumer(Buffer buffer)
    {
        this.buffer = buffer;
    }

    @Override
    public void run() 
    {
        for (int i = 1; i <= 10; i++) 
        {
            buffer.consume();
        }
    }
}

class Main 
{
   public static void main(String a[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the buffer size:");
    int size = sc.nextInt();
    Buffer buffer = new Buffer(size);
    Thread proThread = new Thread(new Producer(buffer));
    Thread conThread = new Thread(new Consumer(buffer));
    proThread.start();
    conThread.start();
     try 
        {
            proThread.join();
            conThread.join();
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    sc.close();
    }

}
