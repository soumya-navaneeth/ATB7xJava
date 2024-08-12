package July2024.ex_14072024;

public class Lab032_DataTypeResult {
    public static void main(String[] args) {
//  When 2 Different data types are used in expression, it take the largest value for Result
//  For ex: byte+byte = int ; int+long = long; float+long=float
        byte a = 10;
        byte b = 23;
        int c = a+b;
        //result is larger type, if byte is used,then error is thrown possible "lossy conversion from int to byte"
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1+b1; // A & B are char whose ASCII value is considered
        System.out.println("ASCII Value of A is 65");
        System.out.println("ASCII Value of B is 66");
        System.out.println("Sum of A+B is " + c1); //(65+66)
//  Compare Operator
        System.out.println('A' == 65); //returns True as ASCII of A is 65
        System.out.println('B' == 69); //returns False as ASCII of B is 66

//  Example 2
        System.out.println("\nExample 2");
        short s = 10;
        char t = 'A'; //65
        int ss = s+ t;
        System.out.println(ss);
    }
}
