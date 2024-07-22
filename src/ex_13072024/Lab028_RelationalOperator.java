package ex_13072024;

public class Lab028_RelationalOperator {
    public static void main(String[] args) {
        // Relational Operators: used for comparison & equality; Returns True OR False only
        //< > <= >= == !=
        int a = 10;
        int b = 20;
        int c = 20;
        System.out.println("Greater than:" +(a>b));
        System.out.println("Less than:" +(a<b));
        System.out.println("Equal than:" +(b==c));
        System.out.println("Greater Equal than:" +(b>=a));

//  Compare Values
        System.out.println("\nCompare Values");
        System.out.println( 10 == 10); // == Compare true values
        System.out.println( 10 >= 10); //  10> 10 or 10 = 10
        System.out.println( 10 <= 10); // 10 < 10 or 10 = 10
        System.out.println( 10 > 10);
        System.out.println( 10 < 10);
//  Not Equal to check
        boolean bool = true;
        System.out.println("\nNot Operator !");
        System.out.println(!bool); // Reverse is False
        System.out.println(!!!bool); // 3times revers of True = False
        System.out.println(!(10>20)); // !(false) = True
        System.out.println(!!!!(30>90)); //!!!!(false) = False


    }
}
