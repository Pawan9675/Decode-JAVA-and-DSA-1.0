// Write a program to check a given number is palindrome or not.

package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Palindrome_Number {

    // Function to reverse the number using recursion
    public static int reverseNumber(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        reversed = reversed * 10 + (num % 10);
        return reverseNumber(num / 10, reversed);
    }

    // Recursive function to check if the number is a palindrome
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;  // Negative numbers are not considered palindromes
        }
        return num == reverseNumber(num, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from a user
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a Palindrome number.");
        } else {
            System.out.println(userInput + " is not a Palindrome number.");
        }
    }
}
