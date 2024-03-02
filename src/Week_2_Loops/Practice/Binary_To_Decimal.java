package Week_2_Loops.Practice;

import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binary_num = sc.nextInt();
        int decimal = 0;
        int power = 1;
        while (binary_num>0) {
            int unit_digit = binary_num%10;
            decimal +=unit_digit*power;
            binary_num = binary_num/10;
            power*=2;
        }
        System.out.println(decimal);

    }
}
