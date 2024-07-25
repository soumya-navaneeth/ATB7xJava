package ex_14072024;

public class Lab043_SCPHeap {
    public static void main(String[] args) {
        String name = "Java"; // Assignment Operators
        String name2 = new String("Java"); // New Operator

        // Both of them, actually save the name, name2 in different ways JVM
        // How they store the values in the JVM?
        // SCP and Heap - JVM
        //When = is used, it searches for the string, if presents reference is set to this variable.
        //When "new" is used, it creates a new instance of string in Heap memory,
        // even if there is same string, it creates new instance.

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name2); //compares references; false as one in SCP n one in Heap
        System.out.println(name.equals(name2)); // compares the content, hence true

        // Example 2
        String s1 = new String("dhyaan");
        String s2 = new String("dhyaan");
        String s3 = new String("dhyaan");


        System.out.println(s1 == s2); // Check for the ref
        System.out.println(s2 == s3); // Check for the ref
        System.out.println(s2.equals(s3)); // Check for the Content
    }
}
