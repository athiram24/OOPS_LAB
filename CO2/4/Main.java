import java.util.*;
class Employee
{
    int Empid;
    String Empname;
    Float Salary;
    public void Displaydetails()
    {
        System.out.println("Displaying details:");
        System.out.println("EmpId:" + Empid+ "\nEmpName:"+ Empname+"\nSalary:"+Salary);
      
    }
}
class Main
{
    public static void main(String a[])
    {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        for(int i=0;i<n;i++)
        {
            emp[i] = new Employee();
            System.out.println("Enter the details:\n");
            System.out.println("Enter the Emp id:");
            emp[i].Empid = sc.nextInt();
            System.out.println("Enter the name :");
            emp[i].Empname = sc.next();
            System.out.println("Enter the Salary:");
            emp[i].Salary = sc.nextFloat();


            
        }
        System.out.println("Enter the employee Id to be searched:");
        int item = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(emp[i].Empid == item)
            {
                System.out.println("Employee found :");
                emp[i].Displaydetails();
                flag = true;
                break;

            }
        }   
        if(!flag)   
         {
            System.out.println("Not found");
        } 

    }
}


