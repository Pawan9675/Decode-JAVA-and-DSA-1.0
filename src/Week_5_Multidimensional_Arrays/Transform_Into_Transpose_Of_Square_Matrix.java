package Week_5_Multidimensional_Arrays;

import java.util.Scanner;

public class Transform_Into_Transpose_Of_Square_Matrix {
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

        if (m == n){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i < j){ // or (j > i)
                        int temp = mat[i][j];
                        mat[i][j] = mat[j][i];
                        mat[j][i] = temp;
                    }
                }
            }

            System.out.println("Transpose of Matrix: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }

        } else System.out.println("Given matrix should be square matrix");
    }
}
