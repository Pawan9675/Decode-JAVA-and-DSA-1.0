// Write a program to merge 2 strings alternately using recursion starting from the first input string.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Merge_String_Alternatively {

    public static String mergeAlternately(String firstString, String secondString, String mergedString) {
        // Base case: If the first string is empty, append the rest of the second string
        if (firstString.isEmpty()) {
            mergedString += secondString;
            return mergedString;
        }
        // Base case: If the second string is empty, append the rest of the first string
        if (secondString.isEmpty()) {
            mergedString += firstString;
            return mergedString;
        }

        // Add the first character from both strings alternately to the merged result
        mergedString += firstString.charAt(0); // Take the first character from firstString
        mergedString += secondString.charAt(0); // Take the first character from secondString

        // Recursively call mergeAlternately with the remaining substrings
        return mergeAlternately(firstString.substring(1), secondString.substring(1), mergedString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Input the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Call mergeAlternately method and print the result
        System.out.println("Merged String: " + mergeAlternately(firstString, secondString, ""));

    }
}
