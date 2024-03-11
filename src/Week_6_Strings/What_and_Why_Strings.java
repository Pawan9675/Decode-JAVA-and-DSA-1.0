package Week_6_Strings;

import java.util.Scanner;

public class What_and_Why_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Character array is often used to represent strings
        char[] arr = {'P', 'a', 'w', 'a', 'n'};

        // Printing the character array using a for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        // Printing the character array using a for-each loop
        for (char ele : arr) {
            System.out.print(ele);
        }

        // String literal
        String str = "\nPawan Kumar Singh";
        System.out.println(str);

        // Taking input of the string

        // Using next() to read a single word
        System.out.print("Enter a word: ");
        String str1 = sc.next(); // Reads input until the first whitespace
        System.out.println("Word entered: " + str1);

        // Using nextLine() to read a full line
        sc.nextLine(); // Consume the newline character left by next()
        System.out.print("Enter a sentence: ");
        String str2 = sc.nextLine(); // Reads input until the end of the line
        System.out.println("Sentence entered: " + str2);

    }
}
