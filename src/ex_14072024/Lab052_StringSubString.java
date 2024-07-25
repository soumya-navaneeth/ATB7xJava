package ex_14072024;

public class Lab052_StringSubString {
    public static void main(String[] args) {
/*  method returns a part of the string.
    If we don't specify endIndex, the method will return all the characters from startIndex.
    Syntax: String substring(int startIndex, int endIndex)
*/
        String s1="this is java class";
        System.out.println(s1.substring(2,10));//returns is is ja
        System.out.println(s1.substring(5));//returns is java class
        System.out.println(s1.substring(0)); // returns complete string
         //StringIndexOutOfBoundsException Error conditions
        // System.out.println(s1.substring(5,25)); //Range [5,25) out of bounds for length 18
       // System.out.println(s1.substring(10,5)); //Range [10,5) start index is more than end index


    }
}
