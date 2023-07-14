package Mainpackage;
import java.util.Scanner;
import Mainpackage.graphics.*;

//importing all the classes inside the package.
class Main
{
    public static void main(String[] args) 
    {
        int c;
        Scanner sc = new Scanner(System.in);
        do
        {
                System.out.println("Choose the figure:\n1.Rectangle\n2.Triangle\n3.Square\n4.Circle\n");
                c = sc.nextInt();
                switch(c)
                {
                case 1: System.out.println("Enter the Length and breadth for Rectangle:");
                        int l = sc.nextInt();
                        int b = sc.nextInt();
                        Rectangle rec = new Rectangle(l, b);
                        rec.area();
                        break;
                case 2: System.out.println("Enter the Breadth and height for the triangle:");
                        int bredth = sc.nextInt();
                        int h = sc.nextInt();
                        Triangle tri = new Triangle(bredth,h);
                        tri.area();
                        break;
                case 3: System.out.println("Enter the side of square:");
                        int s = sc.nextInt();
                        Square sq = new Square(s);
                        sq.area();
                        break;
                case 4: System.out.println("Enter the radius of the circle:");
                        float r = sc.nextFloat();
                        Circle cir = new Circle(r);
                        cir.area();
                        break;
                default: System.out.println("Invalid entry:");
                }
        }while(c!=0);
        sc.close();
    }
}
