/*.
A square matrix is said to be a perfect Matrix if both of the following conditions hold:
a) All the elements in the diagonals of the matrix are non-zero integers.
b) All other elements except the diagonal elements are 0.
Given a 2D integer array grid of size n*n representing a square matrix,
return true if the grid is a perfect matrix. Otherwise, return false.
*/

package Week_5_Multidimensional_Arrays.Practice_Matrix;

import java.util.Scanner;

public class Perfect_Matrix {
    // Function to check if the matrix is a perfect matrix
    public static boolean perfectMatrix(int[][] matrix, int n) {
        // Traverse through each element of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the current element is on the main diagonal or anti-diagonal
                if (i == j || i + j == n - 1) {
                    // If it's on the diagonal, it must be non-zero
                    if (matrix[i][j] == 0) return false;
                } else {
                    // If it's off the diagonal, it must be zero
                    if (matrix[i][j] != 0) return false;
                }
            }
        }
        return true; // If all conditions are met, the matrix is perfect
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

        // Check if the matrix is perfect and display the result
        if (perfectMatrix(matrix, n)) {
            System.out.println("Given matrix is a Perfect Matrix");
        } else {
            System.out.println("Given matrix is not a Perfect Matrix");
        }
    }
}
