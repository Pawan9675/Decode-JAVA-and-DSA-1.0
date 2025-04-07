package Week_18_BitManipulation;
// 📌 Question: Given an integer n and a value k, turn ON (set) the k-th bit of n.
// 📎 Note: Bit positions are considered 0-based (rightmost bit is at position 0).

import java.util.Scanner;

public class SetKthBit {
    public static void main(String[] args) {

        // ✅ Step 1: Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (n): ");
        int n = sc.nextInt();  // Number in which we want to set the bit
        System.out.print("Enter the bit position to set (k): ");
        int k = sc.nextInt();  // Position of bit to set (0-based)
        sc.close();

        // ✅ Step 2: Create a bitmask with 1 at the k-th position
        int mask = 1 << k;

        // ✅ Step 3: Use bitwise OR to set the k-th bit
        int result = n | mask;

        // ✅ Step 4: Print result
        System.out.println("Original number: " + n + " (Binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("After setting " + k + "-th bit: " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
    }
}
