// A string is called beautiful if it consists of only stars(‘*’) and dashes(‘-’).
// Further the number of stars in the first half of the string should be equal to the number of stars in the second half of the string.
// Given a number n, print all the beautiful strings of length n. If the value of n is odd, the middle value can be either '*' or '-'

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Beautiful_Strings2 {

    // Recursive helper function to generate beautiful strings
    public static void generateBeautifulStrings(int n, String current, int firstHalfStars, int secondHalfStars, int index) {
        // Base case: when the string length reaches n
        if (current.length() == n) {
            if (firstHalfStars == secondHalfStars) {
                System.out.println(current);
            }
            return;
        }

        // First half of the string (index < n/2)
        if (index < n / 2) {
            // Option 1: Add a star to the first half
            generateBeautifulStrings(n, current + "*", firstHalfStars + 1, secondHalfStars, index + 1);

            // Option 2: Add a dash to the first half
            generateBeautifulStrings(n, current + "-", firstHalfStars, secondHalfStars, index + 1);
        }
        // Handle the middle character if n is odd
        else if (n % 2 == 1 && index == n / 2) {
            // Middle character can be either star or dash
            generateBeautifulStrings(n, current + "*", firstHalfStars, secondHalfStars, index + 1);
            generateBeautifulStrings(n, current + "-", firstHalfStars, secondHalfStars, index + 1);
        }
        // Second half of the string (index >= n/2)
        else {
            // Add a star to the second half only if it balances the stars from the first half
            if (secondHalfStars < firstHalfStars) {
                generateBeautifulStrings(n, current + "*", firstHalfStars, secondHalfStars + 1, index + 1);
            }

            // Add a dash to the second half
            generateBeautifulStrings(n, current + "-", firstHalfStars, secondHalfStars, index + 1);
        }
    }

    public static void main(String[] args) {
        // Take user input for the length of the string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Start the recursive generation with an empty string
        generateBeautifulStrings(n, "", 0, 0, 0);

        sc.close();
    }
}
