package July2024.ex_28072024_ClassObj;

import java.util.Scanner;

public class Lab107_Building {
    public static void main(String[] args) {


//  Ask for User input & save in a Variable
            Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of builders you want to input");
        int no = sc.nextInt();
        for (int i = 1; i <= no; i++)
        { // get user input for Builders
            System.out.println("Enter the name of the builder "+i);
            String nam = sc.next();
            System.out.println("Enter the no. of Floors");
            int flr = sc.nextInt();
            System.out.println("Enter the city");
            String cit = sc.next();

            Building bu1 = new Building(); //  Create Object for Building Class
            bu1.name = nam;  // Assign the user inputs to Building Ref Variables
            bu1.floor = flr;
            bu1.city = cit;
            bu1.printdetails(); // Use print function in Building Class
            System.out.println("\n");
//            bu1.useLift();
//            bu1.activities();

        }
        sc.close();

    }
}
//functions - perform a task , block of code
// functions within the class are called -> methods?
// class -> blueprint
// object ->  real entity created from the class. / instance of the class.











