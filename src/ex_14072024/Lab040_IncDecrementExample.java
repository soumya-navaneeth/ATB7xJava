package ex_14072024;

public class Lab040_IncDecrementExample {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before Expression, value of a is " +a);
        System.out.println("Expression ++a + a++ + a++ value of a is " +(++a + a++ + a++));
        System.out.println("After Expression, value of a is " +a);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
        //  Part ->  C -> a++, Exp3 = 12 , a = 13
        // op ->  exp1+ exp2+exp3
        // a  = 13

    }
}
