package Week_6_Strings_and_Stringbuilders;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateEvenPositions {
    // Function to update even positions in the string to 'a'
    private static String updateEvenPositions(String input) {
        char[] charArray = input.toCharArray();
        // Iterate through the characters and update even positions
        for (int i = 0; i < charArray.length; i += 2) {
            charArray[i] = 'a';
        }
        // Convert the char array back to a string
        return new String(charArray);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        // Update even positions to 'a'
        String updatedString = updateEvenPositions(inputString);
        // Display the updated string
        System.out.println("Updated String: " + updatedString);

        /*
        We can use this approach too:
        char[] ch = new char[inputString.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = inputString.charAt(i);
        }
        String str =  new String(ch);

        System.out.println(str);*/
    }

}
