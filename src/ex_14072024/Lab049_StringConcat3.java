package ex_14072024;

public class Lab049_StringConcat3 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "Reader";

        // Concatenating one string
        String str4 = str1.concat(str2);
        System.out.println("2 String Concat:" +str4);

        // Concatenating multiple strings
        String str5 = str1.concat(str2).concat(str3);
        System.out.println("Multiple String Concat:" +str5);

        // Concatenating Space among strings
        String str6 = str1.concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.println("Spaces in String Concat:" +str6);

        // Concatenating Special Chars
        String str7 = str1.concat("!!!");
        System.out.println("Spl Chars in String Concat:" +str7);
        String str8 = str1.concat("@").concat(str2);
        System.out.println("Spl Chars in String Concat:" +str8);

        //Adding text before String
        String str = "Reader";
        // we have added the string "I am a Java" before the String str;
        // Also, observe that a string literal can also invoke the concat() method
        //String s = "I am a Java ".concat(str);
        //System.out.println(s);
        System.out.println("I am a Java ".concat(str));
    }
}
