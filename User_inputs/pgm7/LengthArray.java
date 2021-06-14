import java.util.Scanner;

public class LengthArray{
    public static void main( String[] args) {
        int i, limit;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the limit:");
        limit = read.nextInt();
        int[] products = new int[limit];
        System.out.println("Enter array elements:");
        for (i = 0; i < limit; i++) {
            products[i] = read.nextInt();
        }
        System.out.println("\nThe length of the Array is :"+ products.length);
    }
}