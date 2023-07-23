import java.io.*;
import java.nio.file.Files;
class Main 
{
    public static void main(String[] args) throws Exception
    {
        String path1 = "C:\\Users\\adhim\\OneDrive\\Desktop\\OOPS_LAB\\CO6\\qstn3\\File1.txt";
        String path2 = "C:\\Users\\adhim\\OneDrive\\Desktop\\OOPS_LAB\\CO6\\qstn3\\File.txt";
        File f1 = new File(path1);
        File f2 = new File(path2);
        Files.copy(f1.toPath(),f2.toPath());
        
    
    }
}