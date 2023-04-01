 import java.util.Scanner;
 class LinearSearch
 {
    int n;
    int array[];
    boolean flag = false;
    int pos =0;
    public void SearchItem(int n,int array[],int item)
    {
       for(int i=0;i<array.length;i++)
       {
        if(array[i]==item)
        {
            flag = true;
            pos = i+1;
             break;

        }

       }
       if(flag == true)
       {
        System.out.println(item + "found at  " + pos);

       }
       else
       {
        System.out.println("Not found:");
       }
    }
 }
 class Search
 {

 
    public static void main(String a[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter the item to be searched:");
        int item = sc.nextInt();
        LinearSearch obj = new LinearSearch();
        obj.SearchItem(n,arr,item);


    }
 }
