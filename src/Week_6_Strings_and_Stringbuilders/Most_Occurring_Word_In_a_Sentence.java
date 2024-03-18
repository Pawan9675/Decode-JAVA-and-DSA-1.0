// Given a sentence 'str', return the word that occurs the most number of times in that sentence.
package Week_6_Strings_and_Stringbuilders;

import java.util.Scanner;

public class Most_Occurring_Word_In_a_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();

        // Split the input sentence into an array of words
        String[] strArray = str.split("\\s+");

        int max = 0;
        // Iterate through each word in the array
        for (int i = 0; i < strArray.length; i++) {
            int count = 1;
            // Compare the current word with all other words in the array
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j])) {
                    count++; // Increment count if the words match
                }
            }

            // Update max if the current word occurs more times than the previous max
            max = Math.max(max, count);
        }

        // Iterate through the array again to find and print the word(s) that occur max times
        for (int i = 0; i < strArray.length; i++) {
            int count = 1;
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j])) {
                    count++; // Increment count if the words match
                }
            }

            // If the current word occurs max times, print it along with the count
            if (count == max) {
                System.out.println(strArray[i] + " occur " + max + " times.");
            }
        }
    }
}
