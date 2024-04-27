package Week_10_Recursion;

import java.util.Scanner;

public class Generate_Parenthesis {
    public static void printParenthesis(int open, int close, int n, String ans) {
        if (ans.length() == 2 * n) {
            System.out.println("Valid Parentheses: " + ans);
            return;
        }
        if (open < n) printParenthesis(open + 1, close, n, ans + "(");
        if (close < open) printParenthesis(open, close + 1, n, ans + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pairs of parentheses: ");
        int n = sc.nextInt();

        System.out.println("All valid combinations of parentheses:");
        printParenthesis(0, 0, n, "");
    }
}
