// Write a program to check given string is palindrome or not.

package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Palindrome_Strings {

    // Recursive function to reverse the string
    public static String reverseString(String input, int currentIndex) {        // Time complexity: O(n^2)
        if (currentIndex == input.length()) {
            return "";
        }

        String reversedPart = reverseString(input, currentIndex + 1);
        return reversedPart + input.charAt(currentIndex);
    }

    // Recursive function to check if the string is a palindrome without reversing
    public static boolean isPalindrome(String input, int start, int end) {      // Time complexity: O(n)
        if (start >= end) return true;
        return (input.charAt(start) == input.charAt(end) && isPalindrome(input, start + 1, end - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // First method: reverse the string and compare with original
        if (userInput.equals(reverseString(userInput, 0))) {
            System.out.println(userInput + " is a Palindrome (using reverse).");
        } else {
            System.out.println(userInput + " is not a Palindrome (using reverse).");
        }

        // Second method: check using the recursive approach
        if (isPalindrome(userInput, 0, userInput.length() - 1)) {
            System.out.println(userInput + " is a Palindrome (using recursion).");
        } else {
            System.out.println(userInput + " is not a Palindrome (using recursion).");
        }
    }
}
