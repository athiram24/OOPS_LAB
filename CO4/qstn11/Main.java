import java.util.Scanner;
import java.util.LinkedList;
public class Main
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        //creating linked list.....
        int c;
        LinkedList  <Integer> list = new LinkedList<>();
        
        do
        {
        System.out.println("Enter a choice :\n1.Insert\n2.Insert_specific\n3.Display\n4.Getvalue\n5.Delete\n6.Clear\n");
         c = sc.nextInt();
        
        switch(c)
        {
                case 1  : {
                        System.out.println("Enter the value:");
                        int item = sc.nextInt();
                        list.add(item);
                        break;
                        }
                case 2  : {
                        System.out.println("Enter the index value:\n");
                        int index = sc.nextInt();
                        System.out.println("Enter the data :");
                        int value = sc.nextInt();
                        list.add(index,value);
                        break;
                        }
                case 3 ->{
                        System.out.println("Linked list is :"+list);
                        break;
                        }
                case 4 ->{
                        System.out.println("Enter the index to find the value:");
                        int index = sc.nextInt();
                                if(index<list.size())
                                {
                                System.out.println("Value is :"+list.get(index));
                                }
                                else{
                                        System.out.println("Invalid index:");
                                }
                        break;
                        }
                case 5  ->{
                        System.out.print("Enter the index to be removed...!");
                        int val = sc.nextInt();
                        System.out.println(list.get(val)+" removed");
                        list.remove(val);
                        System.out.println(list);
                        break;
                        }
                case 6  ->{
                        System.out.println("Clearing......!");
                        list.clear();
                        System.out.println(list);
                        break;
                        }
                }
        }while(c!=0);
         sc.close();
        }
} 