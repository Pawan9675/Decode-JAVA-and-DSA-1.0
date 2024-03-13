// Given a matrix ‘A’ of dimension n x m and 2 coordinates (l1, r1) and (l2, r2).
// Return the sum of the rectangle from (l1,r1) to (l2, r2).
package Week_5_Multidimensional_Arrays.Assignment_Multidimension_Arrays;

import java.util.Scanner;

public class Sum_Of_Rectangle_In_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows of the matrix: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int c = sc.nextInt();

        // Input matrix elements
        int[][] mat = new int[r][c];
        System.out.println("Enter " + (r * c) + " elements in the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Input rectangle coordinates
        System.out.print("Enter the row index of the first coordinate: ");
        int l1 = sc.nextInt();
        System.out.print("Enter the column index of the first coordinate: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the row index of the second coordinate: ");
        int l2 = sc.nextInt();
        System.out.print("Enter the column index of the second coordinate: ");
        int r2 = sc.nextInt();

        int sum = 0;
        // Calculate sum of the rectangle
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += mat[i][j];
            }
        }

        // Output the result
        System.out.println("Sum of elements between coordinates (" + l1 + "," + r1 + ") and (" + l2 + "," + r2 + ") is: " + sum);
    }
}
