package July2024.ex_13072024;

public class Lab029_BODMAS {
    public static void main(String[] args) {
        // BIO
        int a = 12;
        boolean b = !(a > 10 || a < 5); // BODMAS b=!(T||F) = !T = False
        System.out.println(b);
        boolean c = !(a > 10 && a < 5); // BODMAS b=!(T&&F) = !F = True
        System.out.println(c);

        // BODMAS stands for
        // Bracket, Of, Division,
        // Multiplication, Addition, and Subtraction.
    }
}
