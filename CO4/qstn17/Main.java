import java.util.*;

class Main 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        //creating map interface
        Map<Integer,String> map = new HashMap<>();
            int c,k1,k;
            String str,value;
            do
            {
                System.out.println("Enter the choice :\n1.Insert\n2.Display\n3.Update\n4.Getvalue\n5.Remove\n");
                c = sc.nextInt();
                switch(c)
                {
                    case 1:
                                System.out.println("How many key-value pair to be inserted:");
                                int n = sc.nextInt();
                                //Adding elements as key-value pair.
                                for(int i=0;i<n;i++)
                                {
                                    System.out.println("Enter key "+i);
                                    k = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Enter value "+i);
                                    value = sc.nextLine();
                                    map.put(k,value);
                                }
                                break;
                    case 2:
                                for(Map.Entry<Integer, String> e: map.entrySet())
                                {
                                    System.out.println(e.getKey()+" : "+ e.getValue());
                                }
                                break;
                    case 3:
                                System.out.println("Enter the key to be updated:");
                                k = sc.nextInt();
                                System.out.println("Enter the value:");
                                str = sc.next();
                                map.replace(k,str);
                                break;
                    case 4:
                                System.out.println("Enter a key to find the value:");
                                k1 = sc.nextInt();
                                if(map.containsKey(k1))
                                {
                                str = map.get(k1);
                                System.out.println("value of key "+k1+" is "+str);
                                }
                                else
                                {
                                    System.out.println("not found");
                                }   
                                break;
                    case 5:
                                System.out.println("\nEnter key to remove: ");
                                k = sc.nextInt();
                                System.out.println(map.get(k)+" Removed!...");
                                map.remove(k);
                                break;
                            
                }
            }while(c!=0);
        sc.close();
    }
}

                    
                    
                    
                   
                
                  
    