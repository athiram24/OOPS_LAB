import java.util.*;

class Main
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Strings:");
        int n = sc.nextInt();
        System.out.println("Enter the string");
        String s[] = new String[n];
        for(int i=0;i<n;i++)
             s[i] = sc.next();
        Arrays.sort(s);
        System.out.println( Arrays.toString(s));
        
       
        sc.close();
    }
}