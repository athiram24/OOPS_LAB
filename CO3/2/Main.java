import java.util.Scanner;
class Employee
{
    int EmpId;
    String Empname;
    Float Salary;
    String Address;
    
    public Employee(int empId, String empname, Float salary, String address) {
        EmpId = empId;
        Empname = empname;
        Salary = salary;
        Address = address;
    }

    public Employee() {
    }


}
class Teacher extends Employee
{
    String dept;
    String sub;
    
    
    public Teacher(int EmpId, String Empname, float Salary, String Address, String dept, String sub)
     {
        super(EmpId, Empname, Salary, Address);
        this.dept = dept;
        this.sub = sub;
    }


    public Teacher(String dept, String sub)
     {
        this.dept = dept;
        this.sub = sub;
    }


    public void display()
    {
        System.out.println("-----------------------------");
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
        Teacher[] t = new Teacher[n];
        System.out.println("Enter the details:\n");
        for(int i =0;i<n;i++)
        {
           
            System.out.println("Enter the Empid,Empname,Salary of employee"+(i+1));
            int empid = in.nextInt();
            String empname = in.next();
            float salary = in.nextFloat();
            in.nextLine();
            System.out.println("Enter the Address,Department,Subject:");
            String address = in.nextLine();
            String dep = in.nextLine();
            String sub = in.nextLine();
            t[i] = new Teacher(empid,empname,salary,address,dep,sub);
        }
        System.out.println("\nDetails:\n");
        for(int i=0;i<n;i++)
        
            t[i].display();
            System.out.println("");
        

           
     }
       





}
    

