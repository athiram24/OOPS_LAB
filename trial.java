import java.util.Scanner;

public class trial
 {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rollno,Name,Marks to be included in academics:");
        int rollno = sc.nextInt();
        String name = sc.nextLine();
        int mark = sc.nextInt();
        System.out.print(name);
    }
}
