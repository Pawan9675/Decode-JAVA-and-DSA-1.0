// Given a string, find the length of the longest common substring from two given strings.
package Week_10_Recursion.Assignment_Recursion;

import java.util.Scanner;

public class Longest_Common_Substring {

    public static int longestCommonSubstring(String s1, String s2, int index1, int index2, int currentLength) {
        // Base case: If either string has been fully traversed, return the current length
        if (index1 == s1.length() || index2 == s2.length()) {
            return currentLength;
        }

        // If the characters at the current indices match
        if (s1.charAt(index1) == s2.charAt(index2)) {
            // Recur with the next indices and increment the current length
            return longestCommonSubstring(s1, s2, index1 + 1, index2 + 1, currentLength + 1);
        }

        // If characters don't match, find the length of common substrings by advancing one index at a time
        int length1 = longestCommonSubstring(s1, s2, index1 + 1, index2, 0);
        int length2 = longestCommonSubstring(s1, s2, index1, index2 + 1, 0);

        // Return the maximum length found
        return Math.max(currentLength, Math.max(length1, length2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        // Start the recursion from the beginning of both strings with a current length of 0
        int longestCommonLength = longestCommonSubstring(s1, s2, 0, 0, 0);
        System.out.println("The length of the longest common substring is: " + longestCommonLength);
    }
}
