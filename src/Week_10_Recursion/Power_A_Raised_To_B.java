package Week_10_Recursion;

import java.util.Scanner;

public class Power_A_Raised_To_B {
    public static int powLinear(int a, int b){      // Time Complexity: O(b)
        if (b == 0) return 1;
        return a * powLinear(a, b - 1);
    }
    public static int powLogarithm(int a, int b){  // Time Complexity: O(log b)
        if (b == 0) return 1;
        int ans = powLogarithm(a, b/2);
        if (b % 2 == 0) return ans * ans;
        else return a * ans * ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the exponent (b): ");
        int b = sc.nextInt();

        System.out.println("The result of " + a + " raised to the power of " + b + " is: " + powLinear(a, b));
        System.out.println("The result of " + a + " raised to the power of " + b + " is: " + powLogarithm(a, b));
    }
}
