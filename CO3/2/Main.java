import java.util.Scanner;
class Employee
{
    int EmpId;
    String Empname;
    Float Salary;
    String Address;
    public Employee(EmpId,Empname,Salary,Address)
    {
        this.EmpId = EmpId;
        this.Empname = Empname;
        this.Salary = Salary;
        this.Address = Address;

    }


}
class Teacher extends Employee
{
    String dept;
    String sub;
    public void display()
    {
        System.out.println("Details:");
        System.out.println("EmpId:"+EmpId);
        System.out.println("Empname:"+Empname);
        System.out.println("Salary:"+Salary);
        System.out.println("Address:"+Address);
        System.out.println("Department:"+dept);
        System.out.println("Subject:"+sub);
        
    }
}
class Main
{
    public static void main(String a[])
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n = in.nextInt();
        Employee [] emp = Employee[n];
        System.out.println("Enter the details:\n");
        for(int i =0;i<n;i++)
        {
            emp[i] = new Employee();
            System.out.println("Enter the Empid,Empname,Salary,Address,Department,Subject");
            int empid = in.nextInt();
            


            int 
        }
       





    }
    
}
