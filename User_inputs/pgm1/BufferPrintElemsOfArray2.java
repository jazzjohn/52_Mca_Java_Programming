import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferPrintElemsOfArray2 {
    public static void main(String[] args) throws IOException {
        int i, limit;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the limit:");
        limit = Integer.parseInt(read.readLine());
        String[] products = new String[limit];
        System.out.println("Enter the names of devices:");
        for(i=0; i < limit; i++){
            products[i] = read.readLine();
        }
        System.out.println("\nGiven Devices are:");
        System.out.println("__________________");
        for (i=0; i<limit; i++)
        {
            System.out.println(products[i]);
        }

    }
}
