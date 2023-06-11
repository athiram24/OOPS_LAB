import java.util.Scanner;
class Userexception extends Exception
{
    Userexception(String s)
    {
        super(s);
    }
}
class Main
{

    public static void main(String a[])
    {
        int n,num,avg;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers u want to insert");
        n = sc.nextInt();
        try
        {
            System.out.println("Enter the numbers:");
            for(int i=0;i<n;i++)
            {
                num = sc.nextInt();
                if(num<0)
                
                    throw new Userexception("Negative numbers are invalid:");
                
                else
                {
                    sum = sum+num; 
                }
            } 
             avg = sum/n;  
            System.out.println("AVERAGE: " + avg);
        }  
        catch(Userexception e)
        {
            System.out.println(e);
        }
       
        sc.close();
           
    
    }
}