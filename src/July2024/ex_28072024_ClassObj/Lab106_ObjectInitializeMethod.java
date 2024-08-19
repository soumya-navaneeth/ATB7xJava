package July2024.ex_28072024_ClassObj;

public class Lab106_ObjectInitializeMethod {
//    This is to show the Object initialization through method created in the class
//  StudentClass used here
    public static void main(String[] args) {
        Employee s1 = new Employee(); // Hierarchical ref Variable s1 for the Object is created
        Employee s2 = new Employee(); // Hierarchical ref Variable s2 for the Object is created
        s1.insertRecord(222,"Soumya"); // Method is created in class & passing parameter to that class
        s2.insertRecord(333,"Bhavani");
        s1.displayInformation(); // Calling the methods from Class EmployeeCons
        s2.displayInformation();
    }
}
