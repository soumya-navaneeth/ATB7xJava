package ex_14072024;

public class Lab039_IncreDecrementExamp {
    public static void main(String[] args) {
//  increment and decrement operators can only be used with integer types in Java

//  Example 1
        int x = 5;
        int result = x++ * 2 + 3; // 5 * 2 + 3 = 13
        System.out.println("Result of Arithmetic expression:x++ * 2 + 3 is " +result);

//  Example 2
        int s = 5;
        int result1 = ++s + s--; // (5+1)+ 6 = 12
        int result2 = ++s + --s; // (5+1)+ 5 = 11
        System.out.println("Result of expression: ++s + s-- is " +result1);
        System.out.println("Result of expression: ++s + --s is " +result2);
        System.out.println("value of s is: " +s);
        System.out.println("Result of expression: --s - ++s is " +(--s - ++s)); //(5-1) - (1+4) = -1




    }
}
