package Week_5_Multidimensional_Arrays.ExtraPractice;

import java.util.Scanner;

public class Rotate_Matrix {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void transposeInPlace(int[][] matrix, int row, int col) {         // Only applicable on square matrix

        for (int i = 0; i < col; i++) {
            for (int j = i; j < row; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void reverse(int[]arr){
        int i = 0, j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotateMatrix(int[][] matrix, int n){
        transposeInPlace(matrix, n, n);

        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }

        System.out.println("Rotated Matrix: ");
        printMatrix(matrix);
    }


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
        printMatrix(mat);

        rotateMatrix(mat, n);

    }
}
