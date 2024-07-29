package ex_20072024;

import java.util.Scanner;

public class Lab073_Largestof3 {
    public static void main(String[] args) {
        //Program to Find the Largest Among Three Numbers:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        float num1 = sc.nextFloat();
        System.out.println("Enter the 2nd number");
        float num2 = sc.nextFloat();
        System.out.println("Enter the 3rd number");
        float num3 = sc.nextFloat();
//  num1 > num2 && num1 > num3 -> num1
//  num2 > num1 && num2 > num3 -> num2
//  num3
        if (num1==num2 && num1 == num3 && num2==num3)
            System.out.println(" All numbers are equal");
        else if (num1 > num2 && num1 > num3)
            System.out.println("Largest number is: " +num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println("Largest number is: " +num2);
        else
            System.out.println("Largest number is: " +num3);
        sc.close();
    }
}
