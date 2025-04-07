package Week_18_BitManipulation;
// 📌 Question: Given two numbers, swap them using bit manipulation.

import java.util.Scanner; // Import Scanner for user input

public class SwapNumbers {
    public static void main(String[] args) {
        
        // ✅ Step 1: Take input from the user
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        System.out.print("Enter first number (a): "); 
        int a = sc.nextInt(); // Read first number
        System.out.print("Enter second number (b): "); 
        int b = sc.nextInt(); // Read second number
        sc.close(); // Close Scanner

        // ✅ Step 2: Swap using XOR bitwise operation
        a = a ^ b;  // Step 1: a becomes (a ^ b)
        b = a ^ b;  // Step 2: b becomes (a ^ b ^ b) → b becomes original a
        a = a ^ b;  // Step 3: a becomes (a ^ b ^ a) → a becomes original b

        // ✅ Step 3: Print swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
