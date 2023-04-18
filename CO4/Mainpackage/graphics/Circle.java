package Mainpackage.graphics;
public class Circle implements Area
{
    float r;
    
    public Circle(float r)
    {
        this.r = r;
    }

    public void area()
    {
        float area = (float) (3.14*r*r);
        System.out.println("Area of Circle :"+area);  
    }
}

