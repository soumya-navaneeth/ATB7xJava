package July2024.ex_13072024;

public class Lab021_EscapeChars {
    public static void main(String[] args) {
        // Escape Chars: preceded by a backslash (\) is known as Java escape sequence or escape characters
        char c = '\n'; // Hierarchical line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backspace, delete 1 char
        char c3 = '\r'; // Carriage Return, delete 1 word

        System.out.println("NEW" + c + "LINE");
        System.out.println("Swimming" + c1 + "Classes");
        System.out.println("Dining" + c2 + "Table");
        System.out.println("Hierarchical Line Added" + c);
        System.out.println("Soumya" + c3 + "Navaneeth");

    }
}
