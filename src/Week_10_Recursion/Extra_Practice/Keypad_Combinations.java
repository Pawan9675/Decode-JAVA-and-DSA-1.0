// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
// Return the answer in any order.

package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Keypad_Combinations {

    // Function to recursively generate all possible letter combinations for the given digits
    public static void generateCombinations(String digits, String[] keyPadMapping, String currentCombination) {
        // Base case: if no more digits are left, print the current combination
        if (digits.isEmpty()) {
            System.out.print(currentCombination + " ");
            return;
        }

        // Extract the current digit and find its corresponding letters
        int currentDigit = digits.charAt(0) - '0';
        String lettersForCurrentDigit = keyPadMapping[currentDigit];

        // For each letter corresponding to the current digit, make recursive calls
        for (int i = 0; i < lettersForCurrentDigit.length(); i++) {
            generateCombinations(digits.substring(1), keyPadMapping, currentCombination + lettersForCurrentDigit.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for digits
        System.out.print("Enter a string of digits (2-9): ");
        String userInput = scanner.nextLine();

        // Mapping of digits to corresponding letters (keypad representation)
        String[] keyPadMapping = {
                "",    // 0
                "",    // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs",// 7
                "tuv", // 8
                "wxyz" // 9
        };

        System.out.println("Possible letter combinations for the given digits are:");
        generateCombinations(userInput, keyPadMapping, "");
    }
}

