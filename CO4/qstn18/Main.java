import  java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> hash  = new HashMap<>();
        TreeMap<Integer,String> tree = new TreeMap<>();
        System.out.println("How many values:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the key"+i);
            int key = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the value"+i);
            String val = sc.nextLine();
            hash.put(key,val);

        }
        System.out.println("Hashmap after insertion:");
        for (Map.Entry<Integer, String> entry : hash.entrySet()) 
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    

        //converting all values to treemap....ie...hashmap is copying to treemap....
        tree.putAll(hash);
        System.out.println("Tree map after updating:");
        for (Map.Entry<Integer, String> entry : tree.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    
        sc.close();

    }
}