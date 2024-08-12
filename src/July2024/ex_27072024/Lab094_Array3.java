package July2024.ex_27072024;

import java.util.Scanner;

public class Lab094_Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiples of 2");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * 2);
        }
        int[] a = new int[4];
        a[3] = 90;
        System.out.println(a[2]); // Value = 0 since not initialized
        System.out.println(a[3]); // Value = 90
        System.out.println(a[0]); // Value = 0 since not initialized

        sc.close();
    }
}
