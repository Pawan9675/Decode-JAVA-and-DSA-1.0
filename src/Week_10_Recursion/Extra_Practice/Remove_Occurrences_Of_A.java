package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Remove_Occurrences_Of_A {
    public static String removeA(String str, int index) {
        if (index == str.length()) return "";
        String smallAns = removeA(str, index + 1);
        char currChar = str.charAt(index);
        if (currChar != 'a') return currChar + smallAns;
        else return smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeA(str, 0);
        System.out.println("String after removing 'a': " + result);
    }
}
