package July2024.ex_14072024;

public class Lab034_ImplicitTypeCast {
    public static void main(String[] args) {
//  Implicit type casting or widening casting -> smaller data type to the larger type size.
//  Conversion automatically performed by the compiler without the programmer's interference

        byte p = 12;
        System.out.println("byte value : "+p);
        // Implicit Typecasting
        short q = p;
        System.out.println("short value : "+q);
        int r = q;
        System.out.println("int value : "+r);
        long s = r;
        System.out.println("long value : "+s);
        float t = s;
        System.out.println("float value : "+t);
        double u = t;
        System.out.println("double value : "+u);
    }
}
