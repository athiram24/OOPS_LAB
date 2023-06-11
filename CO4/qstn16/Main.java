import java.util.Scanner;
import java.util.HashSet;

class Main
{
public static void main(String[] args) 
    {

        HashSet<Integer> hash1 = new HashSet<>();
        HashSet<Integer> hash2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements in first set:");
        int n1 = sc.nextInt();
        for(int i=0;i<n1;i++)
        {
            System.out.println("Enter the element:"+i);
            hash1.add(sc.nextInt());
            
            
        }
     
        System.out.println("How many elements in second list:");
        int n2 = sc.nextInt();
        for(int i=0;i<n2;i++)
        {
            System.out.println("Enter the element:"+i);
            hash2.add(sc.nextInt());

        }
        System.out.println("First hashset :"+hash1);
        System.out.println("Second hashset :"+hash2);
        if(n1==n2)
        {
            boolean bool = hash1.equals(hash2);
            if(bool)
            {
                System.out.println("Both are equal:");
            }
        }
        else{
            System.out.println("Not equal:");
        }

        sc.close();





    }
}
