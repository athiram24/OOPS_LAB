import java.io.IOException;
import java.net.ServerSocket;
import java.net.*;
public class EcoServer 
{
    public static void main(String [] args) 
    {
        try 
        {
            System.out.println("Waiting for Clients....!");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection established!.....");
        
        } 
        catch (Exception e) 
        { 
            e.printStackTrace();
        }
        
    }   
}
