package qstn1;
import java.io.*;
public class Main 
{
	public static void main(String a[])
	{
		String path = "C:\\Users\\adhim\\OneDrive\\Desktop\\OOPS_LAB\\CO6";
		File fp = new File(path);
		System.out.println("Listing files in :"+fp.getName());
		
		List(fp);
		String item = "Hello.txt";//to search this file
		search(fp,item);
		
	
	}
	public static void List(File f)
	{
		File[] files = f.listFiles();
		for(File file : files)
		{
			if(file.isFile())
			{
				System.out.println(file.getName());
			}
			else if(file.isDirectory())
			{
				System.out.println("SubDirectory:"+file.getName());
				List(file);
			}
		}
		
	}
	public static boolean search(File f,String item)
	{
		File[] files = f.listFiles();
		for(File file:files)
		{
			if(file.isDirectory())
			{
				search(file,item);
				
			}
			else if(file.isFile())
			{
				if(file.getName().equals(item))
				{
					System.out.println(item+"found at "+file.getAbsolutePath());
					return true;
				}
			}
		}
		return false;
		
	}
}