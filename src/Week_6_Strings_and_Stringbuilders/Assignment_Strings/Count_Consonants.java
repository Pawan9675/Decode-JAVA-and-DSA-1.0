// Input a string of length n and count all the consonants in the given string.
package Week_6_Strings_and_Stringbuilders.Assignment_Strings;

import java.util.Scanner;

public class Count_Consonants {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a String: ");

        // Read the input string from the user
        String str = sc.nextLine();

        // Initialize a variable to store the count of consonants
        int countConsonants = 0;

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character at position i
            char ch = str.charAt(i);

            // Check if the character is not a vowel (both uppercase and lowercase)
            if (ch != 'a' && ch != 'A' && ch != 'e' && ch != 'E' && ch != 'i' && ch != 'I' && ch != 'o' && ch != 'O' && ch != 'u' && ch != 'U') {
                // If the character is not a vowel, increment the count of consonants
                countConsonants++;
            }
        }

        // Print the number of consonants in the string
        System.out.println("Number of consonants in the string: " + countConsonants);
    }
}
