// 💡 Problem Statement:
// Given an integer `n`, find the minimum power of 2 that is strictly greater than `n`.
//
// Example:
// n = 5  → Output: 8
// n = 17 → Output: 32
// n = 64 → Output: 128

package Week_18_BitManipulation;

import java.util.Scanner;

public class MinPowerOfTwo {

    // 🔹 Approach 1: Simple Loop Method
    public static int findMinPowerOfTwo_Loop(int inputNumber) {
        int powerOfTwo = 1;

        // Keep doubling until the number becomes strictly greater than input
        while (powerOfTwo <= inputNumber) {
            powerOfTwo *= 2;
        }

        return powerOfTwo;
    }

    // 🔹 Approach 2: Bitwise Method (rightmost set bit removal)
    public static int findMinPowerOfTwo_Bitwise(int inputNumber) {
        int maxPowerBeforeInput = 0;
        int currentValue = inputNumber;

        // Remove rightmost set bits and track the last remaining value
        while (currentValue != 0) {
            maxPowerBeforeInput = currentValue;
            currentValue = currentValue & (currentValue - 1); // Removes rightmost set bit
        }

        // Return the next power (multiply by 2)
        return maxPowerBeforeInput << 1;
    }

    // 🔹 Approach 3: Optimized Bit Hack (Fastest way to find next power of 2)
    public static int findMinPowerOfTwo_BitHack(int inputNumber) {
        if (inputNumber == 0) return 1;

        inputNumber--;  // Make it strictly greater

        inputNumber |= inputNumber >> 1;
        inputNumber |= inputNumber >> 2;
        inputNumber |= inputNumber >> 4;
        inputNumber |= inputNumber >> 8;
        inputNumber |= inputNumber >> 16;

        return inputNumber + 1;
    }

    // 🔸 Main method with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("💬 Enter an integer: ");
        int userInput = scanner.nextInt();

        int resultUsingLoop = findMinPowerOfTwo_Loop(userInput);
        int resultUsingBitwise = findMinPowerOfTwo_Bitwise(userInput);
        int resultUsingBitHack = findMinPowerOfTwo_BitHack(userInput);

        System.out.println("\n🔍 Results:");
        System.out.println("✔ Min Power of 2 Greater Than Input (Loop Approach): " + resultUsingLoop);
        System.out.println("✔ Min Power of 2 Greater Than Input (Bitwise Approach): " + resultUsingBitwise);
        System.out.println("✔ Min Power of 2 Greater Than Input (Bit Hack Approach): " + resultUsingBitHack);

        scanner.close();
    }
}
