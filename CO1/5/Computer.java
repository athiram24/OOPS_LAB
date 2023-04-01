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
           
        }

    }
}
class Computer
{
    public static void main(String arg[])
    {
            Scanner inp = new Scanner(System.in);
            CPU cpu = new CPU();
            System.out.println("Enter the price of CPU:");
            cpu.price = inp.nextInt();
            CPU.Processor pro =    cpu.new Processor();
            System.out.println("Enter the number of cores:");
            pro.cores = inp.nextInt();
            System.out.println("Enter the manufacturer of Processor:");
            pro.manufacturer = inp.next();
            CPU.Processor.RAM ram = new CPU.Processor.RAM();
            System.out.println("Enter the size of RAM:");
            ram.size = inp.nextInt();
           System.out.println("Enter the manufcturer of RAM:");
           ram.manufacturer_RAM = inp.next();
           System.out.println("PRICE :"+ cpu.price);
           System.out.println("No of Cores :"+ pro.cores);
           System.out.println("Manufacturer_Processor :"+ pro.manufacturer);
           System.out.println("RAM size :"+ ram.size);
           System.out.println("Manufacturer_RAM :"+ ram.manufacturer_RAM);








        }
    }                                          
