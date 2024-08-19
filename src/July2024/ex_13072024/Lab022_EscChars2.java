package July2024.ex_13072024;

public class Lab022_EscChars2 {
    public static void main(String[] args) {
//        it inserts a Tab Space
        String str = "Andrew\tGarfield";
        System.out.println(str);
//it inserts a Hierarchical Line
        String str1 = "the best way\nto communicate \nan idea \nis to act it out";
        System.out.println(str1);
//it insert a backslash
        String str2 = "And\\Or";
        System.out.println(str2);
//it insert a Carriage -> Deletes one word behind
        String str3 = "Carriage\rReturn";
        System.out.println(str3);
//it prints a single quote
        String str4 = "Wall Street\'s";
        System.out.println(str4);
//it prints double quote
//String str5 = "Hierarchical\'Twilight'Line";
        String str5 = " Add double quotes \"Twilight\"";
        System.out.println(str5);
    }
}
