/*
Given the Binary code of a number as a decimal number, we need to convert this into its  equivalent Gray Code.
In gray code, only one bit is changed in 2 consecutive numbers.
Hint: The Most Significant Bit (MSB) of the gray code is always equal to the MSB of the given
binary code and other bits of the output gray code can be obtained by XORing binary code a bit
at that index and previous index.
*/
package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Binary_To_Gray{
    public static int convertBinaryToGray(int binary) {
        // Base case: If the binary number is 0, return 0 (Gray code of 0 is 0)
        if (binary == 0) return 0;

        // Extract the least significant bit from the binary number
        int currentBit = binary % 10;
        // Remove the least significant bit from the binary number for further processing
        binary = binary / 10;
        // Extract the next bit (second least significant bit)
        int nextBit = binary % 10;

        /*
         * Gray code calculation:
         * For each pair of consecutive bits (currentBit and nextBit):
         * - If the two bits are different (one is 0 and the other is 1), the Gray bit is 1.
         * - If both bits are the same, the Gray bit is 0.
         *
         * The recursive call reduces the binary number and continues the conversion for the rest of the digits.
         */
        if ((currentBit == 0 && nextBit == 1) || (currentBit == 1 && nextBit == 0)) {
            // If the bits differ, append 1 as the Gray bit and recurse for the rest
            return 1 + convertBinaryToGray(binary) * 10;
        } else {
            // If the bits are the same, append 0 as the Gray bit and recurse for the rest
            return 0 + convertBinaryToGray(binary) * 10;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binaryNumber = input.nextInt();

        int grayCode = convertBinaryToGray(binaryNumber);
        System.out.println("Equivalent Gray code: " + grayCode);
    }
}
