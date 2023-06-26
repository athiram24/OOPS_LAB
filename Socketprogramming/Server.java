import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Server 
{

  public static void main(String args[]) {
    try 
    {
      System.out.println("Server started");

      ServerSocket serverSocket = new ServerSocket(3000);
      InetAddress serverAddress = InetAddress.getLocalHost();
      System.out.println("Server listening on " + serverAddress.getHostAddress());

      while (true)
       {
        Socket clientSocket = serverSocket.accept();
        Thread thread = new Thread(new ClientHandler(clientSocket));
        thread.start();
      }
    } catch (Exception e)
    {
      System.out.println(e.getMessage());
    }
  }
}

class ClientHandler implements Runnable
 {
  private Socket clientSocket;

  public ClientHandler(Socket clientSocket)
   {
    this.clientSocket = clientSocket;
  }

  public void run() {
    try {
      System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

      String inputLine;
      while ((inputLine = in.readLine()) != null) {
        System.out.println("Received message from client " + clientSocket.getInetAddress().getHostAddress() + ": " + inputLine);
        out.println("Server: " + inputLine);
      }

      System.out.println("Client disconnected: " + clientSocket.getInetAddress().getHostAddress());
      clientSocket.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
