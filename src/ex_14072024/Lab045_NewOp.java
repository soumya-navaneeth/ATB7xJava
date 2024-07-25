package ex_14072024;

public class Lab045_NewOp {
    public static void main(String[] args) {
//  "new" creates new instances everytime
        String s1 = new String("Soumya");
        String s2 = new String("Soumya");
        //  2, Heap area
        String s3  = s1; // (This doesn't mean this in the SCP) - S3 -> S1 (heap area)
        //  2, heap  s3 -> s1 -> Soumya
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s2); //false as references are different
    }
}
