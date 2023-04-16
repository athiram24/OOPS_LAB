import java.util.*;
interface Samplecalc
{
    void calculate();
}
class Bill implements Samplecalc
{
    int prodId;
    String prodname;
    int quantity;
    int unitprice;
    int total;
    public Bill(int prodId, String prodname,int  quantity, int unitprice)
     {
        this.prodId = prodId;
        this.prodname = prodname;
        this.quantity = quantity;
        this.unitprice = unitprice;
    }
    public void calculate() 
    {
        total = quantity*unitprice;
        System.out.print(" \t\t "+ total+"\n");
    }
    public void view()
    {
        
        System.out.print("\n"+prodId+" \t\t "+prodname+" \t\t  "+ quantity+" \t\t  "+ unitprice);
        
        calculate();
    } 
}

class Main
{
    public static void main(String a[])
    {
        int netamt=0;
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the number of products you want to enter:");
        int n = sc.nextInt();
        Bill b[] = new Bill[n];
        System.out.println("Enter the product details:");
        for(i=0;i<n;i++)
        {
            System.out.print("\nProduct Id:");
            int Id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the name:");
            String name = sc.nextLine();
            System.out.print("Quantity:");
            int  quantity = sc.nextInt();
            System.out.print("Unit price:");
            int price = sc.nextInt();
            b[i] = new Bill(Id,name,quantity,price);
        }
        System.out.println("\nDisplaying the product  details:");
        System.out.println("Product Id \t Product Name \t Quantity \t Unit price \t Total Price");
        System.out.println("-------------------------------------------------------------------\n");
        for(i=0;i<n;i++)
        {
           
            b[i].view();
            netamt += b[i].total;
        }
        System.out.println("---------------------------------------------------------------------\n");
        System.out.print("Net.amount: "+ netamt +" rupees only");
    }
}
