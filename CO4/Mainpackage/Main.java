package Mainpackage;
import java.util.Scanner;
import Mainpackage.graphics.Circle;
import Mainpackage.graphics.Rectangle;
import Mainpackage.graphics.Square;
import Mainpackage.graphics.Triangle;


//importing all the classes inside the package.
class Main
{
    public static void main(String[] args) 
    {
        int c;
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.println("Enter the figure:1.Rectangle\n2.Triangle\n3.Square\n4.Circle\n");
         c = sc.nextInt();
        switch(c)
        {
            case 1: System.out.println("Enter the Length and breadth for Rectangle:");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    Rectangle rec = new Rectangle();
                    rec.arearec(l,b);
                    break;
            case 2: System.out.println("Enter the Breadth and height for the triangle:");
                    int bredth = sc.nextInt();
                    int h = sc.nextInt();
                    Triangle tri = new Triangle();
                    tri.areatri(bredth,h);
                    break;
            case 3: System.out.println("Enter the side of square:");
                    int s = sc.nextInt();
                    Square sq = new Square();
                    sq.areasq(s);
                    break;
            case 4: System.out.println("Enter the radius of the circle:");
                    float r = sc.nextFloat();
                    Circle cir = new Circle();
                    cir.areacirc(r);
                    break;
            default: System.out.println("Invalid entry:");
        }
    }while(c!=0);
}
}
