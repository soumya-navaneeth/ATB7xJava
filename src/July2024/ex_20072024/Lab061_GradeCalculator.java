package July2024.ex_20072024;

import java.util.Scanner;

public class Lab061_GradeCalculator {
    public static void main(String[] args) {
/* Java Program to demonstrate the use of If else-if ladder.
It is a program of grading system for fail, D grade, C grade, B grade, A & A+ grade
based on the following grading scale:
    A+:90-100
    A: 80-89
    B: 70-79
    C: 60-69
    D: 50-59
    F: 0-49   */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");
        float marks = sc.nextFloat();
        // find the grade
        if (marks < 50)
            System.out.println("FAIL");
        else if (marks >= 50 && marks < 60)
            System.out.println("Grade is D");
        else if (marks >= 60 && marks < 70)
            System.out.println("Grade is C");
        else if (marks >= 70 && marks < 80)
            System.out.println("Grade is B");
        else if (marks >= 80 && marks < 90)
            System.out.println("Grade is A");
        else if (marks >= 90)
            System.out.println("Grade is A+");
        else
            System.out.println("Invalid Input");

        sc.close();
    }
}
