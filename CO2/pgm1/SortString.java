import java.lang.reflect.Array;
import java.util.*;

class StringArray{
    int limit;
    String[] str;

    StringArray(int limit){
        this.limit = limit;
        str = new String[limit];
    }

    void CreateArray(Scanner read){
        System.out.println("Enter the elements : ");
        for (int i=0; i<limit; i++)
        {
            str[i] = read.nextLine();
        }
    }

    void SortString(){
        Arrays.sort(str);
        // System.out.print(Arrays.toString(str)+"\n");
        System.out.println("\n____________________________\n\nAfter sorting:\n____________________________\n");
        for (int i=0; i<limit; i++)
        {
            System.out.println( str[i]); 
        }
    }
}

public class SortString{
    public static void main(String args[]){
        int limit;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the limit:");
        limit = read.nextInt();
        read.nextLine();
        StringArray sa = new StringArray(limit);
        sa.CreateArray(read);
        sa.SortString();
    }
}