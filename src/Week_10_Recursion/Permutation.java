package Week_10_Recursion;

import java.util.Scanner;

public class Permutation {
    public static void printPermutations(String str, String ans){
        if (str.isEmpty()){     // str.length() == 0
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            printPermutations(left+right, ans+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        printPermutations(str, "");
    }
}
