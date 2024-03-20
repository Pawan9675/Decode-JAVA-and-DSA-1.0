// Input a string of size n and Update all the odd positions in the string to character ‘#’.
// Consider 0-based indexing.

package Week_6_Strings_and_Stringbuilders.Assignment_Strings;

import java.util.Scanner;

public class Update_Odd_Position_To_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Convert the string to a character array
        char[] ch = str.toCharArray();

        // Update all odd positions with '#'
        for (int i = 1; i < str.length(); i += 2) {
            ch[i] = '#';
        }

        // Convert the modified character array back to a string
        String newStr = new String(ch);

        // Print the modified string
        System.out.println("Modified String: " + newStr);
    }
}

