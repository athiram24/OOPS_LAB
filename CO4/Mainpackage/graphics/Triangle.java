package Mainpackage.graphics;
public class Triangle
{
    int b;
    int h;
    
    public Triangle(int b, int h)
    {
        this.b = b;
        this.h = h;
    }

    public void area()
    {
        int ar = (int) (0.5*b*h);
        System.out.println("Area of Triangle :"+ar);
    }
}

