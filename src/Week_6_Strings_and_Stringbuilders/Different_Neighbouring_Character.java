// Input a string and return the number of times the neighbouring characters are different from each other.
package Week_6_Strings_and_Stringbuilders;

import java.util.Scanner;

/**
 * This class calculates the number of times neighbouring characters in a string are different from each other.
 * It considers each character in the string and checks if it is different from its neighbouring characters.
 * If a character is different from both its left and right neighbours, it is counted as a different neighbour.
 * The count of different neighbours is then printed.
 */
public class Different_Neighbouring_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int count = 0;
        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            // If the string has only one character, there are no different neighbours
            if (str.length() == 1) {
                break;
            }
            // If the string has two different characters, there is one different neighbour
            if (str.length() == 2 && str.charAt(i) != str.charAt(i + 1)) {
                count = 1;
                break;
            }
            // Check for different neighbours at the beginning of the string
            if (i == 0) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    count++;
                }
            }
            // Check for different neighbours at the end of the string
            else if (i == str.length() - 1) {
                if (str.charAt(i) != str.charAt(i - 1)) {
                    count++;
                }
            }
            // Check for different neighbours in the middle of the string
            else if (str.charAt(i) != str.charAt(i + 1) && str.charAt(i) != str.charAt(i - 1)) {
                count++;
            }
        }

        // Print the count of different neighbouring characters
        System.out.println("The number of times neighbouring characters are different: " + count);

    }
}


