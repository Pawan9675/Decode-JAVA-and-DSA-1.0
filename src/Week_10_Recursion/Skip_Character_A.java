package Week_10_Recursion;

import java.util.Scanner;

public class Skip_Character_A {
    public static void skip(String str, int i, String ans) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        if (str.charAt(i) != 'a' && str.charAt(i) != 'A') {
            ans += str.charAt(i);
        }
        skip(str, i + 1, ans);
        /*
        if (str.charAt(i) != 'a' && str.charAt(i) != 'A') skip(str, i + 1, ans+str.charAt(i));
        skip(str, i + 1, ans);
        */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        skip(str, 0, "");
    }
}
