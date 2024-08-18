package Aug2024.ex_04082024;

public class Lab110_DefaultCons {
    public static void main(String[] args) {
        System.out.println("\nBefore Adding values");
        EmployeeCons e1 = new EmployeeCons(); // This calls the Class but since Cons is available it is called
//      add Values
        e1.EmpCode = 123;
        e1.EmpName = "Soumya";
        e1.EmpDept = "QA";
//Print the value after Initialization
        System.out.println("\nAfter Adding values");
        System.out.println("Employee Code:" + e1.EmpCode);
        System.out.println("Employee Name:" + e1.EmpName);
        System.out.println("Employee Dept:" +e1.EmpDept);

    }

}
