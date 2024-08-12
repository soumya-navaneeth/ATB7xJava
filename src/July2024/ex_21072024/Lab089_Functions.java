package July2024.ex_21072024;

public class Lab089_Functions {
    public static void main(String[] args) {
//  Functions/Methods: is a collection of instructions that performs a specific task.
//  It provides the reusability of code
//  2 Types:
//      1. Pre-built: Ex: Math.max(), Math.min(), Math.addExact()
//      2. User Defined
/*  Component/Syntax of the Function:
        1. Define
        2. Call the function */

//  Simple Function
//    Call the function
        System.out.println("Function 1 invoked");
        for (int i = 0; i < 5; i++) {
            greet(); // Call function1
        }
        System.out.println("\nFunction 2 invoked");
        greet2();
    }

// 1. Define the function
        static void greet(){
            System.out.println("Hi,This is Function 1");
        }
        static void greet2(){
            System.out.println("Hi,This is Function 2");
        }
    }
