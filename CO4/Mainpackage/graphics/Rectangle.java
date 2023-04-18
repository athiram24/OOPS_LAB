package Mainpackage.graphics;

public class Rectangle
{
    int l;
    int b;
    public Rectangle(int l, int b) 
    {
        this.l = l;
        this.b = b;
    }
    public void area()
    {
        int a = l*b;
        System.out.println("Area of Rectangle :"+a);  
    }
}
    

