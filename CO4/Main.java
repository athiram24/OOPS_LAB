import java.util.*;
class Authentication 
{
    private String username;
    private String password;
    public Authentication(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    public void check()
    {
       




    }
}
class Main

{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username and password for login:");
        String username = sc.nextLine();
        String password = sc.nextLine();
        Authentication user = new Authentication(username,password);
        sc.close();
    }
}
