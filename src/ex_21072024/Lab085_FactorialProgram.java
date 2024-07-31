package ex_21072024;

import java.util.Scanner;

public class Lab085_FactorialProgram {
    public static void main(String[] args) {
//Factorial of n = n*n-1*...3*2*1 Ex: Fact 5 -> 5*4*3*2*1 = 120
//Logic store factorial number in Fact variable & get the value of n from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Factorial");
        int num = sc.nextInt();
//        initialize
        int fact = 1; // Fact of 0 is also 1 as per math logic. So set fact as 1
        int i = 1;
        while (i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of "+num+" is: " +fact );

    }
}
