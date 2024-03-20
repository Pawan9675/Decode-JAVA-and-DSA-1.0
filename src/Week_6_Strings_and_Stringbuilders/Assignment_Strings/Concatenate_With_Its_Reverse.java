package Week_6_Strings_and_Stringbuilders.Assignment_Strings;

import java.util.Scanner;

public class Concatenate_With_Its_Reverse {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter the String: ");

        // Read the input string from the user
        String str = sc.nextLine();

        // Create a StringBuilder object with the input string
        StringBuilder sb = new StringBuilder(str);

        // Reverse the content of the StringBuilder
        sb.reverse();

        // Print the modified string
        System.out.println("Modified string: " + str + sb);
    }
}

