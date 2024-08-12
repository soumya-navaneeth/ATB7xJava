package July2024.JavaPrograms;

import java.util.Scanner;

public class Pract009_SecondLargest {
    public static void main(String[] args) {
        // Second highest salary without using build function

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salaries");
        int list_sal[] = new int[6];
        for (int i = 0; i < list_sal.length; i++) {
            System.out.println("Enter the Salary of Employee " +(i + 1)); //As index starts from 0, to show as subject 1
            list_sal[i] = sc.nextInt();
        }
        int [] sort_sal = new int[6];

        for (int i = 0; i < list_sal.length-1; i++) {
            for (int j = 0; j < list_sal.length - i - 1 ; j++) {
                if (list_sal[j] > list_sal[j+1]) {
                    // if true swap
                    int temp = list_sal[j];
                    list_sal[j] = list_sal[j+1];
                    list_sal [j+1] = temp;
                }
            }

        }
        for (int i = 0; i < list_sal.length; i++) {
            System.out.println(list_sal[i]);
        }
        System.out.println("Second high salary will be.... "+list_sal[list_sal.length-2]);

    }
}