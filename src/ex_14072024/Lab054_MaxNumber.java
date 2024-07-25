package ex_14072024;

public class Lab054_MaxNumber {
    public static void main(String[] args) {
        // Max between two numbers
        int a= 10;
        int b= 20;
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println("Max number is; " +max);
        System.out.println("Min number is; " +min);
    }
}
