package July2024.ex_20072024;

import java.util.Scanner;

public class Lab064_CheckVowel {
    public static void main(String[] args) {
//  Check if the entered char is Vowel or Consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Letter");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println("Letter is a Vowel");
                break;
            case 'A':
                System.out.println("Letter is a Vowel");
                break;

            case 'e':
                System.out.println("Letter is a Vowel");
                break;
            case 'E':
                System.out.println("Letter is a Vowel");
                break;

            case 'i':
                System.out.println("Letter is a Vowel");
                break;
            case 'I':
                System.out.println("Letter is a Vowel");
                break;

            case 'o':
                System.out.println("Letter is a Vowel");
                break;
            case 'O':
                System.out.println("Letter is a Vowel");
                break;

            case 'u':
                System.out.println("Letter is a Vowel");
                break;
            case 'U':
                System.out.println("Letter is a Vowel");
                break;

            default:
                System.out.println("Consonant");
                sc.close();

        }
    }
}
