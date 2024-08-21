// Given a decimal number as input, we need to write a program to convert the given
// decimal number into its equivalent binary number.
package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Decimal_To_Binary {
    public static int decToBin(int decimal_num, int binary, int power) {
        if (decimal_num == 0) return binary;
        int carry = decimal_num % 2;
        binary += carry * power;
        return decToBin(decimal_num / 2, binary, power * 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimal_num = sc.nextInt();

        int binary = decToBin(decimal_num, 0, 1);
        System.out.println("Binary representation: " + binary);
    }
}
