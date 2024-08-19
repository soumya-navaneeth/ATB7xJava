package Aug2024.ex_04082024_Inheritance.Single.Employee;

// Dept QA IS A part of Employee, hence it extends Employee

public class QA extends Employee {

    static String Dept = "QA"; // assign Dept to instance Variable

//    Function to show the Employee Details
    public static void showDetails(String n, int Id,float s,float b)
    {
        System.out.println("Name:" +n);
        System.out.println("Id:" +Id);
        System.out.println("Dept:" +Dept);
        System.out.println("Salary:" +s);
        System.out.println("Bonus:" +b);
    }
}
