import java.util.Scanner;

class PrintElemsOfArray1 {
    public static void main(String[] args){
        int i, limit;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the limit:");
        limit = read.nextInt();
        read.nextLine();
        String[] products = new String[limit];
        System.out.println("Enter the names of devices:");
        for(i=0; i < limit; i++){
            products[i] = read.nextLine();
        }
        System.out.println("\nGiven Devices are:");
        System.out.println("__________________");
        for (i=0; i<limit; i++)
        {
            System.out.println(products[i]);
        }

    }
}
