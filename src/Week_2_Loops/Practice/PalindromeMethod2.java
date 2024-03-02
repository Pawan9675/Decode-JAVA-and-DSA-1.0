package Week_2_Loops.Practice;

import java.util.Scanner;

public class PalindromeMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String/Number: ");
        String original = sc.nextLine();


        String reverse = "";
        for (int i = original.length()-1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

    }
}
