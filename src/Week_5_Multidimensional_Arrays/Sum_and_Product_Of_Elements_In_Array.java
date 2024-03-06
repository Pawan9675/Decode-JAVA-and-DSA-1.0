package Week_5_Multidimensional_Arrays;

import java.util.Scanner;
public class Sum_and_Product_Of_Elements_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows of 2D array: ");
        int m = sc.nextInt();
        System.out.print("Enter the column of 2D array: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Enter " + (m * n) + " elements in a 2D array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        int prod = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               sum += mat[i][j];
               prod *= mat[i][j];
            }
        }

        System.out.println("Sum of the element in the given 2D array: "+sum);
        System.out.println("Product of the element in the given 2D array: "+prod);
    }
}
