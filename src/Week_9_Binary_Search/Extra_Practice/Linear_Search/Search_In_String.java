package Week_9_Binary_Search.Extra_Practice.Linear_Search;

import java.util.Scanner;

public class Search_In_String {
    /**
     * This method searches for a target character in the given string.
     * If the target character is found, it prints the index of the character in the string.
     * If the target character is not found, it prints a message indicating so.
     */
    public static void searchInString(String str, char target) {
        // Check if the string is empty
        if (str.isEmpty()) {
            return;
        }

        // Perform linear search
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                // If target character is found, print its index and return
                System.out.println("Target " + target + " found at index: " + i);
                return;
            }
        }
        // If target character is not found, print a message
        System.out.println("Target " + target + " not found!!!");

        /*
        // Use for-each loop to iterate over the characters in the string
        int index = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                // If target character is found, print its index and return
                System.out.println("Target " + target + " found at index: " + index);
                return;
            }
            index++;
        }
        // If target character is not found, print a message
        System.out.println("Target " + target + " not found!!!");
         */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the string
        System.out.print("Enter the String: ");
        String str = sc.next();

        // Prompt user to enter the target character to search
        System.out.print("Enter the target: ");
        char target = sc.next().charAt(0);

        // Call the searchInString method to search for the target character in the string
        searchInString(str, target);
    }
}
