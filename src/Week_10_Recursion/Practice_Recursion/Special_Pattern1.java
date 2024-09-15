// A string is called special if it consists of only stars(‘*’) and dashes(‘-’),
// and the number of stars is more than the number of dashes for any prefix of the string.
// Given a positive integer n, print all the special strings of size n.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Special_Pattern1 {

    public static void generateSpecialString(int remainingLength, String currentString, int starCount, int dashCount) {
        // Base case: When remainingLength is 0, the string is complete, so print it
        if (remainingLength == 0) {
            System.out.println(currentString);
            return;
        }

        // Recursive case 1: Add a '*' and continue building the string
        generateSpecialString(remainingLength - 1, currentString + "*", starCount + 1, dashCount);

        // Recursive case 2: Add a '-' only if the number of dashes is less than the number of stars
        if (dashCount < starCount) {
            generateSpecialString(remainingLength - 1, currentString + "-", starCount, dashCount + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the desired length of the special string from the user
        System.out.print("Enter the length of the special string (n): ");
        int n = scanner.nextInt();

        // Start generating special strings from an empty string
        generateSpecialString(n, "", 0, 0);
    }
}
