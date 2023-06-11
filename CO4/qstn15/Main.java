import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;
class  Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements:");
        int n = sc.nextInt();
        Set<String> list = new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the value:");
            list.add(sc.next());
        }
        Iterator<String> it = list.iterator();
        System.out.println("Elements after insertion:");
        while(it.hasNext())
        {
           
            System.out.println(it.next());
        }

        if(list.isEmpty())
        {
            System.out.println("The linkdhashset is empty:");
        }
        //returns size
        int size = list.size();
        System.out.println("Size :"+size);
        //searching values
        sc.nextLine();
        System.out.println("Enter the element to search:");
        
        String str = sc.nextLine();
        if(list.contains(str))
        {
            System.out.println(str+" found");
        }
        else{
            System.out.println("Not found:");
        }
        //Removing values from linkedshashset
       // sc.nextLine();
        System.out.println("Enter the value to be deleted:");

        String string = sc.nextLine();
        list.remove(string);
     
        System.out.println("Elements after Removal:");
        Iterator<String> IT = list.iterator();
        while(IT.hasNext())
        {
           
            System.out.println(IT.next());
        }


        
        sc.close();

    }
}