package Aug2024.ex_04082024_Inheritance.Single.Employee;

import java.util.Scanner;

public class Lab118_Company {
    public static void main(String[] args) {

//        Get employee Details from User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String Name = sc.next();
        System.out.println("Enter the ID");
        int ID = sc.nextInt();
        System.out.println("Enter the Salary");
        float Salary = sc.nextFloat();

//  Calculate the Bonus using function from Super class using QA reference
        float Bonus = QA.calculateBonus(Salary);

//  Show all the Details using function from Sub Class
        QA.showDetails(Name, ID, Salary, Bonus);
    }
}
