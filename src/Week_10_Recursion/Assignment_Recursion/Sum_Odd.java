// Write a program to calculate the sum of odd numbers between a and b (both inclusive) using recursion.
package Week_10_Recursion.Assignment_Recursion;

import java.util.Scanner;

public class Sum_Odd {
    public static int sumOdd(int a, int b) {
        // If a is even, start with the next odd number
        if (a % 2 == 0) {
            a++;
        }
        if (a > b) return 0;
        return a + sumOdd(a + 2, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the ending number (b): ");
        int b = sc.nextInt();

        System.out.println("The sum of odd numbers between " + a + " and " + b + " is: " + sumOdd(a, b));
    }
}
