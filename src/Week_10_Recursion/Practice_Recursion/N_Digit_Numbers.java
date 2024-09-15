// Given the number of digits n in a number,
// print all n-digit numbers whose digits are strictly increasing from left to right.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class N_Digit_Numbers {

    public static void generateIncreasingNumbers(int start, String currentNumber, int digitsRemaining) {
        // Base case: if no digits are remaining to add, print the current number
        if (digitsRemaining == 0) {
            System.out.print(currentNumber + " ");
            return;
        }

        // Recursive case: add the next increasing digit
        for (int i = start; i <= 9; i++) {
            generateIncreasingNumbers(i + 1, currentNumber + i, digitsRemaining - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of digits n from the user
        System.out.print("Enter the number of digits (n): ");
        int n = sc.nextInt();

        // Start generating numbers from digit 0
        generateIncreasingNumbers(0, "", n);
    }
}
