// Given a 2D array of n rows and m columns, return the sum of elements
// along the range of row and column specified.

package Week_5_Multidimensional_Arrays.Practice_Matrix;

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
        System.out.println("Enter the range of rows: ");
        int sRow = sc.nextInt();
        int eRow = sc.nextInt();
        System.out.println("Enter the range of columns: ");
        int sCol = sc.nextInt();
        int eCol = sc.nextInt();

        int sum = 0;
        // Calculate sum of the rectangle
        for (int i = sRow; i <= eRow; i++) {
            for (int j = sCol; j <= eCol; j++) {
                sum += mat[i][j];
            }
        }

        // Output the result
        System.out.println("Sum of elements between coordinates (" + sRow + "," + sCol + ") and (" + eRow + "," + eCol + ") is: " + sum);
    }
}
