// Input a string and toggle all the characters of it.
// (Replace small case with capital case & vice versa)

// Note:
// Uppercase Letters (A to Z): From 65 to 90
// Lowercase Letters (a to z): From 97 to 122
package Week_6_Strings_and_Stringbuilders;

import java.util.Scanner;

public class Toggle_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 65 && ascii <= 90) {     // Check if the character is an uppercase letter
                ascii += 32;   // Convert uppercase to lowercase by adding 32 to ASCII value
                ch = (char) ascii;   // Convert ASCII value back to character
                sb.setCharAt(i, ch);   // Replace the character in StringBuilder
            } else if (ascii >= 97 && ascii <= 122) {     // Check if the character is a lowercase letter
                ascii -= 32;   // Convert lowercase to uppercase by subtracting 32 from ASCII value
                ch = (char) ascii;   // Convert ASCII value back to character
                sb.setCharAt(i, ch);   // Replace the character in StringBuilder
            }
        }

        System.out.println("Toggled String: " + sb);   // Print the toggled string
    }
}
