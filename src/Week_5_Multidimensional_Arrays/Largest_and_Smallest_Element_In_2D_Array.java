package Week_5_Multidimensional_Arrays;

import java.util.Scanner;

public class Largest_and_Smallest_Element_In_2D_Array {
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

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // for maximum value
//                if (mat[i][j] > max) {
//                    max = mat[i][j];
//                }
                max = Math.max(mat[i][j], max);

                // for minimum value
//                if (mat[i][j] < min) {
//                    min = mat[i][j];
//                }
                min = Math.min(mat[i][j], min);
            }
        }

        System.out.println("Maximum value in the given 2D array: " + max);
        System.out.println("Minimum value in the given 2D array: " + min);
    }
}
