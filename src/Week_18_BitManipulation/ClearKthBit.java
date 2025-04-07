package Week_18_BitManipulation;
// 📌 Question: Given an integer n and a value k, turn OFF (clear) the k-th bit of n.
// 📎 Note: Bit positions are considered 0-based (rightmost bit is at position 0).

import java.util.Scanner;

public class ClearKthBit {
    public static void main(String[] args) {

        // ✅ Step 1: Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (n): ");
        int n = sc.nextInt();  // Number in which we want to clear the bit
        System.out.print("Enter the bit position to clear (k): ");
        int k = sc.nextInt();  // Bit position to turn OFF (0-based)
        sc.close();

        // ✅ Step 2: Create a bitmask where only k-th bit is 0 and all others are 1
        // (1 << k) → bitmask with 1 at k-th position
        // ~(1 << k) → inverts the bits, making k-th position 0
        int mask = ~(1 << k);

        // ✅ Step 3: Use bitwise AND to clear the k-th bit
        int result = n & mask;

        // ✅ Step 4: Print result
        System.out.println("Original number: " + n + " (Binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("After clearing " + k + "-th bit: " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
    }
}
