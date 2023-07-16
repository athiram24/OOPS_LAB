import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        int n,c;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        do
        {
            System.out.println("Enter the choice:\n1.Add\n2.size\n3.Getvalue\n4.Search\n5.Update\n6.Remove\n7.Sort\n8.Display");
            c = sc.nextInt();
            switch(c)
            {
                case 1: System.out.println("Enter the number of elements to insert:");
                        n = sc.nextInt();
                        sc.nextLine();
                        for(int i=0;i<n;i++)
                        {
                            System.out.println("Enter the value:"+(i+1));
                            String str = sc.nextLine();
                            list.add(str);//add values to the list
                        }
                        break;
                case 2: int size = list.size();
                        System.out.println("Size of the list is:"+size);
                        break;
                case 3: System.out.println("Enter the index  to retreive the value:");
                        int ind = sc.nextInt();
                        if(ind>=0&&ind<list.size())
                        {
                            String str = list.get(ind);//used to retreive value at the given index
                            System.out.println("Value at "+ind+" is "+str);
                        }
                        else
                        {
                            System.out.println("Invalid index:");
                        }
                        break;
                case 4: System.out.println("Enter a string to search:");
                        sc.nextLine();
                        String str = sc.nextLine();
                        if(list.contains(str))//it checks wheather the value is present in the list or not
                        {

                        ind = list.indexOf(str);
                        System.out.println(str+"Found at"+ind);

                        }
                        else
                        {
                        System.out.println("Not found");
                        }
                        break;
                case 5: System.out.println("Enter a string to replace ");
                        String rep = sc.next();
                        System.out.println("Enter the index");
                        int index = sc.nextInt();
                        list.set(index,rep);//used to update the value at the given index
                        System.out.println("Updated!....");
                        break;
                case 6: System.out.println("Enter a string to remove from the list:");
                        sc.nextLine();
                        String string = sc.nextLine();
                        list.remove(string);
                        System.out.println(string+" Removed");
                        System.out.println("List after removal :"+list);
                        break;
                case 7: System.out.println("Sorted!...."); //sorting the list using collection framework
                         Collections.sort(list);
                         break;
                case 8: Iterator<String> it = list.iterator();//iterator is used to iterate over the elements and prints the value
                        while(it.hasNext())
                        {
                            System.out.println(it.next());
                        }
                        break;
            }
        }while(c!=0);
        sc.close();
    }

}
