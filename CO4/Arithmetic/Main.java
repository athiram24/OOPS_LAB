package Arithmetic;
import java.util.*;
import Arithmetic.arithmeticoperation.*;
//import Arithmetic.arithmeticoperation.Division;
class Main
{
    public static void main(String a[])
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice:\n1.Add\n2.Subract\n3.Multiply\n4.Division\n");
        int c = sc.nextInt();
        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        switch(c)
        {
            case 1: Addition O = new Addition(n1,n2);
                    O.add();
                    break;
            case 2: Subraction S = new Subraction(n1, n2);
                    S.sub();
                    break;
            case 3: Multiplication mult = new Multiplication(n1,n2);
                    mult.mul();
                    break;
            case 4: Division division = new Division(n1,n2);
                    division.div();
                    break;
            default: System.out.println("Invalid choice:");

        }

    sc.close(); 
    }
    
}
