import java.util.Scanner;
import java.util.Stack;
class Main
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of  elements");
        int n = sc.nextInt();
        Stack <Integer>list = new Stack<>();
        //adding elements.......
          for(int i=0;i<n;i++)
          {
            System.out.println("Enter the element "+i);
            list.push(sc.nextInt());
          }
          System.out.println("After inserting...."+list);
        //Removing elements.....
        list.pop();
        System.out.println("List after removing last element:"+list);
        int val = list.peek();//returns peek value ie value at the top
        System.out.println("Value at the top: "+val);

        //Removing elements by specifying index....
        System.out.println("Enter the index to remove the value: ");
        int num = sc.nextInt();
        list.remove(num);
        System.out.println("After removal ..."+list);

        sc.close();
    }
}
