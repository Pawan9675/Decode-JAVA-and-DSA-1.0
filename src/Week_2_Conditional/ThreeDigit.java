package Week_2_Conditional;

import java.util.Scanner;

public class ThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num>99 && num<1000) System.out.println(num+ " is a Three-Digit number");
        else System.out.println(num+ " is not a Three-Digit number");

        if (num>9999 && num<100000) System.out.println(num+ " is a Five-Digit number");
        else System.out.println(num+ " is not a Five-Digit number");
    }
}
