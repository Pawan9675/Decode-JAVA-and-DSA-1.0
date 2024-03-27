// Given a matrix 'a' of dimension n x m and 2 coordinates (l1, r1) and (l2, r2).
// Return the sum of the rectangle from (l1, r1) to (l2, r2).

package Week_5_Multidimensional_Arrays.ExtraPractice.Prefix_Sum;

import java.util.Scanner;

public class Sum_Of_Rectangle_Using_Brute_Force_Method {
    // Function to calculate the sum of a rectangle within a matrix
    public static int rectangleSum(int[][] matrix, int l1, int l2, int r1, int r2) {
        int sum = 0;

        // Loop through the rows from l1 to l2
        for (int i = l1; i <= l2; i++) {
            // Loop through the columns from r1 to r2
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j]; // Add the element at position (i, j) to the sum
            }
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