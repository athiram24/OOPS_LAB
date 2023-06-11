import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter the number of elements to insert:");
        n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the value:"+(i+1));
            String str = sc.nextLine();
            list.add(str);//add values to the list
        }
        int size = list.size();
        System.out.println("Size of the list is:"+size);
        System.out.println("Enter the index  to retreive the value:");
        int ind = sc.nextInt();
        if(ind>=0&&ind<size)
        {
            String str = list.get(ind);//used to retreive value at the given index
            System.out.println("Value at "+ind+" is "+str);
        }
        else{
            System.out.println("Invalid index:");
        }
        System.out.println("Enter a string to search:");
        sc.nextLine();
        String str = sc.nextLine();
        if(list.contains(str))//it checks wheather the value is present in the list or not
        {

            ind = list.indexOf(str);
            System.out.println(str+"Found at"+ind);

         }
         else{
             System.out.println("Not found");
        }
        System.out.println("Enter a string to replace ");
        String rep = sc.next();
        System.out.println("Enter the index");
        int index = sc.nextInt();
        list.set(index,rep);//used to update the value at the given index
        System.out.println(list);
        System.out.println("Enter a string to remove from the list:");
        sc.nextLine();
        String string = sc.nextLine();
        list.remove(string);
        System.out.println("List after removal :"+list);
        System.out.println("Sorted!...."); //sorting the list using collection framework
        Collections.sort(list);
        Iterator<String> it = list.iterator();//iterator is used to iterate over the elements and prints the value
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
           
        
    }
}
