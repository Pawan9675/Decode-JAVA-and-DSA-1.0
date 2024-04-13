// Given a matrix having 0-1 only where each row is sorted in increasing order,
// find the row with the maximum number of 1’s.
package Week_9_Binary_Search.Assignment_BinarySearch;

import java.util.Scanner;

public class Maximum_Number_Of_One_In_Row {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();

        // Create a matrix to store the elements
        int[][] mat = new int[r][c];
        System.out.println("Enter the elements of the array : ");
        // Fill the matrix with user input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int max = 0; // Variable to store the maximum count of ones
        int idx = -1; // Variable to store the index of the row with maximum ones

        // Loop through each row of the matrix
        for (int i = 0; i < r; i++) {
            int low = 0, high = c - 1;
            int firstPos = -1; // Variable to store the index of the first occurrence of 1 in the current row
            int count = 0; // Variable to store the count of ones in the current row

            // Binary search for the first occurrence of 1 in the current row
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mat[i][mid] == 1) {
                    firstPos = mid; // Update the index of the first occurrence of 1
                    high = mid - 1; // Move the high pointer to search in the left half
                } else {
                    low = mid + 1; // Move the low pointer to search in the right half
                }
            }

            // Calculate the count of 1's in the current row
            if (firstPos != -1) {
                count = (c - 1) - (firstPos + 1);
            }

            // Update the maximum count and index if the current row has more 1's
            if (max <= count) {
                idx = i;
                max = count;
            }
        }

        // Print the index of the row with maximum ones
        System.out.println(idx + " row contains the maximum number of ones");
    }
}
