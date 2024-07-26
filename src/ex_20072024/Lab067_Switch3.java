package ex_20072024;

import java.util.Scanner;

public class Lab067_Switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any nummber within 001 - 007");
        int itemcode  = sc.nextInt();
        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004, 005, 007:
                System.out.println("It is Mechanical Gadget!");
                break;
            default:
                System.out.println("Not the Both");
                sc.close();

        }
    }
}
