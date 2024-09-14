/*
Count all the possible paths on an m x n grid from top left (grid[0][0]) to bottom right (grid[m-1][n-1])
having constraints that from each cell you can either move only to right or down
*/
package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Grid_Path {
    public static int gridPath(int row, int col, int r, int c) {
        if (row >= r || col >= c) return 0;
        if (row == r-1 && col == c-1) return 1;
        int rightWays = gridPath(row, col + 1, r, c);
        int downWays = gridPath(row + 1, col, r, c);
        return rightWays + downWays;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the grid: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns of the grid: ");
        int c = sc.nextInt();

        System.out.println("Number of paths through the grid: " + gridPath(0, 0, r, c));
    }
}

