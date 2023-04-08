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
    float unitprice;
    float total;
    public Bill(int prodId, String prodname,int  quantity, float unitprice) {
        this.prodId = prodId;
        this.prodname = prodname;
        this.quantity = quantity;
        this.unitprice = unitprice;
    }
    public void calculate() 
    {
       System.out.println("Total price:\t"+ quantity*unitprice+" rupees only");
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products you want to enter:");
        int n = sc.nextInt();
        Bill b[] = new Bill[n];
        System.out.println("Enter the product details:");
        for(int i=0;i<n;i++)
        {
           
            System.out.print("\nProduct Id:");
            int Id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the name:");
            String name = sc.nextLine();
            System.out.print("Quantity:");
            int  quantity = sc.nextInt();
            System.out.print("Unit price:");
            float price = sc.nextFloat();
            b[i] = new Bill(Id,name,quantity,price);
        }
        System.out.println("Displaying the product  details:");
        for(int i=0;i<n;i++)
        {
            System.out.print("\n---------------------------\n");
            b[i].view();  
        }
    }
}
