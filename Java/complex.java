import java.util.Scanner;
class cmplx
{
    int real;
    int img;
    public cmplx(int real,int img)
    {

        this.real = real;
        this.img = img;
    }
    public cmplx add(cmplx other)
    {
        
        int real = this.real + other.real;
        int img = this.img + other.img;
        return new cmplx(real,img);
    }
    public void  display(){
        System.out.println("Sum is:");
        System.out.print(real + "+i" + img);
    }
}
class complex
{
    public static void main(String arg[])
    {
        int r1,r2,i1,i2;
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter the real part for first complex number:");
            r1 = sc.nextInt();
            System.out.println("Enter the imaginary part for first complex number:");
            i1 = sc.nextInt();
            System.out.println("Enter the real part for second complex number:");
            r2 = sc.nextInt();
            System.out.println("Enter the imaginary part for first complex number:");
            i2 = sc.nextInt();
            cmplx o1 = new cmplx(r1, i1);
            cmplx o2 = new cmplx(r2, i2);
            cmplx o3 = o1.add(o2);
            o3.display();
        }
    }
}