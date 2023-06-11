import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;
class Main
{
 public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new PriorityQueue<>();//or we can set comparator as reverse order...then it will follow max heap propert
        System.out.println("How many  elements:");
        int n = sc.nextInt();
        //adding values to the queue using for loop and offer()
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter value "+i);
            queue.offer(sc.nextInt());
        }
        // It print values in minheap order...ie...smaller one will come first.
      
        int value = queue.peek();//returns value at top

        System.out.println("HEAD :"+value);
        System.out.println(queue);
        //Removing elements.....
        System.out.println("How many values to be deleted:");
        int num = sc.nextInt();
        for(int i=0;i<num;i++ )
        {
        queue.poll();//Removes first one since it follows FIFO
        }
        Iterator<Integer> it = queue.iterator();//iterator is used to iterate over the elements and print the value
        while(it.hasNext())
        {
            System.out.println("Queue after deletion:");
            System.out.println(it.next());
        }

        sc.close();
    }
}