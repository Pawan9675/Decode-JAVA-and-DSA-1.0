// Given a matrix arr[][] of integers, print the prefix sum matrix for it.

package Week_5_Multidimensional_Arrays.Practice_Matrix;

import java.util.Scanner;

public class PrefixSum_2D {

    // Function to print a 2D matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to calculate the prefix sum matrix
    public static void prefixSum(int[][] matrix, int row, int col) {
        // Calculate prefix sum for rows
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // Calculate prefix sum for columns
        for (int j = 0; j < col; j++) {
            for (int i = 1; i < row; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the dimensions of the matrix
        System.out.print("Enter the number of rows of the 2D array: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns of the 2D array: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Input the elements of the matrix
        System.out.println("Enter " + (r * c) + " elements in the 2D array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix: ");
        printMatrix(matrix);

        // Calculate and print the prefix sum matrix
        prefixSum(matrix, r, c);

        System.out.println("Prefixed Matrix: ");
        printMatrix(matrix);
    }
}
