/*
Observations:
    1. p[i][j] = p[i-1][j] + p[i-1][j-1].
    2. In every row, first and last element is 1.
    3. Jagged array --> ith row has (i+1) columns.

*/
package Week_5_Multidimensional_Arrays.ExtraPractice;

import java.util.Scanner;

public class Pascal_Triangle {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] pascal(int n){
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            // Jagged array --> ith row has (i+1) columns.
            ans[i] = new int[i+1];
            // In every row, first and last element is 1.
            ans[i][0] = ans[i][i] = 1;
            // p[i][j] = p[i-1][j] + p[i-1][j-1].
            for (int j = 1; j < i; j++) {               // j starting from 1 because arr[i][0] already filled with 1 and j < i because arr[i][i] filled with 1
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] ans = pascal(n);
        System.out.println("Pascal Triangle: ");
        printMatrix(ans);
    }
}
