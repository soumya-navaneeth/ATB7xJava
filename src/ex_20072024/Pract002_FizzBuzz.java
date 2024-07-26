package ex_20072024;

import java.util.Scanner;

public class Pract002_FizzBuzz {
    public static void main(String[] args) {
/* Write a program that prints numbers from 1 to 100.
 multiples of 3, print "Fizz" and for multiples of 5, print "Buzz."
 For numbers that are multiples of both 3 and 5, print "FizzBuzz." */
// Logic: For Loop 1-100, if n%3=0 Fizz ; n%5=0 Buzz n%3 == 0 & n%5==0 -> Fizzbuzz

        System.out.println("Enter the End Value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            if (i % 3 == 0 && i % 5 == 0)  //maximum condition should always be the 1st condition.
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i); // if nothing matches then Print the Number itself
            sc.close();
        }
    }
}