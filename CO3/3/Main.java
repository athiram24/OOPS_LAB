import java.util.*;
class Person
{
    String Name;
    char Gender;
    String  Address;
    int Age;
    public Person(String name, char gender, String address, int age) 
    {
        Name = name;
        Gender = gender;
        Address = address;
        Age = age;
    }
}
class Employee extends Person
{
    int Empid;
    String Company_name;
    String Qualification;
    Float Salary;
    public Employee(String name, char gender, String address, int age, int empid, String company_name,
            String qualification, Float salary)
    {
        super(name, gender, address, age);
        Empid = empid;
        Company_name = company_name;
        Qualification = qualification;
        Salary = salary;
    }
    
}

class Teacher extends Employee
{
    String Subject;
    String Department;
    int Teacherid;
    public Teacher(String name, char gender, String address, int age, int empid, String company_name,
            String qualification, Float salary, String subject, String department, int teacherid)
    {
        super(name, gender, address, age, empid, company_name, qualification, salary);
        Subject = subject;
        Department = department;
        Teacherid = teacherid;
    }
    public void display()
    {
        System.out.println("------------------------------------------------------");
        System.out.println("\nName:"+Name+"\nGender:"+Gender+"\nAddress:"+Address+"\nAge:"+Age+"\nEmpid:"+Empid);
        System.out.println("Company Name:"+Company_name+"\nQualification:"+Qualification+"\nSalary:"+Salary);
        System.out.println("Subject:"+Subject+"\nDepartment"+Department+"\nTeacherId:"+Teacherid);
    }
}
class Main 
 {
    public static void main(String a[])  
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees:");
        int n = sc.nextInt();
        Teacher[] t = new Teacher[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details:\n");
            System.out.println("Enter the name,gender,address,age:");
            String name = sc.next();
            char gender =  sc.next().charAt(0);
            String address = sc.next();
            sc.nextLine();
            int age = sc.nextInt();
            System.out.println("Enter the empid,company name,qualification,salary,subject:");
            int empid = sc.nextInt();
            sc.nextLine();
            String cmpny = sc.nextLine();
            String qual = sc.next();
            Float salary = sc.nextFloat();
            sc.nextLine();
            String sub = sc.next();
            System.out.println("Enter the department and teacher id:");
            String dep = sc.next();
            int id = sc.nextInt();
            t[i] = new Teacher(name,gender,address,age,empid,cmpny,qual,salary,sub,dep,id);
        }

        System.out.println("\nDisplaying details:\n");
        for(int i=0;i<n;i++)
        {
            t[i].display();
            System.out.println();
        }
    }
}
