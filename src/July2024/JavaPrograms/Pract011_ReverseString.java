package July2024.JavaPrograms;

import java.util.Scanner;

public class Pract011_ReverseString {
    public static void main(String[] args) {
//  Logic s1=abcde Result:edcba
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be reversed");
        String s1 = sc.next().toString();
        String result = "";
        for (int i=s1.length()-1; i >=0 ; i--)
        {
            result = result+s1.charAt(i); // Start from Char at last till 0 index

        }
        System.out.println("Reversed String is: " +result);
    }
}
