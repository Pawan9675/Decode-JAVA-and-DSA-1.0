package Week_5_Multidimensional_Arrays;

import java.util.Scanner;

public class Multiplication_Of_Matrix {
    public static void print2DArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows of first 2D array: ");
        int m = sc.nextInt();
        System.out.print("Enter the column of first 2D array: ");
        int n = sc.nextInt();

        int[][] mat1 = new int[m][n];

        System.out.println("Enter " + (m * n) + " elements in a first 2D array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the rows of second 2D array: ");
        int p = sc.nextInt();
        System.out.print("Enter the column of second 2D array: ");
        int q = sc.nextInt();

        int[][] mat2 = new int[p][q];

        System.out.println("Enter " + (p * q) + " elements in a second 2D array: ");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        if (n != p) {
            System.out.println("Multiplication Not Possible!");
        }
        else {      // Multiplication is Possible!
            int[][] res = new int[m][q];             // m = mat1.length & q = mat2[0].length

            for (int i = 0; i < m; i++) {            // traversing through rows of resulted matrix
                for (int j = 0; j < q; j++) {        // traversing through columns of resulted matrix
                    /*
                    Logic:
                    res[i][j] = mat1[i][0] * mat2[0][j] + mat1[i][1] * mat2[1][j] + mat1[i][2] * mat2[2][j] + ....so on
                    */
                    for (int k = 0; k < mat2.length; k++) {     // or you can use mat1[0].length instead of mat2.length
                        res[i][j] += mat1[i][k] * mat2[k][j];    // as mat1[0].length = mat2.length(n = p)
                    }
                }
            }

            System.out.println("Matrix 1: ");
            print2DArray(mat1);
            System.out.println("Matrix 2: ");
            print2DArray(mat2);

            System.out.println("Multiplication of Matrix 1 and Matrix 2: ");
            print2DArray(res);
        }
    }
}
