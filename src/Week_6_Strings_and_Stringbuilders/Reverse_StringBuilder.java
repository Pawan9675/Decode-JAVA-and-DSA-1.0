// Take input a StringBuilder and reverse it without using built-in function.
package Week_6_Strings_and_Stringbuilders;

import java.util.Scanner;

public class Reverse_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the StringBuilder sb1: ");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());

        // Initialize i to the first character index and j to the last character index
        int i = 0, j = sb1.length() - 1;

        // Continue swapping characters until the two indices meet in the middle
        while (i < j) {
            // Swap characters at index i and j
            char temp = sb1.charAt(i);
            sb1.setCharAt(i, sb1.charAt(j));
            sb1.setCharAt(j, temp);

            // Move i to the next character and j to the previous character
            i++;
            j--;
        }

        // Print the reversed StringBuilder
        System.out.println("Reverse StringBuilder without using built-in function: " + sb1);

        // Take input StringBuilder sb2 from the user
        System.out.print("Enter the StringBuilder sb2: ");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());

        // Print the reversed StringBuilder using the built-in reverse function
        System.out.println("Reverse StringBuilder with using built-in function: " + sb2.reverse());


    }
}

