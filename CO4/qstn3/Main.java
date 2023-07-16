import java.util.*;
class login extends Exception
{
    login(String s)
    {
        super(s);
    }

}
class Authentication 
{
    private String username;
    private String password;
    public Authentication(String username,String password)
    {
        this.username = username;
        this.password = password;
    }
    public void check(String userid,String pass)
    {
        try
        {
            if(!userid.equals(username)|!pass.equals(password))
            {
                throw new login("Enter valid username or password");

            }
            else
            {
                System.out.println("Login Successfully!.....");
            }
            
        }
        catch(login e)
        {
            System.out.println(e);
        }
       
    }
}
class Main

{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username = sc.nextLine();
        System.out.println("Enter the pasword: ");
        String password = sc.nextLine();
        Authentication user = new Authentication(username,password);
        System.out.println("Enter the username for login:");
        String userid = sc.nextLine();
        System.out.println("Enter the password for login:");
        String pass = sc.nextLine();
        user.check(userid,pass);
        sc.close();
    }
}  