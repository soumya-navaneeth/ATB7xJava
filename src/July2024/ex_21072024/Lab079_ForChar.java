package July2024.ex_21072024;

public class Lab079_ForChar {
    public static void main(String[] args) {
//        Print the Alphabets
        System.out.println("Alphabets A-Z");
        for (char c = 'a'; c <= 'z';c++) {
            System.out.println(c);
        }
//        Print Reverse Numbers
        System.out.println("\nReverse Numbers");
        for (int i = 20; i > 0 ; i--) {
            System.out.println(i);
        }
//            One more Way
            System.out.println("\nReverse Numbers 2");
            int i = 10;
            for (; i>0 ; i--) {
                System.out.println(i);
            }
    }
}
