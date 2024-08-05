package ex_27072024;

public class Lab091_Arrays {
    public static void main(String[] args) {
/*  Array is a collection of similar Data type of elements which are stored in a contiguous memory location.
    Can store only a fixed set of elements in a Java array.
    Each item in an array is called an element, and each element is accessed by its numerical index
    It is index-based, the first element of the array is stored at the 0th index
    Syntax: dataType[] arrayName; OR dataType arrayName[]; */

        int[] a = new int[5]; // declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
//OR can be done together as below
        int[] marks_10_board = {90, 91, 95, 99, 100, 78}; //declaration, instantiation and initialization
        float[] gst_pad = {18.45f, 91.87f, 95.78f, 99.00f, 100.00f, 78.98f};
        System.out.println(gst_pad[2]);
        String shoppling_list[] = {"bread", "butter", "milk", "curd"};
        char [] grades = {'A','B','C','D','E','F'};
        char [] grades_small = {'a','c','C','D','e','F', '#','@','%'};
    // int[] marks_10_board = [90, 91, 95, 99, 100, 78]; - Not possible with [] it has to be {}
    // int[] marks_12_board = {95,96,94,91,"Pramod"};  -> Not possible to combine diff data types together in array









    }
}
