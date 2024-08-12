package July2024.JavaPrograms;

import java.util.Scanner;

//Logic: Reverse the String & compare with Original, if equal thn Palindrome else No
public class Pract012_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.next().toString();
        String result = "";
        for (int i=s1.length()-1; i >=0 ; i--)
        {
            result = result+s1.charAt(i); // Start from Char at last till 0 index

        }
        if (s1.equalsIgnoreCase(result)){
            System.out.println("String "+s1+ " is a Palindrome");
        } else
            System.out.println("String "+s1+ " is not a Palindrome");
    }
}
