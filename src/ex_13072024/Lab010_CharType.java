package ex_13072024;

public class Lab010_CharType {
    public static void main(String[] args) {
        //byte b = 128; //-127 to 127

        char c = 'A';
        System.out.println(c);

        char c1 = '$';
        System.out.println(c1);

        char c2 = '\n';
        System.out.println("the next line is added" +c2);

        char c3 = '\u1F6A';  //:)
        System.out.println(c3);
        // :), :(, :D .;) -> unicode chars

    }
}
