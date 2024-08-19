package Aug2024.ex_04082024;

import java.util.Scanner;

public class Lab113_BankParam {
    public static void main(String[] args) {


        BankAccount ba1 = new BankAccount(); // Calls Default Constructor since no parameters

//  Get the User Input for next Values
        System.out.println("\nParameter Constructors");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Account Balance!");
        int bBal = sc.nextInt();
        System.out.println("Enter the Bank Code!");
        String bCode = sc.next();

        BankAccount ba2 = new BankAccount(bName, bBal, bCode); // Send tht as parameters to BankAccount Class
        ba2.printDetails();

        BankAccount ba3 = new BankAccount("IOB", 200); // Calls constructor with 2 parameters
        System.out.println("\nBank3 Details");
        ba3.printDetails();


        sc.close();


    }

}
