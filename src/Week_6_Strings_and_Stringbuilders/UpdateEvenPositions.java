package Week_6_Strings_and_Stringbuilders;

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
        Approach 1:
        String s = "MAVEN";
        char[] ch = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }
        for (int i = 0; i < ch.length; i += 2) {
            ch[i] = 'a';
        }
        String str =  new String(ch);
        System.out.println(str);


        Approach 2:
        String s = "MAVEN";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (i%2 == 0) str += 'a';
            else str += s.chatAt(i);
        }
        s = str;
        System.out.println(s);
        */

        // Note: Performance of string: Poor performance because of immutability.
    }

}
