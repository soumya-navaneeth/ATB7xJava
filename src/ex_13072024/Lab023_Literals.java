package ex_13072024;

public class Lab023_Literals {
    public static void main(String[] args) {
/* Literals: are the constant values assigned to Variables
   Types:
    Integer Literal -> Decimal,Octal,Hexa-Decimal,Binary
    Character Literal
    Boolean Literal
    String Literal */

//  Integer Literals
        int decVal = 26;
        int octVal = 067;
        int hexVal = 0x1a;
        int binVal = 0b11010;
        System.out.println("Decimal Literal:" +decVal);
        System.out.println("Octal Literal:" +octVal);
        System.out.println("Hexa Decimal Literal:" +hexVal);
        System.out.println("Binary Literal:" +binVal);

//  Float/Real Literals:contain fractional parts ;float type end with F or f;double type end with D or d
        float length = 155.4f;
        double interest = 99658.445;
        System.out.println("Float Literal:" +length);
        System.out.println("Double Literal:" +interest);

//  boolean: literals are the value that is either true or false
        boolean isEven = true;
        System.out.println("Boolean Literal:" +isEven);

//  char Literals:expressed as a character or an escape sequence, enclosed in a single quote ('')
        char character = 'a';
        System.out.println("Char Literal:" +character);

//  String Literal: sequence of characters that is enclosed between double quotes ("")
        String stg = "Soumya";
        System.out.println("String Literal:" +stg);
/*  Null Literals:used in programs as a marker to indicate that reference type object is unavailable.
    The value null may be assigned to any variable, except variables of primitive types. */
        String age = null;
        System.out.println("Null Literal: " +age);
    }
}
/* Some Invalid Literals
float g = 6_.674f;
float g = 6._674F;
long phoneNumber = 99_00_99_00_99_L;
int x = 77_;
int y = 0_x76;
int z = 0X_12;
int z = 0X12_;
*/
