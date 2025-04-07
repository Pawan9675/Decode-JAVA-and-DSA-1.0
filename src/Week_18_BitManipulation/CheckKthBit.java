package Week_18_BitManipulation;
// 📌 Question: Given an integer n and a value k, check whether the k-th bit is set (1) or not (0).
// 📎 Note: k is 0-based (i.e., the least significant bit is at position 0).

import java.util.Scanner;

public class CheckKthBit {
    public static void main(String[] args) {

        // ✅ Step 1: Input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (n): ");
        int n = sc.nextInt(); // The number to check
        System.out.print("Enter the bit position (k): ");
        int k = sc.nextInt(); // The bit position to check (0-based)
        sc.close();

        // ✅ Step 2: Approach 1 - Using Bitwise AND (Masking)
        // Create a mask with 1 at k-th position: 1 << k
        int mask = 1 << k;

        if ((n & mask) != 0) {
            System.out.println("[Approach 1] The " + k + "-th bit is SET (1).");
        } else {
            System.out.println("[Approach 1] The " + k + "-th bit is NOT SET (0).");
        }

        // ✅ Step 3: Approach 2 - Right Shift and AND with 1
        // Shift number n to the right by k positions, then check the least significant bit
        int shifted = n >> k;

        if ((shifted & 1) != 0) {
            System.out.println("[Approach 2] The " + k + "-th bit is SET (1).");
        } else {
            System.out.println("[Approach 2] The " + k + "-th bit is NOT SET (0).");
        }
    }
}
