package July2024.ex_13072024;

public class Lab026LogicalOperator {
    public static void main(String[] args) {
/*  AND Operator: Logical && ;  Bitwise &
    Logical: Logical && checks the 2nd condition only if the 1st one is TRUE.
    BitWise: Bitwise & always checks BOTH conditions whether first condition is true or false. */
        int a=10;
        int b=5;
        int c=20;
        System.out.println("AND Operator");
        System.out.println((a < b) && (a++ < c));//i.e 10<5&&11<20 -> false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println((a < b) & (a++ < c));//false && true = false
        System.out.println(a);//11 because second condition is checked
//  AND Operator 2nd usage
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F
        System.out.println("\nAND Operator");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

/*  OR Operator: Logical || ; Bitwise |
    Logical: Logical || checks the 2nd condition only if the 1st one is FALSE.
    BitWise: Bitwise & always checks BOTH conditions whether first condition is true or false. */
        System.out.println("\nOR Operator");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nOR Operator 2nd usage");
        System.out.println(a>b||a++<c);//true || true = true
        System.out.println(a);//11 because second condition is checked
        System.out.println(a>b|a++<c);//true | true = true
        System.out.println(a);//12 because second condition is checked
    }
}
