package ex_21072024;

public class Lab081_LoopBreak {
    public static void main(String[] args) {
        // Loop with condition
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break; // due to this break statement, even if condition says tll 10, it will exit
            }

        }
    }
}
