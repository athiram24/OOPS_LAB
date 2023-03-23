import java.util.Scanner.*;
class Employee
{
    int EmpId;
    String Ename;
    Float Salary;
    String Address;



}
class Teachers extends Employee
{
    String Subject;
    String Department;
    Teachers(EmpId,Empname,Salary,Address,Department,Subject)
    {
        this.EmpId = EmpId;
        this.Empname = Empname;
        this.Salary = Salary;
        this.Address = Address;
        this.Department = Department;
        this.Subject = Subject;
    }
    public void display()
    {
        System.out.println("EmpId :"+ EmpId );
        System.out.println("Empname :" +Empname);
        System.out.println("Salary : " +Salary);
        System.out.println("Address : "+ Address);
        System.out.println("Department : "+ Department);
        System.out.println("Subject : "+ Subject);
    }


}






class Main
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Extending the functionalities to another class");
        System.out.println("Enter the number of teachers:");
        int n = sc.nextInt();
        Teachers emp[] = new Teachers[n];
        for(int i=0; i<n;i++)
        {
            System.out.print("Enter the details:\n Enter the employee ID,Name ,Salary,Address,Department and Subject:");
            int Eno = sc.nextInt();
            String Ename = sc.next();
            Float Salary = sc.nextFloat();
            String Address = sc.next();
            String Department = sc.next();
            String Subject = sc.next();
            emp[i] = new Teachers(Eno,Ename,Salary,Address,Department,Subject);



            


        }
    }
}