package July2024.ex_14072024;

public class Lab045_StringNewOp {
    public static void main(String[] args) {
//  "new" creates new instances everytime
        String s1 = new String("Soumya");
        String s2 = new String("soumya");
        //  2, Heap area
        String s3  = s1; // (This doesn't mean this in the SCP) - S3 -> S1 (heap area)
        //  2, heap  s3 -> s1 -> Soumya
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s2); //false as references are different
        System.out.println(s1.equals(s3)); // True since it checks content
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
