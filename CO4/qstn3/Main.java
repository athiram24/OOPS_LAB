package qstn3;
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
    public Authentication(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    public void check(String userName,String pass)
    {
        try
        {
            if(!username.equals("userName")|!password.equals("pass"))
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

        // finally
        // {
        //         System.out.println("");
        // }
    }
}
class Main

{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username and password :");
        String username = sc.nextLine();
        String password = sc.nextLine();
        Authentication user = new Authentication(username,password);
        System.out.println("Enter the username and password for login:");
        String userName = sc.nextLine();
        String pass = sc.nextLine();
        user.check(userName,pass);
        sc.close();
    }
}
