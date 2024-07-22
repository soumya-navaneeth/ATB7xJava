package ex_13072024;

public class Lab024_UnaryOperator {
    public static void main(String[] args) {
//  Unary:operators require only one operand
//  ++expr --expr +expr -expr ~ ! -> Increment,Decrement,negating,inverting
        int x=10;
        System.out.println(x++);// Print & increment -> 10 (11)
        System.out.println(++x);//Increment & Print -> 12
        System.out.println(x--);//Print & Decrement -> 12 (11)
        System.out.println(--x);//Decrement & Print -> 10
//2nd Usage
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
//  Negate & Invert
        int s=10;
        int t=-10;
        boolean u=true;
        boolean v=false;
        System.out.println(~s); //Negate the value -> -11 (minus of total positive value which starts from 0)
        System.out.println(~t); //9 (positive of total minus, positive starts from 0)
        System.out.println(!u); //false (opposite/invert of boolean value)
        System.out.println(!v); //true
    }
}
