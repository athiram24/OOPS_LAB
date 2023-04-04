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
    String Author;
    Float price;
    int No_of_pages;
    public Book(String publisher_name, String author, Float price, int no_of_pages) 
    {
        super(publisher_name);
        Author = author;
        this.price = price;
        No_of_pages = no_of_pages;
    }
    

}
class Literature extends Book
{
    String Bookname;
    String literature_type;
    public Literature(String publisher_name, String author, Float price, int no_of_pages, String bookname,
            String literature_type)
    {
        super(publisher_name, author, price, no_of_pages);
        Bookname = bookname;
        this.literature_type = literature_type;
    }
    


}
class Fiction extends Book
{
    String name;
    String Fiction_type;
    public Fiction(String publisher_name, String author, Float price, int no_of_pages, String name,
            String fiction_type)
    {
        super(publisher_name, author, price, no_of_pages);
        this.name = name;
        Fiction_type = fiction_type;
    }
    

}
class Main
{
    
    public static void main(String a[])
    {
    int c;
    Scanner sc = new Scanner(System.in);
    do
    {
        System.out.println("Enter the choice:\n1.Literature\n2.Fiction:");
        c = sc.nextInt();
        
    //     switch(c)
    //     {
    //         case 1:System.out.println("Enter the book ,publisher name ");

    //     }

    // }while(c!=0);

    

    }

   
}