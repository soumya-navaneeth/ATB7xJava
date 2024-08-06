package ex_27072024;

/* 3 classes to represent a sequence of characters: String, StringBuffer, and StringBuilder.
Both are used to create mutable (modifiable) String objects
Difference:
    StringBuffer	            | StringBuilder
    ----------------------------|---------------------
    - Synchronized              | non-synchronized
    - Runs 1 by 1               | Parallel Execution
    - Slow execution            | Faster Execution
    - Less efficient            | More efficient
    - introduced in Java 1.0    | Introduced in Java 1.5
 */
public class Lab101_StringBufferBuilder {
    public static void main(String[] args) {

        String s1 = "Java";
        s1 = "Tutorial";
        System.out.println(s1); // S1 is changed to New value "Tutorial"

        // change the value of string - Buffer
        StringBuffer sb = new StringBuffer("Soumya");
        sb.append("Navaneeth"); //SoumyaNavaneeth
        sb.append("JI"); //SoumyaNavaneethJi
        System.out.println("Buffer:" +sb);

        // change the value of string - Builder
        StringBuilder sbuild = new StringBuilder("Dhanvi");
        sbuild.append("Rao");
        sbuild.append("JI");
        System.out.println("Builder:" +sbuild);
    }

}
