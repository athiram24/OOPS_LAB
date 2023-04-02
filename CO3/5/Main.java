import java.util.*;
class Student
{
    int rollno;
    String name;
    Float mark;
    public Student(int rollno, String name, Float mark) {
        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
    }
    void display()
    {
        System.out.println("Rollno:"+rollno+"\nName:"+name+"\nMark:"+mark);
    }
    
}
class Sports
{
    int sportsid;
    int  score;
    Sports(int sportsid, int score)
     {
        this.sportsid = sportsid;
        this.score = score;
    }
    public void display()
    {
        System.out.println("Sports Id:"+sportsid+"\nScore:"+score);
    }
    
}
class Result extends Student , Sports
{
    //int Totalscore;
      Result(int rollno, String name, Float mark,int sportsid,int score)
    {
    super(rollno, name, mark);
    Sports s = new Sports(sportsid,score);
    
    //this.Totalscore = Tot_score;

   }
   void display()
   {
    super.display();
    //s.display();
   }
}


class Main
{
   public static void main(String a[])
   {
    Scanner sc = new Scanner(System.in);
    Result r = new Result(1,"Adhi", 34.05f,23,56);
    r.display();
    
    
    
}
}