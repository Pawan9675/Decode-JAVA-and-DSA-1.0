// Given a string, find its first uppercase letter and return the remaining substring,
// starting from the uppercase letter.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Uppercase_Substring {

    public static String findUppercaseSubstring(String str, int index) {
        // Base case: If the index reaches the end of the string, return a message indicating no uppercase letter was found
        if (index == str.length()) {
            return "No uppercase letter found.";
        }

        // Check if the character at the current index is uppercase
        if (Character.isUpperCase(str.charAt(index))) {
            return str.substring(index); // Return the substring from the current index to the end
        }

        // Recursively call the method for the next index
        return findUppercaseSubstring(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Call findUppercaseSubstring method and print the result
        System.out.println("Substring from first uppercase letter: " + findUppercaseSubstring(inputString, 0));
    }
}
