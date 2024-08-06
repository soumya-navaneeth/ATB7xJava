package ex_27072024;

public class Lab102_StringBufferBuilderExamp {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // change the value of string - Buffer
        StringBuffer sb = new StringBuffer("Soumya");
        for (int i=0; i<10000; i++) {
            sb.append("Navaneeth"); //SoumyaNavaneeth
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis(); //Reset the timer
        StringBuilder sbuild = new StringBuilder("Dhanvi");
        for (int i=0; i<10000; i++) {
            sbuild.append("Navaneeth"); //
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime));
    }

}
