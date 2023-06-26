import java.net.Socket;
import java.io.*;

public class Client
 {

  public static void main(String args[])
   {
    
    try 
    {
      System.out.println("Client started");

      Socket socket = new Socket("172.20.32.209", 3000);
      System.out.println("Connected to server at " + socket.getInetAddress().getHostAddress());

      BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

      while (true) 
      {
        System.out.print("Enter a string: ");
        String str = userInput.readLine();
        out.println(str);
        System.out.println(in.readLine());
      }
    } 
    catch (Exception e)
        {
        System.out.println(e.getMessage());
        }
  }
}


