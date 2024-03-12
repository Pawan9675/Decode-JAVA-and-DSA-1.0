// Return the total number of digits in a number without using any loop.
// Hint: Try using inbuilt Integer.toString() function.
package Week_6_Strings;

import java.util.Scanner;

public class Total_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String str1 = Integer.toString(num);
        System.out.println("Total number of digits in "+num+" is: "+str1.length());
    }
}
