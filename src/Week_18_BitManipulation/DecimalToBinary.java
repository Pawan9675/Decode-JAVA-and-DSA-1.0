package Week_18_BitManipulation;
// 💡 Problem Statement:
// Convert a given decimal number to its binary representation using division by 2.

public class DecimalToBinary {

    // 🌟 Method to convert decimal number to binary string
    public static String decimalToBinary(int decimalNumber) {
        String binaryString = "";  // 🌱 Initially empty

        // 🌀 Keep dividing until the number becomes 0
        while (decimalNumber > 0) {
            // 💥 Add remainder to the front (0 or 1)
            if (decimalNumber % 2 == 0) {
                binaryString = "0" + binaryString;
            } else {
                binaryString = "1" + binaryString;
            }

            // 🔄 Divide the number by 2 to move to next bit
            decimalNumber = decimalNumber / 2;      // decimalNumber = decimalNumber >> 1;
        }

        // 🌈 If the number was 0, return "0"
        return binaryString.isEmpty() ? "0" : binaryString;
    }

    // 🚀 Main method to test the conversion
    public static void main(String[] args) {
        int inputNumber = 13;

        // 🧪 Example Output
        System.out.println("Decimal: " + inputNumber);
        System.out.println("Binary: " + decimalToBinary(inputNumber)); // Expected: 1101
    }
}

/*
Note:
x << 1 = x * 2
x << 2 = x * 2^2
x << 3 = x * 2^3
x << n = x * 2^n

x >> 1 = x / 2
x >> 2 = x / 2^2
x >> 3 = x / 2^3
x >> n = x / 2^n

x & 1 = x % 2
x & 2 = x % 2^2
x & 3 = x % 2^3
x & n = x % (2^n)
*/