package July2024.ex_14072024;

public class Lab037_Increment {
    public static void main(String[] args) {
//      Unary Operator: Increment (++) / Decrement (--) Operators
//      Prefix: increments the value of the variable BEFORE the value is used in the expression
        int a = 3;
        int b = ++a;  // Now, a is 4 and b is also 4
        System.out.println("Value of a is: " +a);
        System.out.println("Value of b is: " +b);
//      Example 2:
        int x = 10;
        System.out.println("\nValue of X before prefix: " +x);
        System.out.println("Prefix value is : " +(++x)); // Exp = 11 , x = 11

//      Postfix: increments the value of the variable AFTER its current value is used in the expression
        int a_post = 10;
        System.out.println("\nValue before postfix: " +a_post);
        System.out.println("Postfix value is : " +(a_post++));
        System.out.println("After postfix value: " +a_post); // Exp = 10 , a = 11

    }
}
