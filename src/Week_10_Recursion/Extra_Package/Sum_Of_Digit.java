// Given an integer, find out the sum of its digits using recursion.

package Week_10_Recursion.Extra_Package;

import java.util.Scanner;

public class Sum_Of_Digit {
    public static int sumOfDigit(int n) {
        if (n >= 0 && n <= 9) return n;
        return sumOfDigit(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits of the number " + num + " is: " + sumOfDigit(num));

    }
}

