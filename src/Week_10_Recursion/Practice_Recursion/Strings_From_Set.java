// Given a set of characters and a positive integer k, print all possible strings of length k that can be formed from the given set.
package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Strings_From_Set {

    public static void generateAllCombinations(Character[] characterSet, int remainingLength, String currentString) {
        // Base case: When remainingLength is 0, the string has reached the desired length, print it
        if (remainingLength == 0) {
            System.out.println(currentString);
            return;
        }

        // Loop through the character set and append each character to the current string
        for (int i = 0; i < characterSet.length; i++) {
            generateAllCombinations(characterSet, remainingLength - 1, currentString + characterSet[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the character set from the user
        System.out.print("Enter the size of the character set: ");
        int setSize = scanner.nextInt();

        Character[] characterSet = new Character[setSize];
        System.out.println("Enter the characters in the set:");
        for (int i = 0; i < setSize; i++) {
            characterSet[i] = scanner.next().charAt(0);
        }

        // Input the desired length of the strings (k) from the user
        System.out.print("Enter the length of the strings (k): ");
        int stringLength = scanner.nextInt();

        // Generate and print all possible combinations of strings of length k
        System.out.println("All possible strings of length " + stringLength + ":");
        generateAllCombinations(characterSet, stringLength, "");
    }
}
