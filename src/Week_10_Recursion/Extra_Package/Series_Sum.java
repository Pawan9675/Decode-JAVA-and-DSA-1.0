// Calculate sum of series 1 to user's input using recursion.
package Week_10_Recursion.Extra_Package;

import java.util.Scanner;

public class Series_Sum {
    public static int seriesSum(int n){
        if (n == 0) return 0;
        return n + seriesSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Sum of the series from 1 to " + num + " is: " + seriesSum(num));
    }
}
