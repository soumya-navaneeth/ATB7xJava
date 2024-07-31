package ex_21072024;

import java.sql.SQLOutput;

public class Lab087_WhileDoWhile {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("While Loop");
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("\nDo-While Loop");
        do{
            System.out.println(i); //prints 10 once n then checks condition
            i++;
        }while(i<10);

    }
}
