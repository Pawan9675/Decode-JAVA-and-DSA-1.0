// You are given a string s. All the characters in s are distinct.
// Your task is to generate all the strings that contain the characters of ‘s’ in increasing order.

package Week_10_Recursion.Practice_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Increasing_Substring {

    // Recursive function to generate all increasing substrings
    public static void generateIncreasingSubstrings(String input, int currentIndex, String currentSubstring) {
        // Base case: if we reach the end of the string
        if (currentIndex == input.length()) {
            if (!currentSubstring.isEmpty()) {  // If the current substring is non-empty
                System.out.println(currentSubstring);  // Print the current substring
            }
            return;
        }

        // Recursive case 1: include the current character in the substring
        generateIncreasingSubstrings(input, currentIndex + 1, currentSubstring + input.charAt(currentIndex));

        // Recursive case 2: exclude the current character and move to the next
        generateIncreasingSubstrings(input, currentIndex + 1, currentSubstring);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input: prompt to enter a string
        System.out.print("Enter a string to generate its increasing substrings: ");
        String userInput = scanner.nextLine();

        // Convert the string to a character array and sort it to ensure increasing order
        char[] characters = userInput.toCharArray();
        Arrays.sort(characters);
        String sortedString = new String(characters);  // Convert back to string after sorting

        // Call the recursive function to generate increasing substrings
        generateIncreasingSubstrings(sortedString, 0, "");

        scanner.close();
    }
}
