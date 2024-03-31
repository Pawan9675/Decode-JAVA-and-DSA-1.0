// Given a n*m matrix, return true if the matrix is a Toeplitz matrix.
// A matrix is called Toeplitz if every diagonal from top-left to bottom-right has the same elements.

/*
Explanation:
--> For every cell, check if diagonally previous cell has the same element or not.
    If not return, false then and there, else continue.
--> Start with 1st row and 1st column as we are matching with the previous row and column.
*/
package Week_5_Multidimensional_Arrays.Practice_Matrix;

import java.util.Scanner;

public class Toeplitz_Matrix {
    public static boolean isToeplitz(int[][] matrix, int r, int c) {
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows of the matrix: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        // Input matrix elements
        System.out.println("Enter " + (r * c) + " elements in the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        if (isToeplitz(mat, r, c)) System.out.println("Matrix is Toeplitz");
        else System.out.println("Matrix is not Toeplitz");
    }
}
