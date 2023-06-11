import java.util.Scanner;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        //creating linked list.....
        LinkedList  <String> list = new LinkedList<>();
        //Adding elements to the linked list...
        
        list.add("Orange");
        list.add("Grapes");
        list.add("Watermelon");
        list.set(1,"Mango");//changing values
        list.addFirst("Apple");
        list.addLast("Orange");
        System.out.println(list);
        //Removing elements from the linked list....

        list.remove("Apple");
        list.remove("Orange");
        System.out.println("list after removing apple and orange:"+list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        //removing the entire list....
    
        list.clear();
        System.out.println(list);
        sc.close();
    }
        
    

} 