// Check if an element x exists in the given matrix or not.
// If it does not exist, return -1, else return its row and column index.

package Week_5_Multidimensional_Arrays.Practice_Matrix;

import java.util.Scanner;

public class Search_In_Matrix {
    public static void searchMatrix(int[][] matrix, int item) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == item) {
                    System.out.println("Element found at Row: " + i + ", Column: " + j);
                    return;
                }
            }
        }
        System.out.println("Element not found in the matrix");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the matrix: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter " + (r * c) + " elements in the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element to be searched: ");
        int item = sc.nextInt();

        searchMatrix(matrix, item);
    }
}
