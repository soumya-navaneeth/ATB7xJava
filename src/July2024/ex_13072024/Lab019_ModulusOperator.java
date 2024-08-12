package July2024.ex_13072024;

public class Lab019_ModulusOperator {
    public static void main(String[] args) {
/*
        Modulus Operator: It is used to determine the remainder.
        difference between modulo and division operators is that the modulo (%) operator gives the remainder
        while the division (/) operator gives the quotient.
*/
        double a = 34;
        double b = 10;
        double result = a%b; // Modulus - operator - Reminder
        System.out.println("Reminder:" +result);
        System.out.println("Division/Quotient:" +(a/b));

//        10 |  34 | 3 - Quotient
//           |  30 |
//            ______
//                4 - Remainder
        System.out.println("\n");
        double c=8.9, d=2.7, remainder;
        remainder = c%d;
        System.out.println("Remainder: "+remainder);
        System.out.println("Division/Quotient:" +(c/d));

    }
}
