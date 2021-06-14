import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args){
        int i, limit, large=0;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the limit:");
        limit = read.nextInt();
        int[] products = new int[limit];
        System.out.println("Enter array elements:");
        for (i = 0; i < limit; i++) {
            products[i] = read.nextInt();
            large = products[i] > large ? products[i] : large ;
        }
        System.out.println("\nLargest element in the array is :"+ large);
    }
}
