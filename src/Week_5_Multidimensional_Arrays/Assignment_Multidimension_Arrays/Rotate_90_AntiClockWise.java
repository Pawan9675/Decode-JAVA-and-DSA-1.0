// Write a program to rotate the matrix by 90 degrees clockwise.

package Week_5_Multidimensional_Arrays.Assignment_Multidimension_Arrays;

import java.util.Scanner;

public class Rotate_90_AntiClockWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows of the matrix: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        // Input matrix elements
        System.out.println("Enter " + (m * n) + " elements in the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Rotate the matrix
        // Transpose the matrix
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m / 2; i++) {
                int temp = mat[i][j];
                mat[i][j] = mat[m-1-i][j];
                mat[m-1-i][j] = temp;
            }
        }

        // Output the rotated matrix
        System.out.println("Rotated matrix (Anticlockwise): ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}