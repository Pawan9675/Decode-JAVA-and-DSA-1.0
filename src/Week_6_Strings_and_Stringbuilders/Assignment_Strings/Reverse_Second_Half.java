// Input a string of even length and reverse the second half of the string.
package Week_6_Strings_and_Stringbuilders.Assignment_Strings;

import java.util.Scanner;
public class Reverse_Second_Half {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a String: ");

        // Read the input string from the user
        String str = sc.nextLine();

        // Initialize a new string to store the result
        String newStr = "";

        // Check if the length of the input string is even
        if (str.length() % 2 == 0) {
            // Append the first half of the string to the new string
            newStr += str.substring(0, str.length() / 2);

            // Iterate through the second half of the string in reverse order
            for (int i = str.length() - 1; i >= str.length() / 2; i--) {
                // Append each character of the second half to the new string
                newStr += str.charAt(i);
            }

            // Print the new string with the reversed second half
            System.out.println("String with reversed second half: " + newStr);
        } else {
            // Print a message if the length of the input string is not even
            System.out.println("Length of the string should be of even length");
        }
    }
}
