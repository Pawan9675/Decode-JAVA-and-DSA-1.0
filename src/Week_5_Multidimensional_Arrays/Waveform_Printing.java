package Week_5_Multidimensional_Arrays;

import java.util.Scanner;

public class Waveform_Printing {
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
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Printing in Mirror-S formation: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) System.out.print(mat[i][j] + " ");
                else System.out.print(mat[i][n - 1 - j] + " ");
            }
            System.out.println();
            /*We can use this method too:
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            if (i % 2 != 0) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }*/
        }

        System.out.println("Printing in S formation: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 != 0) System.out.print(mat[i][j] + " ");
                else System.out.print(mat[i][n - 1 - j] + " ");
            }
            System.out.println();
        }

        System.out.println("Printing in Mirror N formation: ");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (j % 2 == 0) System.out.print(mat[i][j]+" ");
                else System.out.print(mat[m - 1 - i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Printing in N formation: ");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (j % 2 != 0) System.out.print(mat[i][j]+" ");
                else System.out.print(mat[m - 1 - i][j]+" ");
            }
            System.out.println();
        }
    }
}
