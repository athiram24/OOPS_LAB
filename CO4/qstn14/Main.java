import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
class Main
{
    public static void main(String[] args) 
    {
        int c;
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deq = new ArrayDeque<>();
        do
        {
            System.out.println("Enter the choice:\n1.Insert beg\n2.Insert end\n3.Delete beg\n4.Delete end\n5.Topvalue and Headvalue\n");
            c = sc.nextInt();
            switch(c)
            {
                case 1: {
                            System.out.println("How many elements:");
                            int n = sc.nextInt();
                            for(int i=0;i<n;i++)
                            {
                                System.out.println("Enter value "+i);
                                deq.offerFirst(sc.nextInt());
                            }
                            System.out.println("After insertion through front:"+deq);
                            break;
                        }
                case 2: {
                            System.out.println("How many elements:");
                            int n = sc.nextInt();
                            for(int i=0;i<n;i++)
                            {
                                System.out.println("Enter value "+i);
                                deq.offerLast(sc.nextInt());
                            }
                            System.out.println("After insertion through rear:"+deq);
                            break;
                        }
                case 3: {
                            System.out.println("How many elements you want to delete:");
                            int n = sc.nextInt();
                            for(int i=0;i<n;i++)
                            {
                                deq.pollFirst();
                            }
                            System.out.println("After deletion from beginning:"+deq);
                            break;
                        }
                case 4: {
                            System.out.println("How many elements you want to delete:");
                            int n = sc.nextInt();
                            for(int i=0;i<n;i++)
                            {
                                deq.pollLast();
                            }
                            System.out.println("After deletion from end:"+deq);
                            break;
                        }
                case 5: {
                            int head = deq.peekFirst();
                            int top = deq.peekLast(); 
                            System.out.println("TOP :"+top+"\nHead:"+head);
                            break;

                        }
                } 
        }while(c!=0);
    sc.close();   
    }
}
