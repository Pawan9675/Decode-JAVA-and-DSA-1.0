// Given a positive integer, return true if it is a power of 2.
package Week_10_Recursion.Assignment_Recursion;
import java.util.Scanner;

public class Power_Of_2 {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n % 2 != 0 || n == 0) return false;
        return isPowerOfTwo(n / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPowerOfTwo(num)) System.out.println(num + " is a power of 2.");
        else System.out.println(num + " is not a power of 2.");
    }
}
