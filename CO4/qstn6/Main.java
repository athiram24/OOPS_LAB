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
        System.out.println("Fibnocci series:");
        System.out.println(a);
        System.out.println(b);
        c = a+b;
        while(c <= n-2)
        {
        System.out.println(c);
        a = b;
        b = c;
        c = a+b;
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        }
    }
}
class Even implements Runnable
{
    int n;
    public Even(int n)
    {
        this.n = n;
    }
    public void run()
    {
        int i=2;
        System.out.println("Even numbers:");
        while(i<n)
        {
            System.out.println(i);
             try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
            i+=2;

        }

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
        Fibnocci obj1 = new Fibnocci(n);
        Even obj2 = new Even(n);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.run();
        t2.run();
        sc.close();
    }
}