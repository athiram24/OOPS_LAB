package Arithmetic.arithmeticoperation;
public class Addition
{
    int a,b;
    public Addition(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void  add()
    {
        int num = a+b;
        System.out.println("Result = "+num);
    }
}
