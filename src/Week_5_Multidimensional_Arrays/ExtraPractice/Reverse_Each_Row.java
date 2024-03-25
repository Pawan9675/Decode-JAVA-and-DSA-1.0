package Week_5_Multidimensional_Arrays.ExtraPractice;

import java.util.Scanner;

public class Reverse_Each_Row {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void reverseRow(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int st = 0, end = matrix[i].length-1;
            while (st<end){
                int temp = matrix[i][st];
                matrix[i][st] = matrix[i][end];
                matrix[i][end]= temp;
                st++;
                end--;
            }
        }

        System.out.println("Matrix with each row reversed:");
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

        reverseRow(mat);
    }
}
