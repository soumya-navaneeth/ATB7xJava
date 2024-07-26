package ex_20072024;

import java.util.Scanner;

public class Lab057_IfElse {
    public static void main(String[] args) {
// Conditions in Java: 2 types: Switch , If (If-Else)
// If -Else: is Condition which checks the condition & returns True or False
/* syntax: if (condition ==> true or false)
    }else{ } */

//Example 1
 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Age:");
     int age = sc.nextInt();
 if(age>18)
     System.out.print("Eligible to Vote");
 else
     System.out.println("Not Eligible to Vote");
    }
}
