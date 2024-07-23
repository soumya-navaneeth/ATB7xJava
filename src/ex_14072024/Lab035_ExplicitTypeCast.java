package ex_14072024;

public class Lab035_ExplicitTypeCast {
    public static void main(String[] args) {
//  Explicit type casting or narrowing casting -> higher data type into a lower one
//  Done manually by the programmer. If we do not perform casting then the compiler reports a compile-time error.
//  double -> float -> long -> int -> char -> short -> byte

        double d = 309.8765;
//converting double data type into long data type
        long l = (long)d;
//converting long data type into int data type
        int i = (int)l;
        System.out.println("Before conversion: "+d);
//fractional part lost
        System.out.println("After conversion into long type: "+l);
//fractional part lost
        System.out.println("After conversion into int type: "+i);
    }
}
