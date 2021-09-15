import java.util.*;

class Person
{
    String name,gender,address;

    int age;

    Person(String name,String gender, String address,int age)
    {
        this.name = name;

        this.gender = gender;

        this.address = address;

        this.age = age;
    }
}

class Employee extends Person
{
    String empId,companyName,qualification;

    Double salary;

    Employee(String empId,String companyName, String qualification,Double salary,String name,String gender, String address,int age)
    {
        super(name,gender,address,age);

        this.empId = empId;

        this.companyName=companyName;

        this.qualification=qualification;
    }
}

class Teacher extends Employee
{

    String subject,department,teacherId;

    Teacher(String subject, String department, String teacherId,String empId,String companyName, String qualification,Double salary,String name,String gender, String address,int age)
    {
        super(empId,companyName,qualification,salary,name,gender,address,age);

        this.subject=subject;

        this.department=department;

        this.teacherId=teacherId;
    }

    void display()
    {
        System.out.println("\t\t\tName of Employee : "+ name);

        System.out.println("\t\t\tGender : "+ gender);

        System.out.println("\t\t\tAddress : "+ address);

        System.out.println("\t\t\tAge : "+ age);

        System.out.println("\t\t\tEmployee id : "+ empId);

        System.out.println("\t\t\tCompany Name : "+ companyName);

        System.out.println("\t\t\tQualification : "+ qualification);

        System.out.println("\t\t\tEmployee Salary : "+ salary);

        System.out.println("\t\t\tTeacher Id : "+ teacherId);

        System.out.println("\t\t\tDepartment : "+ department);

        System.out.println("\t\t\tSubject Taught : "+ subject);

        System.out.println("\t\t___________________________________\n");
    }
}

public class MultiInheritance
 {
    static Teacher[] insertDetails(Scanner read)
    {
        int limit,age;

        String empId,name, add,dept,sub,cname,gender,ql,tid;

        Double salary;

        System.out.print("Enter the no of Teachers :");

        limit=read.nextInt();
        read.skip("((?<!\\R)\\s)*"); // skip whitespace, stopping after any newline 


        Teacher[] t = new Teacher[limit];

        for(int i=0; i<limit; i++)
        {
            System.out.print("\n\n______________________________\n\nEnter the Details of Teacher "+(i+1)+"\n______________________________\n\n");

            System.out.print("\nEnter the Employee Id : ");
            empId = read.next();
            read.skip("((?<!\\R)\\s)*"); // skip whitespace, stopping after any newline 

            System.out.print("Enter the Name : ");
            name = read.nextLine();
            read.skip("((?<!\\R)\\s)*"); 

            System.out.print("\nEnter the Address : ");
            add = read.nextLine();
            read.skip("((?<!\\R)\\s)*"); 

            System.out.print("\nEnter the Age : ");
            age = read.nextInt();
            read.skip("((?<!\\R)\\s)*"); 

            System.out.print("\nEnter the Gender : ");
            gender = read.next();
            read.skip("((?<!\\R)\\s)*"); 

            System.out.print("\nEnter the Company Name : ");
            cname = read.nextLine();
            read.skip("((?<!\\R)\\s)*"); 

            System.out.print("\nEnter the Qualification : ");
            ql = read.nextLine();
            read.skip("((?<!\\R)\\s)*"); 

            System.out.print("\nEnter the Salary : ");
            salary = read.nextDouble();
            read.skip("((?<!\\R)\\s)*"); 

            System.out.print("\nEnter the Department : ");
            dept = read.nextLine();
            read.skip("((?<!\\R)\\s)*"); 

            System.out.print("\nEnter the Subject taught by the teacher : ");
            sub = read.nextLine();
            read.skip("((?<!\\R)\\s)*"); 

            System.out.print("\nEnter the Teacher Id : ");
            tid = read.next();
            read.skip("((?<!\\R)\\s)*"); 

            t[i] = new Teacher(sub,dept,tid,empId,cname,ql,salary,name,gender,add,age);
        }

        return t;
    }
    static void displayDetails(Teacher[] t)
    {
        for(int i=0;i<t.length;i++)
        {
            System.out.println("\n\t\t\tDetails of a Teacher "+(i+1));

            System.out.println("\t\t___________________________________\n");

            t[i].display();
        }
    }
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        Teacher[] t=insertDetails(read);

        displayDetails(t);
    }
}

