package July2024.ex_14072024;

public class Lab042_StringFunction {
    public static void main(String[] args) {
/*  # String - sequence of char values
    # String declaration can be done in 2 ways:
        - <DataType> <Variable name> = "String"; EX: string Stg = "Soumya";
             --> This does not create Hierarchical Instance of string in SCP
        - <DataType> <Variable name> = new String("String"); EX: string Stg = new.String("Soumya");
             --> This creates a Hierarchical instance in Heap Memory
    # String objects are stored in a special memory area known as the "String Constant Pool" (SCP).
 */
        String stg = "SOUmya navNEETH"; //
        String name2 = new String("SOUmya navNEETH"); // creates a new instance of this string

//      Few String Class methods
        System.out.println(stg.length()); // returns the length of the string
        System.out.println(stg.toLowerCase()); // changes string to lowercase
        System.out.println(stg.toUpperCase()); // changes string to uppercase
        System.out.println(stg.charAt(2)); // returns a char value at the given index number.starts from 0 to n-1
        System.out.println(stg.charAt(0));
        // System.out.println(stg.charAt(20)); // Exception Index 10 out of bounds

    }
}
