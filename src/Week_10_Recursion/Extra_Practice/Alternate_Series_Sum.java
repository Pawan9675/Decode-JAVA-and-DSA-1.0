// Given a number n, find the sum of natural numbers till n but with alternate signs.
package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Alternate_Series_Sum {
    public static int alternateSum(int n){
        if (n == 0) return 0;
        if (n % 2 == 0) return alternateSum(n-1) - n;
        else return alternateSum(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Sum of the alternate series from 1 to " + num + " is: " + alternateSum(num));

    }
}
