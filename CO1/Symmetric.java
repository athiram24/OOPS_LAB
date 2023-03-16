import java.util.Scanner;
class Checksymmetric{
     public void sym(int a[][])
     {
         boolean flag = false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    flag = true;
                    break;
                }

            }
        }
        
        if(flag == true){
            System.out.println("The given matrix is not  symmetric:");
        }
        else{
            System.out.println("The given matrix is  symmetric:");
        }
    } 
}
 class Symmetric {
    public static void main(String arg[])
    {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the no of coloumns:");
        int c = sc.nextInt();
       
         int a[][] = new int[r][c];
        System.out.println("Enter the array elements:");
        for(int i =0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
               a[i][j] =  sc.nextInt();
            }
        }
        Checksymmetric o = new Checksymmetric();
        o.sym(a);
    
    }
 }