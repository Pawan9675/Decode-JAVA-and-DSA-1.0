package Week_10_Recursion;

import java.util.Scanner;

public class Print_String {
    public static void printString (String str, int i){
        if (i == str.length()) return;
        System.out.print(str.charAt(i));
        printString(str, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        printString(str, 0);
    }
}
