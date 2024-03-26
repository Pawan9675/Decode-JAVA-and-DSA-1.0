// Generate a n*n matrix filled with elements 1 to n^2 in spiral order.
package Week_5_Multidimensional_Arrays.ExtraPractice;

import java.util.Scanner;

public class Spiral_Matrix_Generation {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] generateSpiralOrder(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int current = 1;

        while (current <= n*n) {
            // Top row -> Left column to Right column
            for (int j = leftCol; j <= rightCol && current <= n*n; j++) {
                matrix[topRow][j] = current++;
            }
            topRow++;

            // Right column -> Top row to Bottom row
            for (int i = topRow; i <= bottomRow && current <= n*n; i++) {
                matrix[i][rightCol] = current++;
            }
            rightCol--;

            // Bottom row -> Right column to Left column
            for (int j = rightCol; j >= leftCol && current <= n*n; j--) {
                matrix[bottomRow][j] = current++;
            }
            bottomRow--;

            // Left column -> Bottom row to Top row
            for (int i = bottomRow; i >= topRow && current < n*n; i--) {
                matrix[i][leftCol]  = current++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] matrix = generateSpiralOrder(n);
        printMatrix(matrix);
    }
}
