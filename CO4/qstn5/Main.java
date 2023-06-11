import java.util.*;
class Prime extends Thread
{
    int n;
    public Prime(int n) {
        this.n = n;
    }    
      public void run()
      {

                int num,i,flag;
                for(num=2;num<=n;num++)
                {
                    flag=0;
                    for(i=2;i<=num/2;i++)
                    {
                        if(num%i==0)
                        {
                            flag =1;
                            break;
                        }
                    }
                    if(flag ==0)
                    {
                        
                        System.out.println(num);
                        try {
                            Thread.sleep(10);
                        } 
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }  
        }

}
class Multiply extends Thread
{
    int s;
  public Multiply(int s) {
        this.s = s;
    }
public void run()
  {
    for(int i=1;i<=s;i++)
    {
        System.out.println("5*"+i+"="+(5*i));
        try {
            Thread.sleep(10);
        } 
        catch (InterruptedException e) {
           
            e.printStackTrace();
        }
    }
  }
}
public class Main
{
    public static void main(String[] args)
    {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the limit :");
      n = sc.nextInt();
      Prime o1 = new Prime(n);
      Multiply o2 = new Multiply(n);
      o2.setPriority(Thread.MAX_PRIORITY);
      o1.start();
     try {
        Thread.sleep(5);
        }
      catch (InterruptedException e)
       {
        e.printStackTrace();
        }
      o2.start();
      sc.close();
    }
}