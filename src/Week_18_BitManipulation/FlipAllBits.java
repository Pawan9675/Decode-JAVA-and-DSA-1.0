package Week_18_BitManipulation;

// 💡 Problem Statement:
// Given an integer `n`, flip all of its bits.
// That is, convert all 1's to 0's and all 0's to 1's in the binary representation of `n`.
//
// Example:
// Input: n = 5  → Binary: 000...0101 → Output: 111...1010
// Input: n = 0  → Binary: 000...0000 → Output: 111...1111

import java.util.Scanner;

public class FlipAllBits {

    // 🔹 Approach 1: Using Bitwise NOT (~) operator (works with signed int representation)
    public static int flipBits_UsingTilde(int number) {
        return ~number;
    }

    // 🔹 Approach 2: Using XOR with a 32-bit bitmask
    public static int flipBits_UsingMask(int number) {
        return number ^ 0xFFFFFFFF;
    }

    // 🔹 Approach 3: Manual Bit Flip (only flips till the highest set bit)
    public static int flipBits_Manual(int number) {
        int result = 0;
        int position = 0;
        int current = number;

        while (current != 0) {
            int currentBit = (current & 1) == 0 ? 1 : 0; // Flip the bit
            result |= (currentBit << position);
            current >>= 1;
            position++;
        }

        return result;
    }

    // 🔹 Approach 4: Flip All Bits Using XOR of all 1s till next power of 2
    public static int flipBits_UsingXORWithNextPower(int number) {
        if (number == 0) return 1;

        int maxPowerBeforeInput = 0;
        int currentValue = number;

        // Remove rightmost set bits and track last remaining
        while (currentValue != 0) {
            maxPowerBeforeInput = currentValue;
            currentValue = currentValue & (currentValue - 1);
        }

        // Create mask with all 1s till highest set bit
        int mask = (maxPowerBeforeInput << 1) - 1;
        return number ^ mask;
    }

    // 🔹 Approach 5: Use Bit Trick to find smallest power of 2 greater than number and XOR with that - 1
    public static int flipBits_UsingBitTrick(int number) {
        if (number == 0) return 1;

        number--; // Reduce to make it strictly greater
        number |= number >> 1;
        number |= number >> 2;
        number |= number >> 4;
        number |= number >> 8;
        number |= number >> 16;

        int mask = number + 1; // This is the next power of 2
        return (mask - 1) ^ number;
    }

    // 🔸 Main method to take user input and test all approaches
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("💬 Enter an integer to flip its bits: ");
        int userInput = scanner.nextInt();
        scanner.close();

        System.out.println("\n🔍 Results:");
        System.out.println("✔ Original Number (Binary): " + Integer.toBinaryString(userInput));

        int flippedTilde = flipBits_UsingTilde(userInput);
        System.out.println("1️⃣ Using ~ operator: " + flippedTilde + " → " + Integer.toBinaryString(flippedTilde));

        int flippedMask = flipBits_UsingMask(userInput);
        System.out.println("2️⃣ Using XOR with 0xFFFFFFFF: " + flippedMask + " → " + Integer.toBinaryString(flippedMask));

        int flippedManual = flipBits_Manual(userInput);
        System.out.println("3️⃣ Manual Bit Flip: " + flippedManual + " → " + Integer.toBinaryString(flippedManual));

        int flippedXor = flipBits_UsingXORWithNextPower(userInput);
        System.out.println("4️⃣ Using XOR till next power of 2: " + flippedXor + " → " + Integer.toBinaryString(flippedXor));

        int flippedBitTrick = flipBits_UsingBitTrick(userInput);
        System.out.println("5️⃣ Using Bit Manipulation Trick: " + flippedBitTrick + " → " + Integer.toBinaryString(flippedBitTrick));
    }
}
