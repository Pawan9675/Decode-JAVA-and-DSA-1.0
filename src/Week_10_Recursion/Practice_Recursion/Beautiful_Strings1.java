// A string is called beautiful if is an even length string consisting of only stars(‘*’) and dashes(‘-’). 
// Further the number of stars in the first half of the string should be equal to the number of stars in the second half of the string. 
// Given a number n, print all the beautiful strings of length 2 * n.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Beautiful_Strings1 {

    // Helper function to recursively generate beautiful strings of length 2 * n
    public static void generateBeautifulStrings(int n, String current, int firstHalfStars, int secondHalfStars, int index) {
        // Base case: When the string length reaches 2 * n, check if the string is beautiful
        if (current.length() == 2 * n) {
            // A beautiful string must have an equal number of stars in both halves
            if (firstHalfStars == secondHalfStars) {
                System.out.println(current);  // Print the string if it's beautiful
            }
            return;
        }

        // First half of the string (index < n)
        if (index < n) {
            // Option 1: Add a star to the first half
            generateBeautifulStrings(n, current + "*", firstHalfStars + 1, secondHalfStars, index + 1);

            // Option 2: Add a dash to the first half
            generateBeautifulStrings(n, current + "-", firstHalfStars, secondHalfStars, index + 1);
        }
        // Second half of the string (index >= n)
        else {
            // Option 1: Add a star to the second half only if it can balance the stars from the first half
            if (secondHalfStars < firstHalfStars) {
                generateBeautifulStrings(n, current + "*", firstHalfStars, secondHalfStars + 1, index + 1);
            }

            // Option 2: Add a dash to the second half
            generateBeautifulStrings(n, current + "-", firstHalfStars, secondHalfStars, index + 1);
        }
    }

    public static void main(String[] args) {
        // Input scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n (half the length of the string): ");
        int n = sc.nextInt();

        // Start generating beautiful strings with an empty string and 0 stars in both halves
        generateBeautifulStrings(n, "", 0, 0, 0);

        sc.close(); // Close the scanner
    }
}
