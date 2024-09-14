// Given a string, recursively implement atoi() or Integer.parseInt() method on it
// without actually using the method.

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Convert_To_Integer{

    public static int convertToInteger(String str, int index) {
        // Base case: if the index is 0, return the integer value of the first character
        if (index == 0) {
            return str.charAt(0) - '0';
        }
        // Recursively call the method for the previous index and build the integer value
        return convertToInteger(str, index - 1) * 10 + (str.charAt(index) - '0');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Check if the input string is empty
        if (inputString.isEmpty()) {
            System.out.println("The input string is empty.");
        } else {
            // Call convertToInteger method and print the result
            System.out.println("Converted integer: " + convertToInteger(inputString, inputString.length() - 1));
        }
    }
}
