// Method 2: Pre-Calculating the horizontal sum for each row in the Matrix

package Week_5_Multidimensional_Arrays.ExtraPractice.Prefix_Sum;

import java.util.Scanner;

public class Sum_Of_Rectangle_Using_PreCalculating_Horizontal_Sum_For_Each_Row {

    // Method to calculate prefix sum for each row in the matrix
    public static void prefixSum(int[][] matrix) {
        // Traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                // Add the previous element to the current element to get the prefix sum
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    // Function to calculate the sum of a rectangle within a matrix
    public static int rectangleSum(int[][] matrix, int l1, int l2, int r1, int r2) {
        int sum = 0;

        // Pre-calculate the prefix sum for each row in the matrix
        prefixSum(matrix);

        // Loop through the rows from l1 to l2
        for (int i = l1; i <= l2; i++) {
            // If r1 is greater than 0, subtract the sum up to r1-1 from the sum up to r2 to get the sum of the rectangle
            if (r1 > 0) sum += matrix[i][r2] - matrix[i][r1 - 1];
            else sum += matrix[i][r2]; // Otherwise, simply add the sum up to r2
        }

        return sum; // Return the sum of the rectangle
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the dimensions of the matrix
        System.out.print("Enter the number of rows of the 2D array: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns of the 2D array: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Input the elements of the matrix
        System.out.println("Enter " + (m * n) + " elements in the 2D array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input the rectangle boundaries
        System.out.print("Enter the row index of the first coordinate: ");
        int l1 = sc.nextInt();
        System.out.print("Enter the column index of the first coordinate: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the row index of the second coordinate: ");
        int l2 = sc.nextInt();
        System.out.print("Enter the column index of the second coordinate: ");
        int r2 = sc.nextInt();

        // Calculate and output the sum of the rectangle
        System.out.println("Sum of elements between coordinates (" + l1 + "," + r1 + ") and (" + l2 + "," + r2 + ") is: " + rectangleSum(matrix, l1, l2, r1, r2));
    }
}

