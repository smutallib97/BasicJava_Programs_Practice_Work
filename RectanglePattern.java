package designpatternsprogs;

import java.util.Scanner;

public class RectanglePattern {

    public static void main(String[] args)
    {
        int rows, columns, i, j;
       Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Number of Rows : ");
        rows = sc.nextInt();

        System.out.println(" Enter the Number of Columns : ");
        columns = sc.nextInt();

        for(i = 1; i <= rows; i++)
        {
            for(j = 1; j <= columns; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
