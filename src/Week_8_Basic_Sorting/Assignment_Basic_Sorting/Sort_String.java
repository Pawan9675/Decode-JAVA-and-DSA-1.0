package Week_8_Basic_Sorting.Assignment_Basic_Sorting;

import java.util.Scanner;

public class Sort_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);

        StringBuilder s = new StringBuilder(str);

        for (int i = 0; i < s.length() - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < s.length() - 1 - i; j++) {
                if (s.charAt(j) > s.charAt(j + 1)) {
                    char temp = s.charAt(j);
                    s.setCharAt(j, s.charAt(j + 1));
                    s.setCharAt(j + 1, temp);
                    flag = false;
                }
            }
            if (flag) break;
        }

        System.out.println("Sorted string: " + s);
    }
}
