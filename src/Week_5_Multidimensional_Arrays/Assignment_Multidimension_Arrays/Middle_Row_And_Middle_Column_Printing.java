// Write a function which accepts a 2D array of integers and
// its size as arguments and displays the elements of middle row and the elements of middle column.
//[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

package Week_5_Multidimensional_Arrays.Assignment_Multidimension_Arrays;

import java.util.Scanner;

public class Middle_Row_And_Middle_Column_Printing {

    // Function to display the middle row and middle column of a square matrix
    public static void display(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Display element if it is in the middle row or middle column
                if (i == n / 2 || j == n / 2) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("  "); // Print empty space for other elements
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter " + (n * n) + " elements in the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Display the middle row and middle column
        display(mat, n);
    }
}