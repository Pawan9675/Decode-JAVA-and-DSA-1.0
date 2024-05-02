// Given two numbers p & q, find the value p^q using a recursive function.

package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Power {
    public static int calculatePower1(int base, int exponent) {      // Time Complexity: O(exponent)
        if (exponent == 0) return 1;
        return calculatePower1(base, exponent - 1) * base;
    }

    public static int calculatePower2(int base, int exponent) {     // Time Complexity: O(log(exponent))
        if (exponent == 0) return 1;
        int smallPower = calculatePower2(base, exponent / 2);
        if (exponent % 2 == 0) return smallPower * smallPower;      // even
        else return base * smallPower * smallPower;                 // odd
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int base = sc.nextInt();
        System.out.print("Enter an exponent: ");
        int exponent = sc.nextInt();

        System.out.println("Result of " + base + " raised to the power of " + exponent + " is: " + calculatePower1(base, exponent));
        System.out.println("Result of " + base + " raised to the power of " + exponent + " is: " + calculatePower2(base, exponent));

    }
}
