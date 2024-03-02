package Week_2_Conditional;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num<0) System.out.println("Absolute value of "+num+" is: "+(-num));
        else System.out.println("Absolute value of "+num+" is: "+ num);
    }
}
