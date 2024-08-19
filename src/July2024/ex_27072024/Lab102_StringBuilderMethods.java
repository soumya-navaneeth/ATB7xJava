package July2024.ex_27072024;

import javax.xml.transform.Source;

public class Lab102_StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java Tutorial");
        System.out.println(sb.append(" Hierarchical").toString()); //Append to the end of the string.
        System.out.println(sb.insert(3,"ins")); //Inserts specified character(s) at the specified index
        System.out.println(sb.delete(3,5).toString()); //Deletes characters between the specified start and end index.
        System.out.println(sb.deleteCharAt(3).toString()); //Deletes Chart at specified index
        System.out.println(sb.replace(2,3,"soumya").toString());
        System.out.println("Capacity: "+sb.capacity());
        System.out.println("Length: "+sb.length());
        System.out.println(sb.reverse().toString()); // Reverses the String


//  Trim to Size Function: attempts to reduce the storage used for the character sequence
        System.out.println("\nTrim to Size");
        int length = sb.length();
        int capacity = sb.capacity();
        System.out.println("length: "+length);
        System.out.println("capacity: "+capacity);
        sb.trimToSize();
        length = sb.length();
        capacity = sb.capacity();
        System.out.println("length after trimtosize: "+length);
        System.out.println("capacity after trimtosize: "+capacity);


    }
}
