import java.util.*;

class Main 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        //creating map interface
        Map<Integer,String> map = new HashMap<>();
        System.out.println("How many key-value pair to be inserted:");
        int n = sc.nextInt();
        //Adding elements as key-value pair.
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter key "+i);
            int key = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter value "+i);
            String value = sc.nextLine();
            map.put(key,value);
        }
        System.out.println("After inertion:"+map);
        
        //upadating values
        sc.nextLine();
        System.out.println("Enter the key to be updated:");
        int  k = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the value:");
        String str = sc.nextLine();
        map.replace(k,str);
        System.out.println("after updation:"+map);

        //to get values of the given key
        System.out.println("Enter a key to find the value:");
        int k1 = sc.nextInt();
        if(map.containsKey(k1))
        {
        String string = map.get(k1);
        System.out.println("value of key "+k1+" is "+string);
        }
        else{
            System.out.println("not found");
        }


        //remove elements
        sc.nextLine();
        System.out.println("Enter the key to be deleted:");
        int keys = sc.nextInt();
        map.remove(keys);
        System.out.println("Map After removal:"+map);
        sc.close();
    }



}