// Given an array of strings. Check whether they are anagram or not.

package Week_6_Strings_and_Stringbuilders.Assignment_Strings;


import java.util.Arrays;
import java.util.Scanner;

public class Check_Anagram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first String: ");
        // Read the first string from the user and convert it to lowercase
        String str1 = sc.nextLine().toLowerCase();

        // Prompt the user to enter the second string
        System.out.print("Enter the second String: ");
        // Read the second string from the user and convert it to lowercase
        String str2 = sc.nextLine().toLowerCase();

        // Convert the first string to a character array
        char[] ch1 = str1.toCharArray();
        // Convert the second string to a character array
        char[] ch2 = str2.toCharArray();

        // Sort the character arrays in ascending order
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare the sorted character arrays to check if they are equal
        if (Arrays.equals(ch1, ch2)) {
            // If the arrays are equal, the strings are anagrams
            System.out.println(str1 + " and " + str2 + " are valid anagrams.");
        } else {
            // If the arrays are not equal, the strings are not anagrams
            System.out.println(str1 + " and " + str2 + " are not valid anagrams.");
        }

        /*
        str1 = new String(ch1);
        str2 = new String(ch2);

        if (str1.equals(str2)) System.out.println(str1 + " and " + str2 + " are valid anagram.");
        else System.out.println(str1 + " and " + str2 + " are not valid anagram.");
        */
    }
}

