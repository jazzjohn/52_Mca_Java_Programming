import java.util.*;

class EmployeeDetails{
    int eNo;
    String eName;
    Double eSalary;
    EmployeeDetails(int no, String name, Double salary){
        eNo = no;
        eName = name;
        eSalary = salary;
    }
}

public class EmpDetails{

    public static EmployeeDetails[] InsertEmployeeDetails(Scanner read){
        int limit, num;
        String name;
        Double salary;
        System.out.print("Enter the number of Employee : ");
        limit = read.nextInt();
        EmployeeDetails[] eObj = new EmployeeDetails[limit];
        for (int i=0; i<limit; i++){
            System.out.print("\nEnter the Employee Number : ");
            num = read.nextInt();
            read.nextLine();
            System.out.print("Enter the Employee Name : ");
            name = read.nextLine();
            System.out.print("Enter the Salary : ");
            salary = read.nextDouble();
            eObj[i] = new EmployeeDetails(num,name,salary);
        }
        return eObj;
    }
    public static void Search(EmployeeDetails[] emp,Scanner read){
        System.out.print("\nEnter the Employee Number to be Searched: ");
        int eNum = read.nextInt();
        for (int i=0 ; i < emp.length; i++){
            if (emp[i].eNo == eNum){
                System.out.println("\tDetails of given Employee:");
                System.out.println("\t____________________________");
                System.out.println("\tEmployee Name: "+ emp[i].eName);
                System.out.println("\tEmployee salary: "+ emp[i].eSalary);
                return;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        EmployeeDetails[] t=InsertEmployeeDetails(read);

        Search(t,read);
    }
}

