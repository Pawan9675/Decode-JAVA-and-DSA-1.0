// Reverse a string using recursion.

package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Reverse_String {

    public static String reverseStringRecursively_1(String input, int currentIndex) {
        if (currentIndex == input.length()) {
            return "";
        }

        String reversedPart = reverseStringRecursively_1(input, currentIndex + 1);
        return reversedPart + input.charAt(currentIndex);
    }

    public static String reverseStringRecursively_2(String input){
        if (input.isEmpty()) {
            return "";
        }

        String reversedPart = reverseStringRecursively_2(input.substring(1));
        return reversedPart + input.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String userInput = scanner.nextLine();

        String reversedString_1 = reverseStringRecursively_1(userInput, 0);
        System.out.println("Reversed String (Method 1): " + reversedString_1);

        String reversedString_2 = reverseStringRecursively_2(userInput);
        System.out.println("Reversed String (Method 2): " + reversedString_2);
    }
}
