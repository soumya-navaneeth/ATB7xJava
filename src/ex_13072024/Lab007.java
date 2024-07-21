package ex_13072024;

public class Lab007 {
    public static void main(String[] args) {

        // data_type variable_name = variable_value(literal)
        // Data Type: Primitive Data Type & Non Primitive

        // 1.Boolean -> true or false
        System.out.println("Boolean Type");
        boolean is_married = true;
        boolean are_you_a_dog = false;
        System.out.println("Are you married? " + is_married);
        System.out.println("Are you a Dog? " + are_you_a_dog);
        System.out.println("\n");

        // 2. Numeric: 2 Types -> Numeric & Floating
        // A.integral - byte, short, int, long,char
        System.out.println("Numeric Type");
        byte b  = 100;
        short s = 101;
        int age = 130;
        long phone_number = 7892873175L; // 9876543210l; End Long with L always
        char grade  = 'A'; // O,A,B,C,D,E, F = Fail
        //  char - char  - A,B :char is also an Integer type since ASCII value is considered
        System.out.println("Byte value " + b);
        System.out.println("Short value " + s);
        System.out.println("int value " + age);
        System.out.println("long value " + phone_number);
        System.out.println("Char value " + grade);
        System.out.println("\n");

        // B.Floating Point Type:
        // i.float -> End with f
        float pi = 3.14f; // 3.14F;
        // ii. double -> end with d
        double d = 234.567;
        System.out.println("Float Type: " +pi);
        System.out.println("Double Type: " +d);
        System.out.println("\n");

        // Non primitive Data Types
        // String  name -> "Soumya" -, number or char or bunch of char
        String name = "Soumya";
        String name2 = "p";
        // char cc = "c";
        System.out.println("Name is " + name);
        System.out.println("Name2 is " + name2);
    }
}