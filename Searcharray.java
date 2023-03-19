import java.util.Scanner;
class Search
{
    int Arr[] ;
    Search (int Arr[])
    {
        this.Arr = Arr;
    }
    public void find (int item)
    {
        boolean flag = false;
        int pos = -1;
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i] == item)
            {
                pos = i;
                flag = true;
                break;
            }
           
        }
        if(flag == true)
        {
            System.out.println(item + " found at " + pos);
        }
        else 
        {
            System.out.println("Not found:" );
        }

    }
}
class Searcharray
    {
        public static void main(String[] args)
        {
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter the array size:");
            int n = inp.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the array elements: ");
            for(int i=0;i<arr.length;i++)
            {
                arr[i] = inp.nextInt();
            }

            System.out.println("Enter the element to be searched:");
            int item = inp.nextInt();
            Search s = new Search(arr);
            s.find(item);





        }

    }
