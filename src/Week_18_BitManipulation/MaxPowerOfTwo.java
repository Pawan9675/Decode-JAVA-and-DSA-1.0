// 💡 Problem Statement:
// Given an integer `n`, find the maximum power of 2 that is strictly smaller than `n`.
//
// Example:
// n = 20 → Output: 16
// n = 1 → Output: 0 (since no power of 2 is < 1)

package Week_18_BitManipulation;

import java.util.Scanner;

public class MaxPowerOfTwo {

    // 🔹 Approach 1: Bitwise Method (using rightmost set bit removal)
    public static int findMaxPowerOfTwo_ByBitwiseRemoval(int inputNumber) {
        int maxPowerOfTwo = 0;
        int currentValue = inputNumber;

        while (currentValue != 0) {
            maxPowerOfTwo = currentValue;
            currentValue = currentValue & (currentValue - 1); // Removes rightmost set bit
        }

        // If input is a power of 2, return the next smaller power
        if (maxPowerOfTwo == inputNumber) {
            return maxPowerOfTwo / 2;
        }

        return maxPowerOfTwo;
    }

    // 🔹 Approach 2: Loop-Based Power Finder
    public static int findMaxPowerOfTwo_ByLoop(int inputNumber) {
        int maxPowerOfTwo = 1;

        while (maxPowerOfTwo * 2 < inputNumber) {
            maxPowerOfTwo *= 2;
        }

        return maxPowerOfTwo;
    }

    // 🔹 Approach 3: Bitwise OR Trick (Fastest Bit Hack)
    public static int findMaxPowerOfTwo_ByBitHack(int inputNumber) {
        // Handle edge case
        if (inputNumber <= 1) return 0;

        inputNumber--;
        inputNumber |= (inputNumber >> 1);
        inputNumber |= (inputNumber >> 2);
        inputNumber |= (inputNumber >> 4);
        inputNumber |= (inputNumber >> 8);
        inputNumber |= (inputNumber >> 16);
        return (inputNumber + 1) >> 1;
    }

    // 🔸 Main method with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("💬 Enter an integer: ");
        int userInput = scanner.nextInt();

        int resultBitwiseRemoval = findMaxPowerOfTwo_ByBitwiseRemoval(userInput);
        int resultLoopMethod = findMaxPowerOfTwo_ByLoop(userInput);
        int resultBitHack = findMaxPowerOfTwo_ByBitHack(userInput);

        System.out.println("\n🔍 Results:");
        System.out.println("✔ Max Power of 2 Less Than Input (Bitwise Removal): " + resultBitwiseRemoval);
        System.out.println("✔ Max Power of 2 Less Than Input (Loop Method): " + resultLoopMethod);
        System.out.println("✔ Max Power of 2 Less Than Input (Bit Hack Method): " + resultBitHack);

        scanner.close();
    }
}
