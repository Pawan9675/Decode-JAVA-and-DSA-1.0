package Week_10_Recursion;

import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static int hcf(int a, int b) {       // Time Complexity: O(min(a,b))
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) return i;
        }
        return 1;
    }

    public static int gcd(int a, int b) {
        if (b % a == 0) return a;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("HCF of " + a + " and " + b + " is: " + hcf(a, b));      // Using for loop
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));      // Using Recursion
    }
}
