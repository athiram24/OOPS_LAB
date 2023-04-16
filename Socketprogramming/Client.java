import java.net.*;
import java.io.*;
public class Client
{
    public static void main(String[] arg)
    {
        try
        {
            System.out.print("Client Started!...");
            Socket soc = new Socket("localhost",9806);
            BufferedReader userinput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string:");
            String str = userinput.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
            



        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
        
    }   
}
