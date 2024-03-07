// Write a program to rotate the matrix by 90 degrees clockwise.
package Week_5_Multidimensional_Arrays;

import java.util.Scanner;

public class Rotate_Matrix_By_90_Degree {
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

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j){ // or (j > i)
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
            /*
            OR use while loop
            int st = 0, end = m-1;
            while(st < end) {
                int temp = mat[i][st];
                mat[i][st]= mat[i][end] ;
                mat[i][end] = temp;
                st++;
                end--;
            }
            */
        }

        System.out.println("Rotated matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}