// Given a string, return the number of lowercase characters in it using recursion.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Count_Lowercase {

    public static int countLowercase(String str, int index, int count) {
        // Base case: If the index reaches the end of the string, return the count of lowercase letters
        if (index == str.length()) {
            return count;
        }

        // Get the current character
        char currentChar = str.charAt(index);

        // Check if the current character is a lowercase letter
        if (Character.isLowerCase(currentChar)) {
            // Increment the count and continue with the next character
            return countLowercase(str, index + 1, count + 1);
        }

        // Continue to the next character without incrementing the count
        return countLowercase(str, index + 1, count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Call countLowercase method and print the result
        System.out.println("Number of lowercase letters: " + countLowercase(inputString, 0, 0));
    }
}
