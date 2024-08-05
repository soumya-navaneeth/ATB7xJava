package ex_27072024;

public class Lab095_FloatArray {
    public static void main(String[] args) {
//  Disadvantage of array:
//   - Fixed Data Type (Same Type)
//   - Fixed Length
//   - Wastage of memory
        final float pi =  3.14F;
        int [] ages = new int[100];
        ages[1]  = 99;
        ages[1]  = 100;
        System.out.println(ages[1]); // print the latest value
        System.out.println("Value of Pi: " +pi);

//  Initialization of different Data Types

        int[] int_array = {34,45,43};
        long[] l_array  = {34l, 45l,43l};
        float[] f_array = {45.56f, 32.34f, 43.43f};
        double[] d_array = {34.3, 43.4, 12.32};
        boolean[] b_array = {true,false,true,false};
        char[] c_array = {'A','B','D'};

        String names[] = {"Pramod","Amit","Alok"};
        String[] args1 = {"Pramod","Amit","Alok"};

        int ages2[] = new int[4];
        int[] ages3 = new int[4];
    }
}
