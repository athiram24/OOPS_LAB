import java.util.Scanner;
class Overload
{
    public int area(int s)
    {
        return s*s;
    }
    public void area(int a,int b)
    {
        System.out.println("Area = "+a*b);
    }
    public void area(int a,int b,int c)
    {
        System.out.println("Area = "+ a*b*c);
    }
    public float area(float r)
    {
        return 3.14f*r*r;
    }
    public void area(float l,float b)
    {
        System.out.println("Area = "+0.5*l*b);
    }

}
class Shape
{
   public static void main(String a[])
   {
        int c;
        Scanner sc = new Scanner(System.in);
        Overload O = new Overload();
        do
        {
            System.out.println("Enter choice :\n1.Square\n2.Rectangle\n3.Cuboid\n4.Circle\n5.Triangle");
            c = sc.nextInt();
            switch(c)
            {
                case 1: 
                    System.out.println("Enter the side of the square");
                    int s = sc.nextInt();
                    System.out.println("Area = "+O.area(s));
                    break;
                case 2:
                    System.out.println("Enter the length and breadth of the rectangle:");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    O.area(l,b);
                    break;
                case 3:
                    System.out.println("Enter the length ,breadth and height of the cuboid:");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int z = sc.nextInt();
                    O.area(x,y,z);
                    break;
                case 4:
                    System.out.println("Enter the radius of the circle:");
                    float r = sc.nextFloat();
                    float area = O.area(r);
                    System.out.println("Area = "+ area);
                    break;
                case 5:
                    System.out.println("Enter the base and height of the triangle");
                    float base = sc.nextFloat();
                    float height = sc.nextInt();
                    O.area(base,height);
                    break;
                default:
                    System.out.println("Invalid choice");

            }
          

        }while(c!=0);
        sc.close();
    }
        

}

