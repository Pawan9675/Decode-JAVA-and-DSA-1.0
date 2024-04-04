// Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix.

package Week_5_Multidimensional_Arrays.Practice_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Diagonal_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of rows and columns
        System.out.print("Enter the rows of 2D array: ");
        int n = sc.nextInt();
        System.out.print("Enter the columns of 2D array: ");
        int m = sc.nextInt();

        // Creating a 2D array
        int[][] mat = new int[m][n];

        // Taking input for the elements of the 2D array
        System.out.println("Enter " + (n * m) + " elements in a 2D array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Creating a 1D array to store the diagonal elements
        int[] arr = new int[n * m];
        int index = 0;
        int row = 0, col = 0;

        // Loop to traverse the diagonals
        while (col < m) {
            int i = row;
            int j = col;

            // Loop to traverse each diagonal
            while (i >= 0 && j < m) {
                // Storing the diagonal element in the 1D array
                arr[index++] = mat[i][j];
                // Moving to the next element in the diagonal
                i--;
                j++;
            }
            // Moving to the next diagonal
            row++;

            // If we have traversed all rows, move to the next column
            if (row >= n) {
                row = n - 1;
                col++;
            }
        }

        // Printing the diagonal traversal array
        System.out.printf("Diagonal Traversal Array: " + Arrays.toString(arr));
    }
}
