package July2024.ex_20072024;

import java.util.Scanner;

public class Lab062_SwitchCondition {
    public static void main(String[] args) {
/* Switch statement executes one statement from multiple conditions.
   Works with byte, short, int, long, enum types, String
   Case value must be of switch expression type only.
   The case value must be literal or constant not Variables
   Each Switch has Break (Optional).
   Break jumps the control after the switch expression. If a break statement is not found, it executes the next case.
 */
// Find the Day of the Week
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7 to tell the Day of the Week");
        int day = sc.nextInt();
        //Switch Block
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not Valid input");
                break;
        }
        sc.close();

    }
}
