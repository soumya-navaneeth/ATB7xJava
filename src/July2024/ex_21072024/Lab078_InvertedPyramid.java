package July2024.ex_21072024;

public class Lab078_InvertedPyramid {
    public static void main(String[] args) {
        int end =6;
        for(int i = 1; i<= end; i++){
            for(int j = end; j>=i; j--){
                System.out.print(" * ");
            }
            System.out.println();//new line
        }
    }
}
