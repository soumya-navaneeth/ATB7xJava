package July2024.ex_20072024;

import java.util.Scanner;

public class Lab069_SwitchYield {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Char 'A' or 'B'");
        char code = sc.next().charAt(0);
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66; // return
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
        sc.close();

    }
}
