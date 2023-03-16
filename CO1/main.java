import java.util.Scanner;
class Product{
    int pcode;
    String pname;
    int price;
}

public class main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Product o1 = new Product();
        Product o2 = new Product();
        Product o3 = new Product();
        System.out.println("Enter the itemcode:");
        o1.pcode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name :");
        o1.pname = sc.nextLine();
        System.out.println("Enter the price :");
        o1.price = sc.nextInt();



        System.out.println("Enter the itemcode:");
        o2.pcode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name :");
        o2.pname = sc.nextLine();
        System.out.println("Enter the price :");
        o2.price = sc.nextInt();

        System.out.println("Enter the itemcode:");
        o3.pcode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name :");
        o3.pname = sc.nextLine();
        System.out.println("Enter the price :");
        o3.price = sc.nextInt();
        if(o1.price < o2.price && o1.price < o3.price){
            System.out.println("first one is cheaper:");
            System.out.println("Item code:" + o1.pcode);
            System.out.println("Item name:" +o1.pname );
            System.out.println("Item price:" +o1.price);


        }
        else if(o2.price < o1.price && o2.price < o3.price){


            System.out.println("second one is cheaper:");
            System.out.println("Item code:" + o2.pcode);
            System.out.println("Item name:" +o2.pname );
            System.out.println("Item price:" +o2.price);

        }
        else{

            System.out.println("third one is cheaper:");
            System.out.println("Item code:" + o3.pcode);
            System.out.println("Item name:" +o3.pname );
            System.out.println("Item price:" +o3.price);
        }

        }
 }