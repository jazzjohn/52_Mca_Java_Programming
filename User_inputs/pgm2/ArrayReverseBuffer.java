import java.io.*;

public class ArrayReverseBuffer {
    public static void main(String[] args) throws IOException{
        int i,limit;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the limit:");
        limit = Integer.parseInt(read.readLine());
        int[] products = new int[limit];
        System.out.println("Enter Array elements:");
        for(i=0; i < limit; i++){
            products[i] = Integer.parseInt(read.readLine());
        }
        System.out.println("\nArray in reverse order:");
        System.out.println("_________________________");
        for (i = limit-1 ; i >= 0; i--)
        {
            System.out.println(products[i]);
        }

    }
}
