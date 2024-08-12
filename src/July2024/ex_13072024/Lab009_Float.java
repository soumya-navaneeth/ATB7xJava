package July2024.ex_13072024;

public class Lab009_Float {
    public static void main(String[] args) {
     // decide on the datatype to be used. Less memory -> smart container - good practice
        byte age= 122; // Max age can be 125, which can be declared as byte than int to save memory
        int age1 = 100; // wasting memory - 214768348488

        // program store pi with only 2 decimal i.e 3.14 instead of actual 3.142323237866999
        float pi = 3.14f;
        //float pi_d =  3.14876545678; Will give error due to size so need to convert as double
        double pi_d =  3.14876545678;
        System.out.println("Value of pi in Float = " +pi);
        System.out.println("Value of pi in Double = " +pi_d);
/*
Difference between Byte & byte
        byte - data type
            Byte -> memory allocation
            // curse electronice
*/
    }
}
