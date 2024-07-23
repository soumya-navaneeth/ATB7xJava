package ex_14072024;

public class Lab033_TypeCasting {
    public static void main(String[] args) {

/*  --------------------Narrowing-------------------->
      double -> float -> Long -> int -> short -> byte
    <--------------------Widening--------------------> */

//  Type Casting: Convert a value from one data type to another data type
//  2 Types:
//      Widening - Implicit, Explicit - lossless
//      Narrowing - Implicit, Explicit(with data type), loss

//  Widening
        int x = 7;  //automatically converts the integer type into long type
        long y = x; //automatically converts the long type into float type
        float z = y;
        System.out.println("Widening Type Casting");
        System.out.println("Before conversion, int value "+x);
        System.out.println("After conversion, long value "+y);
        System.out.println("After conversion, float value "+z);

//  Widening Example 2
        byte b=10;
        int a=b; // VALID – Implicit Casting - JVM
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println("\nWidening Type Casting 2");
        System.out.println(a1);

//  Narrowing
        double d = 166.66;
        //converting double data type into long data type
        long l = (long)d;
        //converting long data type into int data type
        int i = (int)l;
        System.out.println("\nNarrowing Type Casting");
        System.out.println("Before conversion: "+d); //fractional part lost
        System.out.println("After conversion into long type: "+l); //fractional part lost
        System.out.println("After conversion into int type: "+i);

//        Narrowing
        System.out.println("\nNarrowing Type Casting 2");
        int val = 300;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);

    }
}
