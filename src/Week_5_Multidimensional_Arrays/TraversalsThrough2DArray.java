package Week_5_Multidimensional_Arrays;

import java.util.Scanner;

public class TraversalsThrough2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows of 2D array: ");
        int m = sc.nextInt();
        System.out.print("Enter the column of 2D array: ");
        int n = sc.nextInt();

        int[][] grid = new int[m][n];                                 // Declaration + Memory allocation

        System.out.println("Number of rows: " + grid.length);         // number of rows
        System.out.println("Number of columns: " + grid[0].length);   // number of columns

        // Input of 2D array
        System.out.println("Enter " + (m * n) + " elements in a 2D array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Output of 2D array
        System.out.println(" Output of 2D Array using 'for loop': ");
        for (int i = 0; i < grid.length; i++) {                      // for rows
            for (int j = 0; j < grid[i].length; j++) {               // for columns
                System.out.print(grid[i][j] + " ");                  // By default, it will take 0 values if we don't assign any value.
            }
            System.out.println();
        }

        System.out.println("Output of 2D array using 'for-each loop': ");
        for (int[] i : grid){
//            System.out.print(i+" ");      -> it will print some absurd or garbage value
            for ( int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
