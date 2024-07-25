package ex_14072024;

public class Lab055_LargestNumber {
    public static void main(String[] args) {
        int x=69;
        int y=99;
        int z=29;
        int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("The largest numbers is:  "+largestNumber);

    }
}
