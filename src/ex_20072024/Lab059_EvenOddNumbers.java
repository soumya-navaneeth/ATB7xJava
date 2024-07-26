package ex_20072024;

import java.util.Scanner;

public class Lab059_EvenOddNumbers {
    public static void main(String[] args) {
        // User input number
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //Check if the number is divisible by 2 or not
        if (number % 2 == 0) {
            System.out.println(+number+ " is an Even number");
        } else {
            System.out.println(+number+ " is an Odd number");
            sc.close();
        }
    }
}
