package qstn1;
import java.io.*;
import java.util.Scanner;
class Main
{
    public static void main(String[] args) throws IOException
    
    {

        Scanner sc = new Scanner(System.in) ;
        String filepath = "C:\\Users\\Admin\\Desktop\\OOPS_LAB";
        File fp = new File(filepath);
        boolean bool = true;
        if(fp.exists()&&fp.isDirectory())
        {
            File files[] = fp.listFiles();
            System.out.println("Directory:");
            for(File f : files)
            {
                System.out.println(f.getName());//Listing files.....
                
            }

            System.out.println("Enter a filename to search:");
            String file_name = sc.next();
            for(File f : files)
            {
                if(f.getName().equals(file_name)) //searching file
                {
                    System.out.println(file_name+" Found");
                    bool = false;
                }
            
            }
            if(bool == true)
            {
                System.out.println("Not found:");
                
            }
        }
        sc.close();

    }
}