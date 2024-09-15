// A string is called special if it consists of only stars(‘*’) and dashes(‘-’),
// and there are non-consecutive stars in the string. Given a positive integer k, print all the special strings of size k.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Special_Pattern2 {

    public static void generateSpecialString(int remainingLength, String currentString) {
        // Base case: If no characters are left to add, print the current string
        if (remainingLength == 0) {
            System.out.println(currentString);
            return;
        }

        // Case 1: Add a dash ('-') to the current string and recurse
        generateSpecialString(remainingLength - 1, currentString + "-");

        // Case 2: Add a star ('*') only if the last character is not a star
        if (currentString.isEmpty() || currentString.charAt(currentString.length() - 1) != '*') {
            generateSpecialString(remainingLength - 1, currentString + "*");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length of the special string from the user
        System.out.print("Enter the length of the special string (n): ");
        int n = scanner.nextInt();

        // Generate and print all valid special strings
        generateSpecialString(n, "");
    }
}
