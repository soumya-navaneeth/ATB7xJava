package ex_20072024;

import java.util.Scanner;

public class Lab068_Switch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number within 001 - 004");
        int item_code = sc.nextInt();

        switch (item_code) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("No value matched!");
        }
        sc.close();
    }
}
