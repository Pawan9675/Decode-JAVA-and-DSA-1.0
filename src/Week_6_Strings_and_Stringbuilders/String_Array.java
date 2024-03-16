package Week_6_Strings_and_Stringbuilders;

import java.util.Arrays;
import java.util.Scanner;

public class String_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words/character to be entered: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        String[] str = new String[n];
        System.out.println("Enter " + n + " words/character in string array: ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        System.out.println("String Array: " + Arrays.toString(str));
    }
}
