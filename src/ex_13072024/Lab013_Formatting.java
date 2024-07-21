package ex_13072024;

public class Lab013_Formatting {
    public static void main(String[] args) {
        //Formatting: This is used to replace the value of the variable.
        /* %d used for any integer - byte, short, int or long
         %s -> String
         %c -> char
         %f -> float,double
        */
        int age = 98;
        float pi = 3.14F;
        double doub = 23422;
        short shor = 222;
        Long lon = 2985469700000L;
        String s = "soumya";
        char ch = 'S';     // Single quotes used while declaring a char
        char char1='a';

        System.out.println("You age is -> " + age);
        //the same can be printed as below:
        System.out.printf("You age is %d\n",age); //printf should be used instead of println
        System.out.printf("Value of pi is %f\n",pi);
        System.out.printf("Value of Double is %f\n",doub);
        System.out.printf("Value of Long is %d\n",lon);
        System.out.printf("Value of string is %s\n",s);
        System.out.printf("Value of Short is %d\n",shor);
        System.out.printf("Value of Char is %c\n",ch);
        System.out.printf("Value of Char1 is %c\n",char1);



    }
}
