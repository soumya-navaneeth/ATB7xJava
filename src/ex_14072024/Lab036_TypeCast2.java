package ex_14072024;

public class Lab036_TypeCast2 {
    public static void main(String[] args) {
        int fees = 100;
        float GST = 18.456F;
//        int total_price = fees+GST; // Implicit Narrowing - JVM
        int total_price = fees +(int)GST; // Explicit narrowing - REAL time - money loss
        float actual_total = fees+GST;

        System.out.println("Total Price is: " + total_price); //Fractional Part is lost
        System.out.println("Actual Total Price is: " + actual_total); //Fractional Part is retained

    }
}
