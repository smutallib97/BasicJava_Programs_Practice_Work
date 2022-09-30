package designpatternsprogs;

import java.util.Scanner;

public class RightPascalTriangle_Pattern {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Right Pascals Triangle Pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing Right Pascals Triangle Number Pattern");

        for (i = 1 ; i <= rows; i++ )
        {
            for (j = 1 ; j <= i; j++ )
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (i = rows - 1; i >= 1; i-- )
        {
            for (j = 1 ; j <= i; j++ )
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
