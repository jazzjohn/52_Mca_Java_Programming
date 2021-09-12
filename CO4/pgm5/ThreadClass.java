import java.util.*;
import java.lang.*;

class MultiplicationTable extends Thread {
    int num;

    MultiplicationTable(Scanner read) {
        System.out.print("\nEnter the number for multiplication table: ");
        num = read.nextInt();
    }

    synchronized public void multiplication() {
        System.out.println("\nMultiplication table of " + num + " : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + num + " = " + (i * num));
        }
    }

    @Override
    public void run() {
        multiplication();
    }
}

class primeNumbers extends Thread {
    int limit;

    primeNumbers(Scanner read) {
        System.out.print("\nEnter the limit for prime numbers: ");
        limit = read.nextInt();
    }

    synchronized public void prime() {
        System.out.println("\nThe prime numbers upto " + limit + " is : \n");
        for (int i = 2, count = 1; count <= limit; i++) {
            int flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
                count += 1;
            }
        }

    }

    @Override
    public void run() {
        prime();
    }
}

public class ThreadClass {
    public static void main(String[] ars) {
        Scanner read = new Scanner(System.in);
        MultiplicationTable mObj = new MultiplicationTable(read);
        primeNumbers pObj = new primeNumbers(read);
        mObj.start();
        pObj.start();
    }
}
