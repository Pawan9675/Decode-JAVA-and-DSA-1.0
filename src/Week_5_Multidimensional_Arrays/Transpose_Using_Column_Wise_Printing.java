package Week_5_Multidimensional_Arrays;

import java.util.Scanner;

public class Transpose_Using_Column_Wise_Printing {
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

        System.out.println("Original Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of a matrix(Using column-wise printing): ");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
