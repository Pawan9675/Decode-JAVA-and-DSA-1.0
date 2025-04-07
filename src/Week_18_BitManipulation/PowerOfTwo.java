package Week_18_BitManipulation;
// 📌 Question: Given an integer n, find 2^n using bit manipulation.

import java.util.Scanner; // Import Scanner for user input

public class PowerOfTwo {
    public static void main(String[] args) {
        
        // ✅ Step 1: Take input from the user
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        System.out.print("Enter the value of n: "); // Prompt user
        int n = sc.nextInt(); // Read integer input
        sc.close(); // Close Scanner

        // ✅ Step 2: Compute 2^n using bit manipulation
        int result = 1 << n;  // Using left shift (1 << n) to compute 2^n

        // ✅ Step 3: Print the result
        System.out.println("2^" + n + " = " + result); // Display output
    }
}
