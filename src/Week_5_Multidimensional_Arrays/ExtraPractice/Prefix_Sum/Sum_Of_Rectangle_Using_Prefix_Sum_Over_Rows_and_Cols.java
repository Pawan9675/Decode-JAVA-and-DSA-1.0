// Method 3: Prefix sum Over columns and Rows Both

package Week_5_Multidimensional_Arrays.ExtraPractice.Prefix_Sum;

import java.util.Scanner;

public class Sum_Of_Rectangle_Using_Prefix_Sum_Over_Rows_and_Cols {
    // Method to calculate row-wise and column-wise sum
    // matrix[i][j] representing sum of rectangle ((0,0), (i,j)) i.e. matrix[i][j] = sumOfRectangle ((0,0), (i,j))
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

        // Traverse horizontally to calculate column-wise sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    // Function to calculate the sum of a rectangle within a matrix
    public static int rectangleSum(int[][] matrix, int l1, int l2, int r1, int r2) {
        int ans = 0;
        int sum = 0, up = 0, left = 0, leftUp = 0;

        rowAndColumnWiseSum(matrix);

        sum = matrix[l2][r2];
        if (l1 >= 1) up = matrix[l1-1][r2];
        if (r1 >= 1) left = matrix[l2][r1-1];
        if (l1 >= 1 && r1 >= 1) leftUp = matrix[l1-1][r1-1];

        ans = sum - up - left +leftUp;

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
