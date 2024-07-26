package ex_20072024;

import java.util.Scanner;

public class Pract003_LeapYear {
    public static void main(String[] args) {
//  To check if the input year is leap year or not
//  Logic: if n%4=0, then leap year else not leap year

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if (year%4 == 0)
            System.out.println("Year "+year+" is a LEAP YEAR");
        else
            System.out.println("Year "+year+" is a NOT a Leap year");
    }
}
