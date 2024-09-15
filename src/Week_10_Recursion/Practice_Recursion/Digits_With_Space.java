// Given an input string of digits, find all combinations of numbers that can be formed using digits in the same order.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Digits_With_Space {

    public static void generateCombinations(String inputString, int currentIndex, String currentCombination) {
        // Base case: If we've processed all digits, print the current combination
        if (currentIndex == inputString.length()) {
            System.out.println(currentCombination);
            return;
        }

        // Recursive case 1: Add the current digit without a space
        generateCombinations(inputString, currentIndex + 1, currentCombination + inputString.charAt(currentIndex));

        // Recursive case 2: If not the last digit, add the current digit followed by a space
        if (currentIndex != inputString.length() - 1) {
            generateCombinations(inputString, currentIndex + 1, currentCombination + inputString.charAt(currentIndex) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string of digits from the user
        System.out.print("Enter the string of digits: ");
        String inputString = sc.nextLine();

        // Call the function to generate and print all possible combinations
        generateCombinations(inputString, 0, "");
    }
}
