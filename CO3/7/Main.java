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
        System.out.println("Total price:\t"+ total+" rupees only");
    }
    public void view()
    {
        System.out.println("\nProduct Id:\t"+prodId);
        System.out.println("Product Name:\t"+prodname);
        System.out.println("Quantity:\t"+quantity);
        System.out.println("Unit price:\t"+unitprice);
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
        System.out.println("Displaying the product  details:");
        for(i=0;i<n;i++)
        {
            System.out.println("-------------------------------\n");
            b[i].view();
            netamt += b[i].total;
        }
        System.out.println("---------------------------------\n");
        System.out.print("Net.Amount: "+ netamt +" rupees only");
    }
}
