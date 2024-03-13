// Write a program to print the elements of both the diagonals in a square matrix.

package Week_5_Multidimensional_Arrays.Assignment_Multidimension_Arrays;

import java.util.Scanner;

public class Printing_Diagonals_Of_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter " + (n * n) + " elements in the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j || i+j == n-1){
                    System.out.print(mat[i][j]+" ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }

    }
}
