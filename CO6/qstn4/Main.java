import java.io.*;
class  Main
{
    public static void main(String[] args) throws Exception
    {
        String path1 = "C:\\Users\\adhim\\OneDrive\\Desktop\\OOPS_LAB\\CO6\\qstn4\\F.txt";
        String path2 = "C:\\Users\\adhim\\OneDrive\\Desktop\\OOPS_LAB\\CO6\\qstn4\\F1.txt";
        String path3 = "C:\\Users\\adhim\\OneDrive\\Desktop\\OOPS_LAB\\CO6\\qstn4\\F2.txt";
        FileInputStream fout = new FileInputStream(path1);//to read data from main file.
        FileOutputStream f1 = new FileOutputStream(path2);//to write odd nos into file.
        FileOutputStream f2 =  new FileOutputStream(path3);//to write even files into file.

        int i;
        while((i= fout.read()) !=-1)
        {
            if(i%2 == 0)
            {
                f2.write(i);
            }
            else{
                f1.write(i);
            }


        }
        System.out.println("Numbers written succesfully!.....");

        fout.close();
        f1.close();
        f2.close();
       


    }

}