import java.util.Scanner;
import java.util.LinkedList;
public class Main
{
        public static void main(String[] a) 
        {
        Scanner sc = new Scanner(System.in);
        //creating linked list.....
        int c;
        LinkedList  <Integer> list = new LinkedList<>();
        do
        {
        System.out.println("Enter a choice :\n1.Insert\n2.Insert_specific\n3.Display\n4.Getvalue\n5.Delete\n6.Clear");
        c = sc.nextInt();
        switch(c)
        {
<<<<<<< HEAD
                case 1  : 
=======
                case 1  : {
>>>>>>> 68895cebbf5da93699d8515071b6f4d3f9df8cf4
                        System.out.println("Enter the value:");
                        int item = sc.nextInt();
                        list.add(item);
                        break;
<<<<<<< HEAD
                        
                case 2  :
                        System.out.println("Enter the index value:");
=======
                        }
                case 2  : {
                        System.out.println("Enter the index value:\n");
>>>>>>> 68895cebbf5da93699d8515071b6f4d3f9df8cf4
                        int index = sc.nextInt();
                        System.out.println("Enter the data :");
                        int value = sc.nextInt();
                        list.add(index,value);
                        break;
                        
                case 3 :
                        System.out.println("Linked list is :"+list);
                        break;
                        
                case 4 :
                        System.out.println("Enter the index to find the value:");
                         index = sc.nextInt();
                                if(index<list.size())
                                {
                                System.out.println("Value is :"+list.get(index));
                                }
                                else{
                                        System.out.println("Invalid index:");
                                }
                        break;
                        
                case 5  :
                        System.out.print("Enter the index to be removed...!");
                        int val = sc.nextInt();
                        System.out.println(list.get(val)+" removed");
                        list.remove(val);
                        System.out.println(list);
                        break;
                        
                case 6  :
                        System.out.println("Clearing......!");
                        list.clear();
                        System.out.println(list);
                        break;
                        
                }
        }while(c!=0);
        sc.close();
        }
} 