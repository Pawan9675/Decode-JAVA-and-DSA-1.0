// Calculate the number of ways in which a person can climb n stairs if he can take exactly 1, 2 or 3 steps at each level.
package Week_10_Recursion.Assignment_Recursion;

import java.util.Scanner;

public class Stair_Path {
    public static int stairPath(int n){
        if (n <= 2) return n;
        if (n == 3) return 4;
        return stairPath(n-1) + stairPath(n-2) + stairPath(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int stairs = sc.nextInt();
        System.out.println("Number of ways to reach the top of the stairs: " + stairPath(stairs));
    }
}
