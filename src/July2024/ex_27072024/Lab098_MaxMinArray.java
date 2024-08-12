package July2024.ex_27072024;

import java.util.Scanner;

public class Lab098_MaxMinArray {
    public static void main(String[] args) {
        // Find the Max Salary, Min  in the Salary Array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salaries");
        int salary[] = new int[6];
        for (int i = 0; i < salary.length; i++) {
            System.out.println("Enter the Salary of Employee " +(i + 1)); //As index starts from 0, to show as subject 1
            salary[i] = sc.nextInt();
        }
        int max = salary[0];;
        int min = salary[0];
        for (int i = 0; i < salary.length ; i++) {
            if( salary[i] > max){
                max = salary[i];
            }
            if(min > salary[i]){
                min = salary[i];
            }
        }
        System.out.println("Max Salary of an Employee:" +max);
        System.out.println("Min Salary of an Employee:" +min);


        // Sort -> find the last one -
//        Arrays.sort(salaries);
//        System.out.println(salaries[salaries.length-1]);

    }
}
