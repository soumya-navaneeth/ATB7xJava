package ex_20072024;

import java.util.Scanner;

public class Lab065_CheckVowel2 {
    public static void main(String[] args) {
// Other way for declaring Case
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Letter");
        char user_input = sc.next().charAt(0);
        switch (user_input) {
            case 'a', 'i', 'o', 'u', 'e', 'A', 'E', 'I', 'O', 'U':
                System.out.println("Letter is Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");
                sc.close();

        }
    }
}

