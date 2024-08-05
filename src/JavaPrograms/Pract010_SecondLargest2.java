package JavaPrograms;

import java.util.Arrays;

public class Pract010_SecondLargest2 {
    public static void main(String[] args) {

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        // Assuming highest and second highest
        int highest = salaries[0];
        int second_highest = salaries[0];
        int third_highest  = salaries[0];

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > highest) {
                highest = salaries[i];
            } else if (salaries[i] > second_highest) {
                second_highest = salaries[i];
            } else if (salaries[i] >third_highest) {
                third_highest = salaries[i];
            }

        }
        System.out.println("Highest salary: " + highest);
        System.out.println("Second Highest salary: " + second_highest);
        System.out.println("Third Highest salary: " + third_highest);


        // Alternate way using sort function

        Arrays.sort(salaries);

        int highestSal = salaries[salaries.length-1];
        int secondHighestsal = salaries[salaries.length-2];
        int thirdHighestsal = salaries[salaries.length-3];

        System.out.println("--------------Using Sort function---------------");
        System.out.println("Highest salary: " + highestSal);
        System.out.println("Second Highest salary: " + secondHighestsal);
        System.out.println("Third Highest salary: " + thirdHighestsal);

    }
}

