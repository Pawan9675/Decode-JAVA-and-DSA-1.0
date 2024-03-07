/*
Algorithm:
Step 1:
    i : minR
    j : minC -> maxC
    minR++
Step 2:
    j : maxC
    i : minR -> maxR
    j : maxC--
Step 3:
    i : maxR
    j : maxC -> minC
    maxR--
Step 4:
    j : minC
    i : maxR -> minR
    minC++
*/

package Week_5_Multidimensional_Arrays;

import java.util.Scanner;

public class Spiral_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows of 2D array: ");
        int m = sc.nextInt();
        System.out.print("Enter the column of 2D array: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Enter " + (m * n) + " elements in a 2D array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        // spiral print
        int minR = 0, maxR = m - 1;
        int minC = 0, maxC = n - 1;
        System.out.println("Matrix in spiral form: ");
        while (minR <= maxR && minC <= maxC) {
            // left to right
            for (int j = minC; j <= maxC; j++) {
                System.out.print(mat[minR][j] + " ");
            }
            minR++;

            // top to bottom
            if (minR>maxR || minC>maxC) break;
            for (int i = minR; i <= maxR; i++) {
                System.out.print(mat[i][maxC] + " ");
            }
            maxC--;

            // right to left
            if (minR>maxR || minC>maxC) break;
            for (int j = maxC; j >= minC; j--) {
                System.out.print(mat[maxR][j] + " ");
            }
            maxR--;

            // bottom to up
            if (minR>maxR || minC>maxC) break;
            for (int i = maxR; i >= minR; i--) {
                System.out.print(mat[i][minC] + " ");
            }
            minC++;
        }
    }
}
