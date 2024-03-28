// Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns.
// The matrix should also be sorted row and column wise

package Week_5_Multidimensional_Arrays.Practice_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Convert_1D_To_2D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Get the dimensions of the 2D array from the user
        System.out.println("Enter the dimensions of 2D array you want to convert to: ");
        int n = scn.nextInt(); // Number of rows
        int m = scn.nextInt(); // Number of columns

        // Create a 1D array to store the elements of the 2D array
        int[] arr = new int[m*n];

        // Create a 2D array to store the converted matrix
        int[][] mat = new int[n][m];

        // Get the elements of the 1D array from the user
        System.out.println("Enter the elements of 1D array: ");
        for(int i = 0; i < m*n; i++){
            arr[i] = scn.nextInt();
        }

        // Sort the 1D array
        Arrays.sort(arr);

        // Convert the 1D array to a sorted 2D array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = arr[index++]; // Fill the 2D array row by row from the sorted 1D array
            }
        }

        // Print the converted 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
