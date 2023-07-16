import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;
class  Main
{
    public static void main(String[] args)
    {
        int c,n,val;
        Set<Integer> hs1 = new LinkedHashSet<>();
        Set<Integer> hs2 = new LinkedHashSet<>();
        Set<Integer> hs3 = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Enter the choice:\n1.Insert_hs1\n2.Insert_hs2\n3.Subset\n4.Union\n5.Intersection\n6.size");
            c = sc.nextInt();
            switch(c)
            {
                case 1:
                        System.out.print("\nHow Many Element in  HashSet1:");
                        n = sc.nextInt();
                        for(int i=0; i<n; i++)
                        {
                        val = sc.nextInt();
                        hs1.add(val);
                        }
                        break;
                    
                case 2:
                        System.out.print("\nHow Many Element in HashSet2:");
                        n = sc.nextInt();
                        for(int i=0; i<n; i++)
                        {
                        val = sc.nextInt();
                        hs2.add(val);
                        }
                        break;
                       
                case 3:
                        System.out.println(hs1.containsAll(hs2));
                        break;
                       
                case 4:
                        hs3.addAll(hs1);
                        hs3.addAll(hs2);
                        System.out.println("Union " + hs3);
                        Iterator<Integer> IT = hs3.iterator();
                        while(IT.hasNext())
                        {
                        
                            System.out.println(IT.next());
                        }
                        break;
                        
                case 5:
                         hs1.retainAll(hs2);
                         System.out.println("Intersection " + hs1);
                         break;
                       
                case 6:
                         System.out.println("Hashset 1: " + hs1.size());
                         System.out.println("Hashset 2: " + hs2.size());
                         break;
            }             
        
        }while(c!=0);
        sc.close();
    }
}