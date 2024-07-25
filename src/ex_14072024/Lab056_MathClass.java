package ex_14072024;
import java.lang.Math; // for all Math Functions

public class Lab056_MathClass {
    public static void main(String[] args) {
        double sq = Math.sqrt(2);
        int result = Math.max(10,23);
        System.out.println(sq);
        System.out.println(result);

    // Example 2
        int x = 45;
        int y = 69;

    // Max between 2 numbers
        System.out.println("Max number is:" +Math.max(x,y));

    // Square root of a number
        System.out.println("Squareroot of 45 is:" +Math.sqrt(45));

    //AddExact:returns the sum of its arguments
        System.out.println("Addition of 2 numbers is:" +Math.addExact(x, y));

    //SubtractExact:returns the difference of its arguments
        System.out.println("Difference of 2 numbers is:" +Math.subtractExact(x, y));

    //MultipleExact:returns the multiple of its arguments
        System.out.println("Multiplication of 2 numbers is:" +Math.multiplyExact(x, y));


    }
}
