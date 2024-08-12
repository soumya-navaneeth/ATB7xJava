package July2024.JavaPrograms;

import java.util.Scanner;

public class Pract005_LeftTriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        for(int i =1; i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
