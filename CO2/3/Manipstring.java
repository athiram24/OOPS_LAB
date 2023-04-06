import java.util.*;
class Functions
{
    public int Length(String str)
    {
        return str.length();
    }
    public String Substrings(String s1,int index1,int index2)
    {
         return s1.substring(index1,index2);
    }
    public void Concatenation(String s1,String s2)
    {
        String str =  s1.concat(s2);
        System.out.println("The resultant string is:" + str);
    }
    public void Uppercase(String str)
    {
        System.out.println("Uppercase of the given string is "+str.toUpperCase());
    }
    public void Lowercase(String str)
    {
        System.out.println("Lowercase of the given string is "+str.toLowerCase());
    }
    public void Stringcompare(String s1, String s2)
    {
        if(s1.equals(s2))
        System.out.println("Both are equal");
        else
        System.out.println("Not same:");
    }
    public void Stringsplit(String str)
    {
        String[] arrOfStr = str.split("@");
        for (String a : arrOfStr)
            System.out.println(a);
    }
    public void Stringreplace(String str,char s1,char s2)
    {
        System.out.println("Replace is:"+ str.replace(s1,s2));//
    }


}
class Manipstring
{
    public static void main(String a[])
    {
        int c;
        String str;
        Scanner Sc = new Scanner(System.in);
        Functions O = new Functions();
        System.out.println("Enter a string:");
        str = Sc.next();
        do
        {
        System.out.println("Enter your choice:\n1.String Length\n2.Substring\n3.Concatenation");
        System.out.print("4.Uppercase Convertion\n5.Lowercase Conversion\n6.String Comparison\n7.Split\n8.String replace\n");
        c = Sc.nextInt();
        switch(c)
        {
            case 1:{
                        int len = O.Length(str);
                        System.out.println("Length of the given string is:"+len);
                        break;

                   }

            case 2:{
                        System.out.println("Enter the starting and ending index:");
                        int index1 = Sc.nextInt();
                        int index2 = Sc.nextInt();
                        String str1 = O.Substrings(str,index1,index2);
                        System.out.println("Substring is:"+str1);
                        break;
                    }
            case 3:{
                        System.out.println("Enter the second string:");
                        String str1 = Sc.next();
                        O.Concatenation(str,str1);
                        break;

                    }
            case 4:{
                        O.Uppercase(str);
                        break;
                    }
            case 5:{
                        O.Lowercase(str);
                        break;
                    }
            case 6:{
                        System.out.println("Enter the second string to compare:");
                        String str1 = Sc.next();
                        O.Stringcompare(str,str1);
                        break;

                    }
            case 7:{
                        O.Stringsplit(str);
                        break;
                   }
            case 8:{
                        System.out.println("Enter the character to be replaced :");
                        char rep = Sc.next().charAt(0);
                        System.out.println("Enter the character to be replaced with:");
                        char repl = Sc.next().charAt(0);
                        O.Stringreplace(str,rep,repl);
                        break;
                    }
            default: System.out.println("Invalid choice:");
                   
            
            }
        }while(c!=0);
        
    }
}