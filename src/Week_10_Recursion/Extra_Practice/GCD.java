package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class GCD {
    public static int gcd_iterative(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static int gcd_recursive(int x, int y){
        if (y == 0) return x;
        return gcd_recursive(y, x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        System.out.println("GCD of " + x + " and " + y + " is: " + gcd_iterative(x, y));
        System.out.println("GCD of " + x + " and " + y + " is: " + gcd_recursive(x, y));
    }
}
