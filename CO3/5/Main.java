import java.util.*;
class Student
{
    int rollno;
    String name;
    int mark;
    public Student(int rollno, String name, int mark)
     {
        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
    }
}
class Sports extends Student
{
    String sportsid;
    int  score;
    public Sports(int rollno, String name, int mark, String sportsid, int score) {
        super(rollno, name, mark);
        this.sportsid = sportsid;
        this.score = score;
    }
}
class Result extends Sports
{
   public Result(int rollno, String name, int mark, String sportsid, int score) 
   {
        super(rollno, name, mark, sportsid, score);
    }

void display()
   {
        System.out.println("Name:"+ name);
        System.out.println("Sports Id:"+sportsid+"\tScore:"+score);
        System.out.println("Rollno:" +rollno+"\t\tMark:"+mark);
        System.out.println("Total score :"+((int)score+(int)mark));    
   }
} 
class Main
{
   public static void main(String a[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Rollno,Name,Marks to be included in academics:");
    int rollno = sc.nextInt();
    sc.nextLine();
    String name = sc.next();
    int mark = sc.nextInt();
    System.out.println("Enter the sports name and score :");
    String sport_name = sc.next();
    int score = sc.nextInt();
    Result r = new Result(rollno,name,mark,sport_name,score);
    r.display();
}
}