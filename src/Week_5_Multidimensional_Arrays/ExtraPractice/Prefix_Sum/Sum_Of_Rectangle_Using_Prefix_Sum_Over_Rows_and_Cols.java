// Method 3: Prefix sum Over columns and Rows Both

package Week_5_Multidimensional_Arrays.ExtraPractice.Prefix_Sum;

import java.util.Scanner;

public class Sum_Of_Rectangle_Using_Prefix_Sum_Over_Rows_and_Cols {

    // Method to calculate row-wise and column-wise sum
    // The matrix[i][j] represents the sum of the rectangle ((0,0), (i,j)), i.e., matrix[i][j] = sumOfRectangle ((0,0), (i,j))
    // This method uses the prefix sum technique to efficiently calculate the sum of elements within a rectangle of the matrix.
    // It calculates the prefix sum over rows and columns separately to avoid redundant calculations.
    // Complexity Analysis:
    // - Time Complexity: O(m*n), where m is the number of rows and n is the number of columns in the matrix.
    // - Space Complexity: O(1), as the calculations are done in-place on the input matrix.
    public static void rowAndColumnWiseSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // Traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                // Add the previous element to the current element to get the prefix sum
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // Traverse vertically to calculate column-wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    // Function to calculate the sum of a rectangle within a matrix
    // This function calculates the sum of elements within a rectangle defined by the coordinates (l1, r1) and (l2, r2) in the matrix.
    // It uses the prefix sum technique to efficiently calculate the sum by considering the sums of non-overlapping regions.
    // Complexity Analysis:
    // - Time Complexity: O(1), as the calculation involves a constant number of operations regardless of the size of the matrix.
    // - Space Complexity: O(1), as the calculation is done using pre-calculated prefix sums stored in the matrix.
    public static int rectangleSum(int[][] matrix, int l1, int l2, int r1, int r2) {
        int ans = 0;
        int sum = 0, up = 0, left = 0, leftUp = 0;

        // Calculate the prefix sum over rows and columns
        rowAndColumnWiseSum(matrix);

        sum = matrix[l2][r2];
        // Calculate the sum of elements above the rectangle
        if (l1 >= 1) up = matrix[l1 - 1][r2];
        // Calculate the sum of elements to the left of the rectangle
        if (r1 >= 1) left = matrix[l2][r1 - 1];
        // Calculate the sum of elements in the overlapping region
        if (l1 >= 1 && r1 >= 1) leftUp = matrix[l1 - 1][r1 - 1];

        // Calculate the sum of the rectangle by subtracting the sums of the non-overlapping regions
        ans = sum - up - left + leftUp;

        return ans;
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
