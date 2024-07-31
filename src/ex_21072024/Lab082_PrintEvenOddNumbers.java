package ex_21072024;

import java.util.Scanner;

public class Lab082_PrintEvenOddNumbers {
    public static void main(String[] args) {
//        Ask user for upper limit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit");
        int num = sc.nextInt();
//        for (int i = 0; i <= num; i++) { // i = 0 to 50, times  = 51
//            if (i % 2 == 0) {
//                System.out.println("Even -> " + i);
//                continue;
//            }
//            System.out.println("Odd -> " + i);
//        }
//        Print even numbers
        System.out.println("Even Numbers are:");
        for (int i = 0; i <=num ; i++) {
            if (i % 2 == 0) {  //  For Odd if (i % 2 != 0)
                System.out.println(i);
            }
        }
//        Print Odd Numbers
        System.out.println("Odd Numbers are:");
        for (int i = 0; i <=num ; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
