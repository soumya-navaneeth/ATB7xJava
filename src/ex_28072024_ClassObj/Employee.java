package ex_28072024_ClassObj;

public class Employee {
    int EmpID;
    String name;

    void insertRecord(int r, String n) {
        EmpID = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(EmpID + " " + name);
    }
}

