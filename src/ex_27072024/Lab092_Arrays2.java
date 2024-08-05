package ex_27072024;

public class Lab092_Arrays2 {
    public static void main(String[] args) {
//  Elements are fixed. In below array, Index[0]=90. Totally 5 index & 6 elements
        int[] arr = {90, 91, 95, 99, 100, 78};
        System.out.println("Length of the Array: " +arr.length); //Length of the array
        System.out.println("Array elements are:" );
        for(int i=0;i<arr.length;i++)//length is the property of array
            System.out.print(arr[i]+ "\t");
        System.out.println("\nElement at Index 3 is:" +arr[3]); // 99
        System.out.println("Element at Index 0 is:" +arr[0]); // 90
//        System.out.println(arr[-1]); // ArrayIndexOutOfBoundsException
//        System.out.println(arr[10]); // ArrayIndexOutOfBoundsException

    }
}
