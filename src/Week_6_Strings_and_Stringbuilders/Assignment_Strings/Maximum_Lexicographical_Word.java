// Given a sentence ‘str’, return the word that is lexicographically maximum.

package Week_6_Strings_and_Stringbuilders.Assignment_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Lexicographical_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        String maxWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (words[i].compareTo(maxWord) > 0) maxWord = words[i];
        }

        System.out.println("Maximum word in a given sentence is: "+maxWord);


        /*String[] strArray = str.split("\\s+");
        Arrays.stream(strArray).sorted();
        System.out.println(strArray[strArray.length-1]);*/
    }
}
