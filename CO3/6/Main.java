import java.util.*;

import javax.lang.model.util.ElementScanner14;
interface AP
{
    void area();
    void perimeter();//creates an interface ap with area and perimeter declared here. 
}
class Circle implements AP
{
   int r;
public Circle(int r) 
{
    this.r = r;
}
public void area()
   {
        int Area = (int)(3.14*r*r);
        System.out.println("Area = "+ Area);
   }
   public void perimeter()
   {
    int perimeter = (int)(2*3.14*r);
    System.out.println("Perimeter = "+ perimeter);
   }
}
class Rectangle implements AP
{
    int l;
    int b;
    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
    public void area()
    {
        int Area = l*b;
        System.out.println("Area = "+Area);

    }
    public void perimeter()
    {
        int perimeter = 2*(l+b);
        System.out.println("Perimeter = "+perimeter);

    }
}

class Main 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the shape:circle/rectangle");
        String sh = sc.nextLine();
        sh = sh.toLowerCase();
        if(sh.equals("circle"))
        {
            System.out.println("Enter the radius:");
            int r = sc.nextInt();
            Circle o = new Circle(r);
            o.area();
            o.perimeter();
        }
        else if(sh.equals("rectangle"))
        {
            System.out.println("Enter the length and breadth:");
            int l = sc.nextInt();
            int b = sc.nextInt();
            Rectangle rec = new Rectangle(l,b);
            rec.area();
            rec.perimeter();
        }
        else
        {
            System.out.println("Invalid input:");
        }
    }
}
