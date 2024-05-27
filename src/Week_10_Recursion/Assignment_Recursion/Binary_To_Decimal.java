package Week_10_Recursion.Assignment_Recursion;

import java.util.Scanner;

public class Binary_To_Decimal {
    public static int binToDec(int binary_num, int decimal, int power) {
        if (binary_num == 0) return decimal;
        int carry = binary_num % 10;
        decimal += carry * power;
        return binToDec(binary_num / 10, decimal, power * 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int binary_num = sc.nextInt();

        int decimal = binToDec(binary_num, 0, 1);
        System.out.println("Decimal representation: " + decimal);
    }
}
