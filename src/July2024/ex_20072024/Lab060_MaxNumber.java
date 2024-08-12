package July2024.ex_20072024;

import java.util.Scanner;

public class Lab060_MaxNumber {
    public static void main(String[] args) {
//  Find the Max among 2 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 1st number");
        int b = sc.nextInt();

        //a>b then a, else if b>a then b, else equal
        if (a>b)
            System.out.println("The largest number is: " +a);
        else if (b>a)
            System.out.println("The largest number is: " +b);
        else System.out.println("Both numbers are Equal");

        sc.close();

    }
}
