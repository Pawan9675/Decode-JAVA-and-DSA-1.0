// Input a string of even length and reverse the first half of the string.
package Week_6_Strings;

import java.util.Scanner;

public class First_Half_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String ans = "";
        if (str.length() % 2 == 0) {
            for (int i = (str.length() / 2) - 1; i >= 0; i--) {
                ans += str.charAt(i);
            }
            ans += str.substring(str.length() / 2);
            System.out.println(ans);
        } else {
            System.out.println("Length of string should be of even length. ");
        }

    }
}
