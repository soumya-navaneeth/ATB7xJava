package July2024.ex_14072024;

public class Lab048_StringConcat2 {
    public static void main(String[] args) {
        String s1 = "java string";
        /* The string s1 does not get changed, even though it is invoking the method concat(),
        as it is immutable. Therefore, the explicit assignment is required here. */
        System.out.println("Value of s1 is: " +s1);
        s1.concat("is immutable");
        System.out.println("Value of s1 before explicit assignment is: " +s1); // Still prints "Java String" as it is nto assigned to any variable
        s1 = s1.concat(" is immutable so assign it explicitly");
        System.out.println("Value of s1 after explicit assignment is: " +s1);
    }
}
