package ex_21072024;
//  1.Without Parameters and Without Return Type
// 2.Without Parameters but With Return Type
// 3.With Parameters and Without Return Type
// 4. With Parameters and With Return Type
/* These functions should be created outside the main method & then called inside main method */

import java.util.Scanner;

public class Lab090_FunctionTypes {
//    Defining the Functions outside main()
    //  1.Without Parameters and Without Return Type
    static void function_type1() {
        System.out.println("1.Without Parameters and Without Return Type");
    }

    // 2.Without Parameters but With Return Type
    static String function_type2() {
        System.out.println("2.Without Parameters but With Return Type");
        return "Returned Value";
    }

    // 3.With Parameters and Without Return Type
    static void function_type3(String name) { //We pass the Parameter to Function i.e name
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("You name is: " + name);
    }


    // 4. With Parameters and With Return Type
    static int function_type4(int a, int b) {
        System.out.println("4. With Parameters and With Return Type");
        return a + b;
    }

// Calling the Functions within Main()
    public static void main(String[] args) {
        System.out.println("This is Function1");
        function_type1();
        System.out.println( " --------------- ");

        String name = function_type2();
        System.out.println(name);
        System.out.println( " --------------- ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String myname = sc.next();
        function_type3(myname);
        System.out.println( " --------------- ");

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 2 Integer numbers");
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int sum_result = function_type4(a,b);
        System.out.println("Sum of a & b is: "+sum_result);



    }
}