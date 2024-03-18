// Given a string consisting of lowercase English alphabets.
// Print the character that is occurring most number of times.

// This program finds the character that occurs the most number of times in a given string.
// It reads a string input from the user and then uses two nested loops to iterate over each character.
// The outer loop selects a character and the inner loop counts the number of occurrences of that character.
// If the count of the current character is greater than the previously recorded maximum count,
// it updates the maximum count. Finally, it iterates over the string again to print the character(s)
// that occur the maximum number of times.

package Week_6_Strings_and_Stringbuilders;

import java.util.Scanner;

public class Maximum_Occurring_Character_In_a_String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int max = 0;
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            // Count the occurrences of the current character
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) count++;
            }
            // Update the maximum count if a new maximum is found
            if (count > max) max = count;
        }

        // Loop through each character in the string again to print the maximum occurring character(s)
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            // Count the occurrences of the current character
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) count++;
            }
            // Print the character if its count is equal to the maximum count
            if (count == max) System.out.println(ch + " occurs " + max + " times");
        }
    }
}

