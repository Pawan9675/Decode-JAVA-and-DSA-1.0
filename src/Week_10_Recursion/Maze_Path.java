package Week_10_Recursion;

import java.util.Scanner;

public class Maze_Path {
    public static int mazePath1(int row, int col, int r, int c) {
        if (row == r || col == c) return 1;
        /*
        Another Base Case:
        if (row == r && col == c) return 1;
        if (row > r || col > c) return 0;
        */
        int rightWays = mazePath1(row, col + 1, r, c);
        int downWays = mazePath1(row + 1, col, r, c);
        return rightWays + downWays;
    }

    public static void printPath(int row, int col, int r, int c, String s) {
        if (row > r || col > c) return;
        if (row == r && col == c) {
            System.out.println(s);      // Destination Reached
            return;
        }
        printPath(row, col + 1, r, c, s + "R");     // Right
        printPath(row + 1, col, r, c, s + "D");     // Down
    }

    public static int mazePath2(int r, int c) {
        if (r == 1 || c == 1) return 1;

        int rightWays = mazePath2(r, c - 1);
        int downWays = mazePath2(r - 1, c);
        return rightWays + downWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the maze: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns of the maze: ");
        int c = sc.nextInt();

        System.out.println("Number of paths through the maze: " + mazePath1(1, 1, r, c));
        System.out.println("Number of paths through the maze: " + mazePath2(r, c));
        System.out.println("Paths through the maze: ");
        printPath(1, 1, r, c, "");
    }
}
