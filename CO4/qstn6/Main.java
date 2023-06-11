import java.util.*;
class Fibnocci implements Runnable
{
    int n;
    public Fibnocci(int n) {
        this.n = n;
    }
    public void run()
    {
        int a=0,b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        c = a+b;
        System.out.println(c);
        a = b;
        b = c;
        
        

        
        



    }



    




}





public class Main
{
    public static void main(String a[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        n = sc.nextInt();






    }
}