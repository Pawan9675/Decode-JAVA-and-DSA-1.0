package Week_18_BitManipulation;// 💡 Problem Statement:
// ---------------------
// Given an integer `number`, your task is to TURN OFF (make it 0) the **rightmost set bit** (the lowest 1 in binary).
// 🧠 You’ll solve this using two powerful bit manipulation approaches:
//    1️⃣ Using: number & (number - 1)
//    2️⃣ Using: Bitmasking + Position Tracking (manually finding the position of rightmost 1)

// 🚀 Let’s dive in with full explanations, clean code, and meaningful variable names 💫

import java.util.Scanner;

public class TurnOffRightmostSetBit {

    public static void main(String[] args) {

        // 🎯 Step 1: Take Input from the User
        Scanner scanner = new Scanner(System.in);
        System.out.print("🔹 Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        // 🔍 Display the original number in binary format
        System.out.println("\n🔸 Original Number: " + number);
        System.out.println("🔸 Binary Representation: " + Integer.toBinaryString(number));

        // ────────────────────────────────────────────────
        // ✅ Approach 1: Using Bitwise AND (number & (number - 1))
        // ────────────────────────────────────────────────

        /*
         ✨ Explanation:
         Let's say number = 12 → binary = 1100
         Step-by-step:
         - number - 1 = 11 → binary = 1011
         - Now do: 1100 & 1011
                   ----   ----
                    1000 → which is 8

         ✅ This operation clears the **rightmost set bit** in one step. Efficient and cool 😎
        */
        int resultWithAnd = number & (number - 1);

        // 🧾 Output for Approach 1
        System.out.println("\n✅ Approach 1: Using Bitwise AND (number & (number - 1))");
        System.out.println("➡️ Result: " + resultWithAnd);
        System.out.println("➡️ Binary: " + Integer.toBinaryString(resultWithAnd));


        // ────────────────────────────────────────────────
        // ✅ Approach 2: Manual Bitmasking + Position Tracking
        // ────────────────────────────────────────────────

        /*
         ✨ Explanation:
         In this approach, we:
         - Find the position of the rightmost set bit (first 1 from right).
         - Create a bitmask with 0 at that position and 1 everywhere else.
         - AND the original number with that mask → rightmost 1 turns into 0.

         Example:
         - number = 10 → binary = 1010
         - Rightmost set bit is at position 1 (0-based index)
         - Create mask: ~(1 << 1) → ~(0000 0010) → 1111 1101
         - AND it with 1010 → gives 1000 (8)
        */

        int temp = number;         // Copy of the original number
        int position = 0;          // To store the position of the rightmost set bit

        // Step 1: Find the position of rightmost set bit
        while ((temp & 1) == 0 && temp != 0) {
            temp = temp >> 1;      // Right shift to skip 0s
            position++;            // Move to next bit
        }

        // Step 2: Create bitmask with 0 at 'position' and 1 elsewhere
        int bitMask = ~(1 << position);

        // Step 3: Apply the bitmask to turn off that bit
        int resultWithMask = number & bitMask;

        // 🧾 Output for Approach 2
        System.out.println("\n✅ Approach 2: Using Shifting + Bitmasking");
        System.out.println("➡️ Position of rightmost set bit: " + position);
        System.out.println("➡️ Bitmask (in binary): " + Integer.toBinaryString(bitMask));
        System.out.println("➡️ Result: " + resultWithMask);
        System.out.println("➡️ Binary: " + Integer.toBinaryString(resultWithMask));

    }
}
