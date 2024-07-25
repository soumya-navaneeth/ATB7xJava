package ex_14072024;

public class Lab053_TernaryOperator {
    public static void main(String[] args) {
/* Conditional Operator. Ternary operator (? :) consists of three operands.
 Can be used instead of the if-else statement
 Syntax: variable = (condition) ? expression1 : expression2
*/
    //Example 1
    int x, y;
    x = 20;
    y = (x == 1) ? 61: 90;
    System.out.println("Value of y is: " +  y);
    y = (x == 20) ? 61: 90;
    System.out.println("Value of y is: " + y);

    //Example 2
    int a1 = (30>40) ? 10: 20;
    System.out.println(a1);

    String str= (10 > 20) ? "TEN" : "TWENTY";
    System.out.println(str);


    }
}
