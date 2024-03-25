// Sort a String in decreasing order of values associated after removal of values smaller than X.
package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Sort_String_Decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'X') {
                s.append(ch);
            }
        }

        System.out.println("String after removal of values smaller than X: " + s);

        for (int i = 0; i < s.length() - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < s.length() - 1 - i; j++) {
                if (s.charAt(j) < s.charAt(j + 1)) {
                    char temp = s.charAt(j);
                    s.setCharAt(j, s.charAt(j + 1));
                    s.setCharAt(j + 1, temp);
                    flag = false;
                }
            }
            if (flag) break;
        }

        System.out.println("Sorted string after removal of values smaller than X: " + s);
    }
}
