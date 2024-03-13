// Write a program to add two matrices and save the result in one of the given matrices.
package Week_5_Multidimensional_Arrays.Assignment_Multidimension_Arrays;

import java.util.Scanner;

public class Addition_Of_Two_Matrices_Without_Using_Extra_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first matrix
        System.out.print("Enter the number of rows of the first 2D array: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns of the first 2D array: ");
        int n = sc.nextInt();

        int[][] mat1 = new int[m][n];

        System.out.println("Enter " + (m * n) + " elements for the first 2D array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Input for the second matrix
        System.out.print("Enter the number of rows of the second 2D array: ");
        int k = sc.nextInt();
        System.out.print("Enter the number of columns of the second 2D array: ");
        int l = sc.nextInt();

        int[][] mat2 = new int[k][l];

        System.out.println("Enter " + (k * l) + " elements for the second 2D array: ");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Check if addition is possible
        if (m == k && n == l){
            // Add the matrices
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mat1[i][j] = mat1[i][j] + mat2[i][j];
                }
            }

            // Display the result
            System.out.println("Addition of two matrices: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("ADDITION NOT POSSIBLE! Matrices have different dimensions.");
        }
    }
}
