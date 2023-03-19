import java.util.*;

class Stringmanip
{
     Scanner inp = new  Scanner(System.in);
     public void Length(String str)
     {
        System.out.println("Length  is "+ str.length());
     }
     public void Replace (String str,String c1,String c2)
     {
        System.out.println("Before replace:" + str);
        System.out.println("After replace: "  + str.replace(c1,c2));
     }
     public void Split(String str)
     {
        System.out.println("Before splitting:" + str);
        String arr[] = str.split(",");
        System.out.print("After splitting: " + Arrays.toString (arr));

     }
     public void convertlower(String str)
     {
          System.out.println("Before converting:" + str);
         System.out.println("After converting:" + str.toLowerCase());
     }
     public void convertupper(String str)
     {
         System.out.println("Before converting:" + str);
         System.out.println("After converting:" + str.toUpperCase());
     }
     public void stringconcat(String str1,String str2)
     {
         
         System.out.println("Concatenated string is " + str1+ "  " +str2);//str1.concat(str2)
     }
     public void Stringsubstr(String str,int n1,int n2)
     {
         System.out.println("The given syring is " + str);
         System.out.println("Substring is :" + str.substring(n1,n2));
     }
   //   public void findindex(String str1,String str2)
   //   {
   //    System.out.println("Index of " + str2 + "is" + str1.indexOf(str2));
   //   }
}
class Stringmain
{



    public static void main(String[] args)
    {
        Scanner inp = new  Scanner(System.in);
        int n;
        Stringmanip o = new Stringmanip();
        do
        {
        System.out.println("\nEnter the choice:\n1.Find the length\n2.Replace\n3.Split\n4.Convert to Lowercase\n5.convert to Uppercase\n6.Concatenation\n7.Substring\n8.Find index");
        n = inp.nextInt();
        switch(n)
          {
            case 1: {
                      System.out.println("Enter a string to find the length:");
                      String s = inp.next();
                      o.Length(s);
                      break;

                     }
            case 2: {
                    System.out.println("Enter a string:");
                    String str = inp.next();
                    System.out.println("Enter which word  to  be replaced and also enter the word to replace :");
                    String c1 = inp.next();
                    String c2 = inp.next();
                    o.Replace(str,c1,c2);
                    break;

                    }
            case 3: {
                       System.out.println("Enter a string(comma separated):");
                       String str = inp.next();
                       o.Split(str);
                       break;
                    }
            case 4: {
                        System.out.println("Enter the string in uppercase:");
                        String str = inp.next();
                        o.convertlower(str);
                        break;
                    }
                       
            case 5: {
                        System.out.println("Enter the string in lowercase:");
                        String str = inp.next();
                        o.convertupper(str);
                        break;
                    }
            case 6: {
                        System.out.println("Enter the string1");
                        String str1 = inp.next();
                        System.out.println("Enter the string2");
                        String str2 = inp.next();
                        o.stringconcat(str1,str2);
                    }
            case 7: {
                        System.out.println("Enter a string:");
                        String str = inp.next();
                        System.out.println("Enter the starting and ending position:");
                        int n1 = inp.nextInt();
                        int n2 = inp.nextInt();
                        o.Stringsubstr(str,n1,n2);
                        break;
                    }
            // case 8: {
            //             System.out.println("Enter a string:");
            //             String str = inp.nextLine();
            //             System.out.println("Enter the word to find the index:");
            //             String str1 = inp.next();
            //             o.findindex(str,str1);
            //           break;
            //          }  

            default: {
                        System.out.println("Invalid choice:");
                        break;

                     }


         }
      }while(n!=0);
   }
}
