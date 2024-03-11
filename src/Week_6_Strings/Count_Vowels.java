package Week_6_Strings;

import java.util.Scanner;

public class Count_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int countVowels = 0;
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is a vowel (both lowercase and uppercase)
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                countVowels++; // Increment the vowel count if the character is a vowel
            }
        }

        // Output the result
        System.out.println("Number of vowels in string \"" + str + "\" is: " + countVowels);

    }
}
