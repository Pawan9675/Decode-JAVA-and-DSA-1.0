// Given a string consisting of lowercase English alphabets.
// Print the character that is occurring most number of times.

package Week_6_Strings_and_Stringbuilders;

import java.util.Scanner;

public class Maximum_Occurring_Character_In_a_String2 {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter a string
        System.out.print("Enter the string: ");
        // Read the input string from the user
        String str = sc.next();

        // Create an array to store the frequency of each character (assuming lowercase letters only)
        int[] freq = new int[26];
        // Iterate over each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char ch = str.charAt(i);
            // Calculate the index of the character in the frequency array (assuming lowercase letters only)
            int idx = (int) ch - 97;
            // Increment the frequency count for the character
            freq[idx]++;
            // or freq[(int) str.charAt(i) - 97]++;
        }

        // Find the maximum frequency of any character in the input string
        int maxFreq = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }

        // Print the character(s) with the maximum frequency
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                // Calculate the character corresponding to the current index
                char ch = (char) (i + 97);
                // Print the character
                System.out.println("Most Frequented character: " + ch);
            }
        }


    }
}
