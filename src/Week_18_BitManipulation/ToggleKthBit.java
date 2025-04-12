package Week_18_BitManipulation;
// 📌 Question: Given an integer n and a value k, toggle (flip) the k-th bit of n.
// 📎 Note: Bit positions are considered 0-based (rightmost bit is at position 0).
// 🔄 Toggling means:
//     - If the bit is 1 ➤ make it 0
//     - If the bit is 0 ➤ make it 1

import java.util.Scanner;

public class ToggleKthBit {
    public static void main(String[] args) {

        // ✅ Step 1: Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (n): ");
        int n = sc.nextInt();  // Original number
        System.out.print("Enter the bit position to toggle (k): ");
        int k = sc.nextInt();  // Position to toggle (0-based)
        sc.close();

        // ✅ Step 2: Create a bitmask with 1 at the k-th position
        int mask = 1 << k;

        // ✅ Step 3: Use XOR to toggle the k-th bit
        int result = n ^ mask;

        // ✅ Step 4: Print result
        System.out.println("Original number: " + n + " (Binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("After toggling " + k + "-th bit: " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
    }
}
