package Week_5_Multidimensional_Arrays.ExtraPractice;

import java.util.Scanner;

public class Transpose_Of_Matrix {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] matrix, int row, int col) {

        int[][] trans = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                trans[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose of matrix(With using extra matrix): ");
        printMatrix(trans);
    }

    public static void transposeInPlace(int[][] matrix, int row, int col) {         // Only applicable on square matrix

        for (int i = 0; i < col; i++) {
            for (int j = i; j < row; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("Transpose of matrix(Without using extra matrix): ");
        printMatrix(matrix);
    }


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
        printMatrix(mat);

        transpose(mat, m, n);
        transposeInPlace(mat, m, n);
    }
}
