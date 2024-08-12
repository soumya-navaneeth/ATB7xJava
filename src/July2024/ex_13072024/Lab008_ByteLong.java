package July2024.ex_13072024;

public class Lab008_ByteLong {
    public static void main(String[] args) {
        //byte data type check
        //byte b  = 129; // this will throw error since byte can support only till 127
        byte b =127;
        System.out.println("byte supports only " +b+ " values");
        /*
         JVM -> brother who will execute the main method
         10 - Decimal
         Machine(0,1) -> 00001010 - 8 bits = 1 Byte
        */
        long distance_moon_earth = 3844000000000000L; // without L at the end it will consider as Int
        System.out.println("Distance bet earth & Moon " +distance_moon_earth);

    }
}
