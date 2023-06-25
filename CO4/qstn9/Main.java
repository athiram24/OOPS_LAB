import java.util.*;
class BubbleSort<T extends Comparable<T>>
{

    private T[] items;
    public BubbleSort(T[] items) 
    {
        this.items = items;
    }
    public void bubble_sort()
    {
        for(int i=0;i<(items.length-1);i++)
        {
            for(int j=0;j<items.length-i-1;j++)
            {
                if(items[j].compareTo(items[j+1])>0)
                {
                    T temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;

                }

            }
        }
    }
    public T[] getSortedArray()
    {
        return items;
    }

}
class Main 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int ch,n;
        System.out.println("choose type:\n1.Integer\n2.String");
        ch = sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter how many elements:");
            n = sc.nextInt();
            Integer [] arr = new Integer[n];
            System.out.println("Enter "+ n + "values");
            for (int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            BubbleSort<Integer> bs = new BubbleSort<>(arr);
            System.out.println("Before sorting ....!\n");
            for(int num :arr)
            {
                System.out.print(num+"\t");
            }
            bs.bubble_sort();
            arr = bs.getSortedArray();
            System.out.println("\nAfter sorting ....!\n");
            for(int num :arr)
            {
                System.out.print(num+"\t");
            }

        }
        else
        {
            System.out.println("Enter how many strings:");
            n = sc.nextInt();
            String[] arr = new String[n];
            System.out.println("Enter "+ n + "values");
            for (int i=0;i<n;i++)
            {
                arr[i] = sc.next();
            }
            BubbleSort<String> bs = new BubbleSort<>(arr);
            System.out.println("Before sorting ....!\n");
            for(String val:arr)
            {
                System.out.print(val+"\t");
            }
            bs.bubble_sort();
            arr = bs.getSortedArray();
            System.out.println("\nAfter sorting ....!\n");
            for(String val:arr)
            {
                System.out.print(val+"\t");
            }
        }
        
        sc.close();
    }
}