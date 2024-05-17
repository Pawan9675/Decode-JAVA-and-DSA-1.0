package Week_10_Recursion;

import java.util.Scanner;

public class Palindrome_String {
    public static boolean isPalindromeUsingLoop(String str){
        int start = 0;
        int end = str.length()-1;
        while (start <= end){
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeUsingRecursion(String str, int start, int end) {
        if (start > end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        else return isPalindromeUsingRecursion(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println(str + "is palindrome: " + isPalindromeUsingRecursion(str, 0, str.length() - 1));
        System.out.println(str + "is palindrome: " + isPalindromeUsingLoop(str));
    }
}
