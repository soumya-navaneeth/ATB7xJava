package July2024.ex_14072024;

public class Lab050_StringCharAt {
    public static void main(String[] args) {
//        Java String class charAt() method returns a char value at the given index number.
        String s1 = "Soumya";
        //String s1 = "S o u m y a";
        //            |0|1|2|3|4|5|
        char c = s1.charAt(5);
        System.out.println(c);
        String s2 = s1.concat("Rao"); // SoumyaRao
        System.out.println("Value of s1:" +s1);
        System.out.println("Value of s2:" +s2);
        System.out.println("Letter at 5th index is " +s2.charAt(4));
//        char c = s1.charAt(15);  //Throws StringIndexOutOfBoundsException

    }
}
