// Input a string of length less than 10 and convert it into integer without using builtin function.
package Week_6_Strings_and_Stringbuilders.Assignment_Strings;

import java.util.Scanner;

public class Convert_To_Integer {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a String: ");

        // Read the input string from the user
        String str = sc.next();

        // Initialize a variable to store the final integer value
        int ans = 0;

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // Convert the character to its integer value by subtracting the ASCII value of '0'
            // This works because the ASCII value of '0' is 48, and the ASCII values of digits '0' to '9' are 48 to 57
            // So, subtracting '0' from any digit character will give its integer value
            int digitValue = (int) str.charAt(i) - '0'; // Convert the character digit to its corresponding numeric value by subtracting the ASCII value of '0'


            // Multiply the current result by 10 and add the integer value of the current digit
            // This is done to shift the previous digits to the left and add the current digit at the units place
            ans = ans * 10 + digitValue;
        }

        // Print the final integer value
        System.out.println(ans);
    }
}

