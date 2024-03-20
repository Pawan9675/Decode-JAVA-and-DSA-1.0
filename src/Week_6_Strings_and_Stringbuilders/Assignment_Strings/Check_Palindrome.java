// Check whether the given string is palindrome or not.

package Week_6_Strings_and_Stringbuilders.Assignment_Strings;

import java.util.Scanner;
public class Check_Palindrome {
    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String str){
        // Initialize two pointers, one at the beginning and one at the end of the string
        int i = 0, j = str.length()-1;

        // Loop until the two pointers meet in the middle
        while (i < j){
            // Compare characters at the two pointers
            if (str.charAt(i) == str.charAt(j)){
                // If characters match, move both pointers towards the center
                i++;
                j--;
            }
            else {
                // If characters don't match, the string is not a palindrome
                return false;
            }
        }
        // If the loop completes without returning false, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitive check
        str = str.trim(); // Remove leading and trailing whitespaces

        // Check if the input string is a palindrome and print the result
        System.out.println(checkPalindrome(str) ? str + " is palindrome" : str + " is not palindrome");
    }
}
