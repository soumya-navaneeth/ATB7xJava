package July2024.ex_27072024;

import java.util.Scanner;

public class Lab097_AvgMarksArray {
    public static void main(String[] args) {
        // Where we take the user input of the 5 subjects - Avg of the subject.
        // Figure inputs - float, scanner class

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        //input to array using For Loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of the sub " +(i + 1)); //As index starts from 0, to show as subject 1
            marks[i] = sc.nextFloat();
        }

//  Optionally, you can reprint out the marks to verify input
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of sub " + (i + 1) + ": " + marks[i]);
        }

//  Calculate the Average of all the marks
        float total = (marks[0]+ marks[1]+ marks[2]+ marks[3]+ marks[4]);
        System.out.println("Total Marks: " +total);
        float avg = (marks[0]+ marks[1]+ marks[2]+ marks[3]+ marks[4])/5;
        System.out.println("Avg is -> "+avg);

//        int j = 0;
//        while (j < marks.length){
//            System.out.println(marks[j]);
//            j++;
//        }

        sc.close();

    }
}
