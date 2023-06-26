import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.List;
import java.util.EmptyStackException;
import java.util.ArrayList;
class Trystack<T>
{
    private ArrayList <T> list;
    public Trystack()
    {
        list = new ArrayList<>();
    }
    public void push(T value)
    {
        list.add(value);
        System.out.println(value+"Inserted");
    }
     public void pop()
    {
        int index;
        if(list.isEmpty())
            System.out.println("Stack is empty:");
        
        else
        {
            index = (list.size()-1); 
            System.out.println(list.remove(index));
            System.out.println(list.get(index)+"Removed!");
        }  

    }
    public void peek()
    {
        T topvalue;
        if(list.isEmpty())
        {
            System.out.println("stack is empty:");
        }
        else
        {
            topvalue = list.get(list.size() - 1);
            System.out.println("Top value: " + topvalue);
        }
        
    }
    public void display()
    {
        System.out.println(list);

    }
}
class Main
{
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the type:\n1.Integer\n2.String\n");
        int c = sc.nextInt();
        if(c==1)
        {   
            Trystack <Integer> stack = new Trystack<Integer>();
            do
            {
                System.out.println("Enter the choice:\n1.Push\n2.Pop\n3.Topvalue\n4.Display");
                int ch = sc.nextInt();
                switch(ch)
                {
                    case 1 ->{
                                System.out.println("Enter the value");
                                int item = sc.nextInt();
                                stack.push(item);
                                break;

                            }
                    case 2 ->{
                            
                                stack.pop();
                                break;
                            }
                    case 3 ->{
                                try
                                {
                                stack.peek();
                                }
                                 catch (Exception e) 
                                {
                                    
                                }
                                break;
                            }
                    case 4 ->{
                                stack.display();
                                break;
                            }
                }
            }while(c!=0);
        }
        else
         {
            Trystack <String> stack = new Trystack<String>();
            do
            {
                System.out.println("Enter the choice:\n1.Push\n2.Pop\n3.Topvalue\n4.Display");
                int ch = sc.nextInt();
                switch(ch)
                {
                    case 1 ->{
                                System.out.println("Enter the value");
                                String item = sc.nextLine();
                                stack.push(item);
                                break;

                            }
                    case 2 ->{
                                stack.pop();
                                break;
                            }
                    case 3 ->{
                                stack.peek();
                                break;
                            }
                    case 4 ->{
                                stack.display();
                                break;
                            }
                }
            }while(c!=0);
        }
        sc.close();
    }
}


