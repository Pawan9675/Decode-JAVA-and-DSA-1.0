package Week_6_Strings_and_Stringbuilders;


import java.util.Arrays;
import java.util.Scanner;

public class Sorting_String_And_StringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sorting String
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);
        s = new String(ch1); // Convert back to String
        System.out.println(s);

        // Sorting StringBuilder
        System.out.print("Enter the StringBuilder: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        char[] ch2 = sb.toString().toCharArray();
        Arrays.sort(ch2);
        sb = new StringBuilder(String.valueOf(ch2)); // Convert back to StringBuilder
        System.out.println(sb);


    }
}
