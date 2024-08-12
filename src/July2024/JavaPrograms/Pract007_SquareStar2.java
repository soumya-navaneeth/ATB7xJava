package July2024.JavaPrograms;

import java.util.Scanner;

public class Pract007_SquareStar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        for(int i =1; i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if (i>=2 && j>=2 && i<=(n-1) && j<=(n-1)) //from 2nd Row 2nd Column show Blank
                    {
                        System.out.print(" ");
                    } else
                    {
                        System.out.print("*");
                    }
            }
            System.out.println();
        }
    }
}
