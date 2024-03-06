package Week_5_Multidimensional_Arrays;

import java.util.Scanner;

public class Addition_Of_Two_Matrices_Without_Using_Extra_Array {
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
        int k = sc.nextInt();
        System.out.print("Enter the column of second 2D array: ");
        int l = sc.nextInt();

        int[][] mat2 = new int[k][l];

        System.out.println("Enter " + (k * l) + " elements in a second 2D array: ");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        int[][] res = new int[m][n];
        boolean flag = true;

        if (m == k && n == l){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    res[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
        }
        else {
            System.out.println("ADDITION NOT POSSIBLE!");
            flag = false;
        }

        if (flag){
            System.out.println("Addition of two matrices: ");
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[i].length; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
