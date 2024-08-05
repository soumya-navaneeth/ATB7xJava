package ex_27072024;

public class Lab099_MultiDimenArray {
    public static void main(String[] args) {
//  Single-dimensional arrays: have only one dimension, representing a list of elements.
//  Multi-dimensional arrays: data is stored in row and column based index (also known as matrix form).
//  They have two or more dimensions, representing a table or grid of elements.
/* Syntax to declare Multidimensional Array:
dataType[][] arrayRefVar;  OR
dataType [][]arrayRefVar;  OR
dataType arrayRefVar[][];  OR
dataType []arrayRefVar[];
 */
        int[][] arr=new int[3][3]; //instantiate MultiDimensional Array
        arr[0][0]=1; // initialize Multidimensional Array
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;

//  OR One more way of instantiate & initialize
//      int arr[][]={{1,2,3},{2,4,5},{4,4,5}};

//  printing a multidimensional array
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); //print new line after J loop
        }
        }
}
