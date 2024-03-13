// Write a program to store 10 at every index of a 2D matrix with 5 rows and 5 columns.

package Week_5_Multidimensional_Arrays.Assignment_Multidimension_Arrays;

public class Store_10 {
    public static void main(String[] args) {
        // Initialize a 5x5 2D array
        int[][] grid = new int[5][5];

        // Store 10 at each index of the 2D array
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = 10;
            }
        }

        // Print the 2D array
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
