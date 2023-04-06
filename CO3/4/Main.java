import java.util.Scanner;
class Publisher
{
    String publisher_name;

    public Publisher(String publisher_name)
     {
        this.publisher_name = publisher_name;
    }

    
}
class Book extends Publisher
{
    String Title;
    String Author;
    Float price;
    public Book(String publisher_name, String Title, String Author, Float price) {
        super(publisher_name);
        this.Title = Title;
        this.Author = Author;
        this.price = price;
    }
    void display()
    {
        System.out.println("---------\nPublisher Name:"+publisher_name+"\nTitle:" +Title+"\nAuthor:"+Author+"\nPrice :"+price);
    }

   
    

}
class Literature extends Book
{
    //String Bookname;
    String literature_type;
    String language;
    public Literature(String publisher_name, String title, String author, Float price,  String literature_type, 
    String language)
     {
        super(publisher_name, title, author, price);
        this.literature_type = literature_type;
        this.language = language;
    }
    void display()
    {
        super.display();
        System.out.print("Literature type:"+literature_type +"\nLanguage :"+language+"\n-----------");
    }

   


}
class Fiction extends Book
{
    String name;
    String Genre;
    public Fiction(String publisher_name, String title, String author, Float price, String name, String Genre)
     {
        super(publisher_name, title, author, price);
        this.name = name;
        this.Genre = Genre;
    }
    void display()
    {
        
            super.display();
            System.out.println("Name :" + name + "\n Genre :" +Genre+"\n--------");

    }

    
    

}
class Main
{
    
    public static void main(String a[])
    {
    int c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the details:");
    System.out.println("Enter the publisher name,title,author and price(for all categories) :");
    String pubname = sc.nextLine();
    String title = sc.nextLine();
    String author = sc.nextLine();
    float price = sc.nextFloat();
    sc.nextLine();
    do
    {
        System.out.println("\nChoose your type:\n1.Literature\n2.Fiction:");
        c = sc.nextInt();
        sc.nextLine();
        switch(c)
        {
            case 1:
                    System.out.println("Enter the type,and Language :");
                    String typ =  sc.nextLine();
                    String Lang = sc.nextLine();
                    Literature o1 = new Literature(pubname,title,author,price,typ,Lang);
                    o1.display();
                    break;
                    
            case 2:
                    System.out.println("Enter the book name and genre ");
                    String name = sc.nextLine();
                    //sc.next();
                    String genre = sc.nextLine();
                    Fiction o2 = new Fiction(pubname,title,author,price,name,genre);
                    o2.display();
                    break;
                    
           default: System.out.println("Invalid choice:");

       }
     }while(c!=0);
    


   
    }
}