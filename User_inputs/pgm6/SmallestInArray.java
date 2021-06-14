import java.util.Scanner;

public class SmallestInArray {
    public static void main(String[] args){
        int i, limit, small = 9999;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the limit:");
        limit = read.nextInt();
        int[] products = new int[limit];
        System.out.println("Enter array elements:");
        for (i = 0; i < limit; i++) {
            products[i] = read.nextInt();
            small = products[i] < small ? products[i] : small ;
        }
        System.out.println("\nSmallest element in the array is :"+ small);
    }
}
