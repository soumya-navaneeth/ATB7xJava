package July2024.ex_21072024;

public class Lab081_LoopBreakContinue {
    public static void main(String[] args) {
        // Loop with condition
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break; // due to this break statement, even if condition says tll 10, it will exit
            }

        }
        for (int i = 0; i < 10; i++) { // i = 0 to 9, times  = 10
            System.out.println(i);
            if (i == 5) {
                continue; // this continues even when condition is matched
            }
            System.out.println("After!!");
        }
    }
}
