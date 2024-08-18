package Aug2024.ex_04082024;

public class EmployeeCons {
// This is a class which has constructor also. It can have methods + Constructor also

    int EmpCode; // Instance Variables within class
    String EmpName;
    String EmpDept;

 //Default Constructor -> this is called when the Class EmployeeCons is called from any other Program
  EmployeeCons(){
      System.out.println("Hi, I will be called, Object is created!");
      System.out.println("Employee Code:" +EmpCode);
      System.out.println("Employee Name:" + EmpName);
      System.out.println("Employee Dept:" +EmpDept);
  }
}
