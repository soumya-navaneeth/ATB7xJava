package ex_27072024;

import java.util.Scanner;

public class Lab093_ArrayPrint {
    public static void main(String[] args) {
        int[] marks = new int[3];
        System.out.println(marks[0]); // Value = 0 since its not initialized
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in); // Take input to array
        System.out.println("Enter the Elements of Array");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//      System.out.println(marks[10]); // Array Out of Bound exception
//  Printing the array using for loop
        System.out.println("Print using For Loop");
        for (int i = 0; i < marks.length; i++) {
            //array.length -> gives the length of the array. <= will give error.
            // i = 0,1,2 (index: 0,1,2 Array length = 3)
            System.out.println( "Index:" +i+ " ->" + marks[i]);
        }
        sc.close();
    }
}
