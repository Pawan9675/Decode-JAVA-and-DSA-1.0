// You are given a string. Your task is to divide the string into palindromic substrings. Print all such partitions.

package Week_10_Recursion.Practice_Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome_Partitioning {

    // Function to check if a given substring is a palindrome
    public static boolean isPalindrome(String substring){
        int left = 0;
        int right = substring.length() - 1;

        // Compare characters from both ends towards the middle
        while (left <= right) {
            if (substring.charAt(left) != substring.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Recursive function to generate all possible palindromic partitions of the string
    public static void findPalindromicPartitions(String input, ArrayList<String> currentPartition, int startIdx) {
        // Base case: if we reach the end of the string, print the current partition list
        if (startIdx == input.length()) {
            System.out.println(currentPartition);
            return;
        }

        String tempSubstring = "";

        // Loop to partition the string into substrings
        for (int i = startIdx; i < input.length(); i++) {
            tempSubstring += input.charAt(i); // Form a temporary substring

            // Check if the temporary substring is a palindrome
            if (isPalindrome(tempSubstring)) {
                currentPartition.add(tempSubstring); // Add it to the current partition

                // Recursively partition the remaining substring
                findPalindromicPartitions(input, currentPartition, i + 1);

                // Backtrack by removing the last added substring
                currentPartition.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Initialize an ArrayList to hold current partitions
        ArrayList<String> partitionList = new ArrayList<>();

        // Call the function to generate all palindromic partitions
        findPalindromicPartitions(inputString, partitionList, 0);
    }
}
