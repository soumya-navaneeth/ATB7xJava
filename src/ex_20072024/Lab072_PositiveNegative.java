package ex_20072024;

import java.util.Scanner;

public class Lab072_PositiveNegative {
    public static void main(String[] args) {
//        Find if the number is Positive,Negative or Zero

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        float num = sc.nextFloat();
//  if n= 0 -> 0, if n<0 -> negative, if n> 0 -> Positive
        if (num == 0)
            System.out.println("The number is zero");
        else if (num < 0)
            System.out.println("The number is Negative");
        else
            System.out.println("The number is Positive");

        sc.close();
    }
}
