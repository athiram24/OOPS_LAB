import java.util.Scanner;
class Sum
{
    int c[][]  = new int[2][2];
 public void add( int a[][],int b[][])
     {
         for(int i =0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
     }
    public void display(int m,int n)
    {
            System.out.println("Resultant matrix is");
            System.out.println();
            for( int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                        System.out.print(c[i][j]+ " " );
                    }
                    System.out.println();
                }
    }
}
class Array 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int [2][2];
        int b[][] = new int [2][2];
        System.out.print("Enter the elements of first matrix:");
        for(int i =0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j] = sc.nextInt();
            } 
        }
        System.out.print("Enter the elements of second matrix:");
        for(int i =0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        Sum arr = new Sum();
        arr.add(a,b);
        arr.display(2,2);
    }
}

        
