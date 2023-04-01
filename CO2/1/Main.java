import java.util.*;
class Sortstring
{
    public void sorting(String str[])
    {
        Arrays.sort(str);
        System.out.println( Arrays.toString(str));
        
    }

}
class Main
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of String:");
        int n = sc.nextInt();
        System.out.println("Enter the string");
        String s[] = new String[n];
        for(int i=0;i<n;i++)
             s[i] = sc.next();
        Sortstring obj = new Sortstring();
        obj.sorting(s);
        sc.close();
    }
}