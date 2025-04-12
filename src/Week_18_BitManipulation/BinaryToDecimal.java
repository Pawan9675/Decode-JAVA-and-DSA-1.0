package Week_18_BitManipulation;
// 💡 Problem Statement:
// Convert a binary string to its decimal equivalent using bitwise left shift.
// Example: binary "1010" → decimal 10

public class BinaryToDecimal {

    // 🌟 Method to convert binary string to decimal using shifting
    public static int binaryToDecimal(String binaryString) {
        int length = binaryString.length();    // 📏 Length of the binary string
        int decimalResult = 0;                 // 🧮 Final decimal result

        // 🔁 Loop from right to left (as per positional values)
        for (int index = length - 1; index >= 0; index--) {
            char bitChar = binaryString.charAt(index);      // Get current bit character
            int bit = bitChar - '0';                        // Convert char to int (0 or 1)

            // 📍 Calculate power using left shift (2^position)
            decimalResult += bit * (1 << (length - index - 1));
        }

        return decimalResult;  // ✅ Return the final result
    }

    // 🚀 Main method to test the conversion
    public static void main(String[] args) {
        String binaryInput = "1010";   // 🧪 Example input
        int decimalOutput = binaryToDecimal(binaryInput);

        System.out.println("Binary: " + binaryInput);
        System.out.println("Decimal: " + decimalOutput); // Expected: 10
    }
}
