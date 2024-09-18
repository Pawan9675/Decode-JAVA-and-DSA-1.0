// Remove all the occurrences of 'a' from string s.

package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Remove_Occurrences_Of_A {
    public static String removeA_1(String str, int index) {         // Time Complexity: O(n^2) ( Note: Time taken in 1 call is n due to string concatenation)
        if (index == str.length()) return "";
        String smallAns = removeA_1(str, index + 1);
        char currChar = str.charAt(index);
        if (currChar != 'a') return currChar + smallAns;
        else return smallAns;
    }

    public static String removeA_2(String str) {
        if (str.isEmpty()) return "";
        String smallAns = removeA_2(str.substring(1));
        char currChar = str.charAt(0);
        if (currChar != 'a') return currChar + smallAns;
        else return smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result1 = removeA_1(str, 0);
        System.out.println("String after removing 'a': " + result1);

        String result2 = removeA_2(str);
        System.out.println("String after removing 'a': " + result2);
    }
}
