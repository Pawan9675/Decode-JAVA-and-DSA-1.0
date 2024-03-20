// Input a string and return the number of substrings that contain only vowels.
package Week_6_Strings_and_Stringbuilders.Assignment_Strings;

import java.util.Scanner;

public class Substring_Contain_Vowels {
    // Function to check if a string contains only vowels
    public static boolean containsOnlyVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is not a vowel
            if (ch != 'a' && ch != 'A' && ch != 'e' && ch != 'E' && ch != 'i' && ch != 'I' && ch != 'o' && ch != 'O' && ch != 'u' && ch != 'U') {
                return false;
            }
        }
        return true; // Return true if all characters are vowels
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();

        int count = 0; // Initialize a variable to store the count of substrings containing only vowels

        // Iterate through each starting index of the substring
        for (int i = 0; i < str.length(); i++) {
            // Iterate through each ending index of the substring
            for (int j = i + 1; j <= str.length(); j++) {
                // Get the substring from index i to j
                String subString = str.substring(i, j);
                // Check if the substring contains only vowels
                if (containsOnlyVowels(subString)) {
                    count++; // Increment the count if the substring contains only vowels
                }
            }
        }

        // Print the count of substrings containing only vowels
        System.out.println("Number of substrings that contain only vowels: " + count);
    }
}
