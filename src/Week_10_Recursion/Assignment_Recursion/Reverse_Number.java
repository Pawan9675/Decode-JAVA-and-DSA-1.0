package Week_10_Recursion.Assignment_Recursion;

import java.util.Scanner;

public class Reverse_Number {
    public static int reverseNumber(int num, int ans) {
        if (num == 0) return ans;
        int digit = num % 10;
        ans = ans * 10 + digit;
        return reverseNumber(num / 10, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Reverse of " + num + " is: " + reverseNumber(num, 0));
    }
}
