import java.io.IOException;
import java.net.*;
public class EcoClient
{
    public static void main(String a[])
    {
        try 
        {
            System.out.println("Client started!...");
            Socket soc = new Socket("localhost",9806);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

    }
}