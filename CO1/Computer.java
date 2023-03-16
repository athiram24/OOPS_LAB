import java.util.Scanner;
class CPU
{
    int price;
    class Processor
    {
        int cores;
        String manufacturer;
        public static class RAM
        {
            int size;
            String manufacturer_RAM;
            public void display()
            {
                System.out.println("CPU Price:"+ O.price);
            }

        }

    }
}
class Computer
{
    public static void main(String arg[])
    {
        Scanner inp = new Scanner(System.in);
        // CPU o = new CPU();
        CPU.Processor.RAM  O = new CPU.Processor.RAM();
        System.out.println("Enter the price of CPU:");
        O.price = inp.nextInt();
        //CPU.Processor o1 =  x.new Processor();
        System.out.println("Enter the number of cores:");
        O.cores = inp.nextInt();
        System.out.println("Enter the manufacturer of Processor:");
        O.manufacturer = inp.next();
       // CPU.Processor.RAM o2 = new CPU.Processor.RAM();
        System.out.println("Enter the size of RAM:");
        O.size = inp.nextInt();
        System.out.println("Enter the manufcturer of RAM:");
        O.manufacturer_RAM = inp.next();








        }
    }                                          
