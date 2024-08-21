// Find m-th summation of first n natural numbers where m-th summation of first n natural numbers is defined as following:
// If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
// Else :SUM(n, 1) = Sum of first n natural numbers.
package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Mth_Summation {
    public static int sumOfN(int n) {
        if (n == 0) return 0;
        return n + sumOfN(n - 1);
    }

    public static int sum(int n, int m) {
        if (m == 1) return sumOfN(n);
        int previousSum = sum(n, m - 1);
        return sum(previousSum, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (the number to sum up to): ");
        int n = sc.nextInt();
        System.out.print("Enter m (the number of times to perform the summation): ");
        int m = sc.nextInt();

        System.out.println("The result of the " + m + "-th summation of the first " + n + " natural numbers is: " + sum(n, m));
    }
}
