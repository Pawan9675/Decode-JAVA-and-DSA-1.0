//Write a program to enter the numbers till the user wants, the number can be positive
//negative or zero. Calculate the sum of numbers until a negative number is encountered.
//If the input is a negative number, current sum is discarded and print -1.

package Week_2_Loops.Practice;

import java.util.Scanner;

public class Input_Till_Number_Is_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int sum = 0;
        while (flag){
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (n>=0){
                sum += n;
                System.out.println("Sum is: "+sum);
            }
            else {
                sum = -1;
                System.out.println("Sum is discarded to: "+sum);
                flag = false;
            }
        }
    }
}
