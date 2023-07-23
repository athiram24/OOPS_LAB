import java.io.*;
//import java.util.Scanner;
class Main

{
    public static void main(String[] args)throws IOException
    {
        String directory = "C:\\Users\\adhim\\OneDrive\\Desktop\\OOPS_LAB\\CO6\\qstn2\\New.txt";
       //File fp = new File(directory);

        //to write contents into the file.

        FileOutputStream out = new FileOutputStream(directory);
        String str = "Hi All I Am Athira Mohan";
        out.write(str.getBytes());


        //to read from file.
        FileInputStream in = new FileInputStream(directory);
        //System.out.println(in.available());
        byte [] b = new byte[in.available()];
        in.read(b);
        String s = new String(b);
        System.out.println(s);
        out.close();
        in.close();


    }

    
}