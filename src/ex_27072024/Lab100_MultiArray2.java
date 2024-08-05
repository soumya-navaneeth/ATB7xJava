package ex_27072024;

public class Lab100_MultiArray2 {
    public static void main(String[] args) {
        int[][] arr2d = { //Instantiate & Initialize
                {34, 12, 11},
                {34, 12, 34},
                {11, 23, 98}
        };

        // Row - 3 - i -> 0 to 2
        // Column - 3  j -> 0 to 2

//  Printing Array
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
//                System.out.print("\tRow" +i+" Col"+j+ "->" +arr2d[i][j]);
                System.out.print(+arr2d[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
