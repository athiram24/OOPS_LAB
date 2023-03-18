import java.util.Scanner;
class Add
{
    int real;
    int img;
    public Add(int real,int img)// This is a constructor.
    {
        this.real = real;
        this.img = img;
    }
    public Add addition(Add other)
    {
        int real = this.real + other.real;
        int img = this.img + other.img;
        return new Add(real,img);//it returns another object with real and imaginary also it calls constructor automatically.
    }
    public void  display(){
        System.out.println("Sum is:");
        System.out.print(real + "+i" + img);
    }
}
class Complex
{
    public static void main(String arg[])
    {
        int r1,r2,i1,i2;
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter the real and imaginary part for first complex number:");
            r1 = sc.nextInt();
            i1 = sc.nextInt();
            System.out.println("Enter the real and imaginary part for second complex number:");
            r2 = sc.nextInt();
            i2 = sc.nextInt();
            Add o1 = new Add(r1, i1);
            Add o2 = new Add(r2, i2);
            Add o3 = o1.addition(o2);
            o3.display();
        }
    }
}