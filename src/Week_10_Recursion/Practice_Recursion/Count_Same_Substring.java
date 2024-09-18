// Problem Count the number of substrings having same first and last characters.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Count_Same_Substring {

    // Recursive function to count all substrings that start and end with the same character
    public static int countMatchingSubstrings(String input, int start, int end, int length) {
        // Base case 1: A single character substring is always valid
        if (length == 1) return 1;

        // Base case 2: An empty substring or invalid length does not contribute
        if (length <= 0) return 0;

        // Recursive call for reducing the string from both sides
        int result = countMatchingSubstrings(input, start + 1, end, length - 1) +    // Exclude the starting character
                countMatchingSubstrings(input, start, end - 1, length - 1) -    // Exclude the ending character
                countMatchingSubstrings(input, start + 1, end - 1, length - 2); // Exclude both the starting and ending characters

        // If the starting and ending characters are the same, count this substring
        if (input.charAt(start) == input.charAt(end)) result++;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input prompt
        System.out.print("Enter a string to count substrings with matching start and end characters: ");
        String userInput = scanner.next();

        int strLength = userInput.length();

        // Output the result of the recursive function
        System.out.println("Total matching substrings: " + countMatchingSubstrings(userInput, 0, strLength - 1, strLength));

        scanner.close();
    }
}
