package July2024.ex_13072024;

public class Lab016_SimpleCalci {
    public static void main(String[] args) {
        // Simple Calci
        int a = 219;
        int b = 39;
        double sum  = a+b;
        int sum1 = a+b;
        double sub  = a-b;
        double mul  = a*b;
        double div  = a/b;
        double mod = a%b;
        int div1  = a/b; //-> If done we will lose the decimal value of the division

        System.out.println("a =219,b=39");

        System.out.printf("Sum in double is %f\n",sum);

        System.out.printf("Sum in integer is %d\n",sum1);

        System.out.printf("Sub is %f\n",sub);

        System.out.printf("Mul is %f\n",mul);

        System.out.printf("Div in Double is %f\n",div);

        System.out.printf("Div in Integer is %d\n",div1);

        System.out.printf("Mod is %f\n",mod);





    }
}
