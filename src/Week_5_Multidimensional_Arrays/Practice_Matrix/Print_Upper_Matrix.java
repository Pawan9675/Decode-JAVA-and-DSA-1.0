// Write a user defined function upper() which takes an integer square matrix as an input and
// its size N and prints the upper half of the matrix.

package Week_5_Multidimensional_Arrays.Practice_Matrix;

import java.util.Scanner;

public class Print_Upper_Matrix {
    // Function to print the upper half of a square matrix
    public static void upper(int[][] matrix, int n) {
        // Traverse through each element of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the column index is greater than or equal to the row index
                // This condition ensures we print only the upper half of the matrix
                if (j >= i) {
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    // If the condition is not met, print a space to maintain the matrix structure
                    System.out.print("\t");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the dimensions of the square matrix
        System.out.print("Enter the number of rows and columns of the 2D square array: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input the elements of the matrix
        System.out.println("Enter " + (n * n) + " elements in the 2D array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the upper half of the matrix
        upper(matrix, n);
    }
}
