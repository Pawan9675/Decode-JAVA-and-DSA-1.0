package Week_10_Recursion;

import java.util.Scanner;

public class Stair_Path {
    public static int stairPath(int n){
        if (n <= 2) return n;
        return stairPath(n-1) + stairPath(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int stairs = sc.nextInt();
        System.out.println("Number of ways to reach the top of the stairs: " + stairPath(stairs));
    }
}

