// Check if an element x exists in the given sorted matrix or not.
// Each row and column is sorted in itself. If it does not exist, return -1, else return its row and column index

package Week_5_Multidimensional_Arrays.Practice_Matrix;

import java.util.Scanner;

public class Searching_In_Sorted_Matrix {
    // Function to search for an element in a sorted matrix
    public static void searchMatrix(int[][] matrix, int item) {
        int n = matrix.length; // Number of rows in the matrix
        int m = matrix[0].length; // Number of columns in the matrix

        // Initialize starting index (st) to 0 and ending index (end) to the last column
        int st = 0, end = m - 1;

        // Loop until st is less than the number of rows and end is greater than or equal to 0
        while (st < n && end >= 0) {
            // If the element at current indices is equal to the item, print the indices and return
            if (matrix[st][end] == item) {
                System.out.println("Row = " + st);
                System.out.println("Column = " + end);
                return;
            }
            // If the element at current indices is greater than the item, decrease the end index
            if (matrix[st][end] > item) {
                end--;
            }
            // If the element at current indices is less than the item, increase the starting index
            else {
                st++;
            }
        }
        // If the loop completes without finding the element, print that the element is not found
        System.out.println("Element not found in the matrix");
    }

    // Main method to input the matrix and item to be searched
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of rows and columns of the matrix
        System.out.print("Enter the rows of 2D array: ");
        int n = sc.nextInt();
        System.out.print("Enter the columns of 2D array: ");
        int m = sc.nextInt();

        // Create a 2D array to store the matrix elements
        int[][] matrix = new int[n][m];

        // Input the elements of the matrix
        System.out.println("Enter " + (n * m) + " elements in a 2D array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input the element to be searched
        System.out.println("Enter the element to be searched: ");
        int item = sc.nextInt();

        // Call the searchMatrix function to search for the element in the matrix
        searchMatrix(matrix, item);
    }
}
