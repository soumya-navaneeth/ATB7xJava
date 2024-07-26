package ex_20072024;

import java.util.Scanner;

public class Pract001_Triangle {
    public static void main(String[] args) {
/* Write a program that classifies a triangle based on its side lengths.
 Given three input values representing the lengths of the sides, determine
 if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or
 scalene (no sides are equal).
 Use an if-else statement to classify the triangle. */

        //input a,b,c
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of 1st side");
            int a = sc.nextInt();
            System.out.println("Enter length of 2nd side");
            int b = sc.nextInt();
            System.out.println("Enter length of 3rd side");
            int c = sc.nextInt();

            //if a=b=c -> Equilateral OR if a=b -> Isosceles Else Scalene
            if (a == b && b == c)
                System.out.println("Triangle is: Equilateral");
            else if (a == b || a == c || b == c)
                System.out.println("Triangle is: Isosceles");
            else
                System.out.println("\nTriangle is: Scalene");

            sc.close();

        }
    }
