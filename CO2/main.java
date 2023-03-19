import java.util.Scanner;
import java.util.Arrays;
 class Stringsorter
 {
    String[] str;
    
  
 Stringsorter(String str[])
  {
     this.str= str;
    

 }
 public void sorting()
{
        String str2[] = Arrays.copyOf(str,str.length);
        Arrays.sort(str2);
        System.out.println("\nAfter sorting:");
        for(int i=0;i<str.length;i++)
        {
            System.out.print("\t" +str2[i]);
        }


}
}
class main
{
    public static void main(String args[])
    {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of strings to inserted:");
        int n = inp.nextInt();
        String s[] = new String[n];
        System.out.println("Enter the strings:");
        for(int i =0;i<n;i++)
        {
            s[i] = inp.next();
        }
        
        System.out.println("Before sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print("\t"+s[i]);
        }
        Stringsorter obj = new Stringsorter(s);
        obj.sorting();
      
        //




    }
}
