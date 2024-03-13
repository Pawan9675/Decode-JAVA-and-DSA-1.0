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

// Given a positive integer n, generate a n x n matrix filled with elements from 1 to n2 in spiral order.
package Week_5_Multidimensional_Arrays.Assignment_Multidimension_Arrays;

import java.util.Scanner;

public class Generate_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        // spiral print
        int minR = 0, maxR = n - 1;
        int minC = 0, maxC = n - 1;
        int k = 1;

        while (minR <= maxR && minC <= maxC) {
            // left to right
            for (int j = minC; j <= maxC; j++) {
                mat[minR][j] = k++;
            }
            minR++;

            // top to bottom
            if (minR>maxR || minC>maxC) break;
            for (int i = minR; i <= maxR; i++) {
                mat[i][maxC] = k++;
            }
            maxC--;

            // right to left
            if (minR>maxR || minC>maxC) break;
            for (int j = maxC; j >= minC; j--) {
                mat[maxR][j] = k++;
            }
            maxR--;

            // bottom to up
            if (minR>maxR || minC>maxC) break;
            for (int i = maxR; i >= minR; i--) {
                mat[i][minC] = k++;
            }
            minC++;
        }

        System.out.println("Spiraled Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
