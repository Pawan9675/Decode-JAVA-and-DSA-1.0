// Given a sentence, split every single word of the sentence and print in a new line.

package Week_6_Strings_and_Stringbuilders;

import java.util.Scanner;

public class Split_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Split the input string into an array of words based on whitespace characters
        String[] strArray = str.split("\\s+");

        // Print each word in a new line
        for (String element : strArray){
            System.out.println(element);
        }
    }
}
