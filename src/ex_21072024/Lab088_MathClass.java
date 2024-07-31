package ex_21072024;

import java.util.Scanner;

public class Lab088_MathClass {
    public static void main(String[] args) {
//  Java Math class provides several methods to work on math calculations
//  Pre-built Block of code which we can reuse.

//  Math functions
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        // return the maximum of 2 numbers
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));

        // return Minimum of 2 numbers
        System.out.println("Minimum of x & y is: " +Math.min(x,y));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        //returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));

//        Math operations which supports only int/long
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nenter 2 Integer numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
    // Adds the 2 Int/long numbers
         System.out.println("Add exact of a & b is: " +Math.addExact(a,b));
    // Subtract the 2 Int/long numbers
        System.out.println("Subtract exact of a & b is: " +Math.subtractExact(a,b));
    // Multiply the 2 Int/long numbers
         System.out.println("Multiplication exact of a & b is: " +Math.multiplyExact(a,b));
   // Divide the 2 Int/long numbers
         System.out.println("Division exact of a & b is: " +Math.divideExact(a,b));


    }
}
