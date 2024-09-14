// Given a string, count the total number of consonants in it.
// A consonant is an English alphabet character that is not vowel (a, e, i, o and u).
// Examples of constants are b, c, d, f, and g.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Count_Consonants{

    public static int countConsonants(String str, int index, int count) {
        // Base case: If the index reaches the end of the string, return the count of consonants
        if (index == str.length()) {
            return count;
        }

        // Get the current character
        char currentChar = str.charAt(index);

        // Check if the current character is a consonant (not a vowel and is a letter)
        if (Character.isLetter(currentChar) &&
                !(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' ||
                        currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U')) {
            return countConsonants(str, index + 1, count + 1); // Increment count and continue
        }

        // Continue to the next character without incrementing the count
        return countConsonants(str, index + 1, count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Call countConsonants method and print the result
        System.out.println("Number of consonants: " + countConsonants(inputString, 0, 0));
    }
}
