// Generate all binary strings of length n without consecutive 1's.

package Week_10_Recursion;

import java.util.Scanner;

public class Generate_Binary_String_Without_Consecutive_1s {
    public static void printBinaryString(String s, int n){
        int len = s.length();
        if (len == n){
            System.out.println(s);
            return;
        }
        if (len == 0 || s.charAt(len-1) == '0'){
            printBinaryString(s+1, n);
            printBinaryString(s+0, n);
        }
        else printBinaryString(s+0, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of binary string: ");
        int n = sc.nextInt();

        printBinaryString("", n);
    }
}
