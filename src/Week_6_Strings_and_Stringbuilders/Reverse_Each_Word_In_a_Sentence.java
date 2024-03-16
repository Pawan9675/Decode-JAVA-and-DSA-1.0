package Week_6_Strings_and_Stringbuilders;

import java.util.Scanner;

public class Reverse_Each_Word_In_a_Sentence {
    // Method to reverse a substring in StringBuilder from index i to index j
    public static void reverse(StringBuilder sb, int i, int j) {
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int i = 0, j = 0;
        int n = sb.length();
        while (j < n) {
            // Find the end of each word by detecting space ' '
            if (sb.charAt(j) != ' ') {
                j++;
            } else {
                // Reverse the word from index i to index j-1
                reverse(sb, i, j - 1);
                // Move to the next word
                i = j + 1;
                j = i;
            }
        }
        // Reverse the last word in the sentence (no space after the last word)
        reverse(sb, i, j - 1);

        // Print the sentence with each word reversed
        System.out.println("String with each word reverse: " + sb);
    }
}

/*
Algorithm:
1. Create a reverse method that takes a StringBuilder, starting index i, and ending index j, and reverses the substring between i and j inclusive.
2. In the main method, create a Scanner object to take user input for a string.
3. Initialize two variables i and j to 0 to keep track of the start and end of each word.
4. Iterate over the characters of the string using j as the iterator.
5. When a space character is encountered, it indicates the end of a word. Reverse the word from index i to j-1.
6. Update i to j+1 to move to the next word, and reset j to i to start the next word.
7. After the loop, the last word in the sentence remains unprocessed, so reverse it from i to j-1.
8. Print the modified string with each word reversed.
*/
