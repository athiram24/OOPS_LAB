package Mainpackage.graphics;
public class Circle implements AREA
{

    public void areacirc(float r)
    {
        float area = (float) (3.14*r*r);
        System.out.println("Area of Circle :"+area);  
    }
}

