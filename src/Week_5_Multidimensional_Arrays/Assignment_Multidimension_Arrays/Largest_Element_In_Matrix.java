// Write a program to find the largest element of a given 2D array of integers.

package Week_5_Multidimensional_Arrays.Assignment_Multidimension_Arrays;

import java.util.Scanner;

public class Largest_Element_In_Matrix {
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

        // Find the largest element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                }
            }
        }

        // Output the result
        System.out.print("The largest element is : " + max);
    }
}