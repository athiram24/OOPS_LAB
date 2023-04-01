import java.util.*;
class Functions
{
    public int Length(String str)
    {
        return Length(str);
    }
    public void Stringreverse(String str)
    {
        //String revstr = reve
    }
    public String Substrings(String s1,int index1,int index2)
    {
         return s1.substring(index1,index2);
    }
    public String Concatenation(String s1,String s2)
    {
        return s1.concat(s2);
    }



}
class Manipstring
{
    public static void main(String a[])
    {
    
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n1.String Length\n2.String Reverse\n3.Substring\n4.Concatenation\n");
        System.out.println("5.Uppercase Convertion\n6.Lowercase Conversion\n7.String Comparison\n8.Split\n9.Stringreplace\n");
        int c = Sc.nextInt();
        Functions O = new Functions();
        switch(c)
        {
            case 1:{    
                        System.out.println("Enter a String:");
                        String str = Sc.nextLine();
                        int len = O.Length(str);
                        System.out.println("Length of the given sring is:"+len);
                        break;

                   }
            case 2:{    
                        System.out.println("Enter a string:");
                        String str = Sc.nextLine();
                        O.Stringreverse(str);
                        break;
                    }
            case 3:{
                        System.out.println("Enter a string:");
                        String s1 = Sc.nextLine();
                        System.out.println("Enter the starting and ending index:");
                        int index1 = Sc.nextInt();
                        int index2 = Sc.nextInt();
                        String str = O.Substrings(s1,index1,index2);
                        System.out.println("Substring is:"+str);
                        break;
                    }
            case 4:{
                        System.out.println("Enter the first string:");
                        String s1 = Sc.nextLine();
                        System.out.println("Enter the second string:");
                        String s2 = Sc.nextLine();
                        O.Concatenation(s1,s2);
                        break;

                    }
            case 5:{
                        System.out.println("Enter a string:");
                        String str = Sc.nextLine();
                        O.Uppercase(str);
                        break;
                    }
            case 6:{
                        System.out.println("Enter a string:");
                        String str = Sc.nextLine();
                        O.Lowercase(str);
                        break;
                    }
            case 7:{
                        System.out.println("Enter the first string:");
                        String s1 = Sc.nextLine();
                        System.out.println("Enter the second string:");
                        String s2 = Sc.nextLine();
                        O.Stringcompare(s1,s2);
                        break;

                    }
            case 8:{
                        System.out.println("Enter a string:");
                        String str = Sc.nextLine();
                        O.Stringsplit(str);
                        break;
                   }
            case 9:{
                        System.out.println("Enter a string:");
                        String str = Sc.nextLine();
                        System.out.println("Enter the replace:");
                        String rep = Sc.nextline();
                        O.Stringreplace(str,rep);
                        break;
                    }

        }
        
    }
}