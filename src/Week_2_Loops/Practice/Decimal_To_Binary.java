package Week_2_Loops.Practice;

import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decimal_num = sc.nextInt();
        int binary = 0;
        int power = 1;
        while (decimal_num!=0) {
            int carry = decimal_num%2;
            binary +=carry*power;
            decimal_num/=2;
            power*=10;
        }
        System.out.println(binary);

    }
}
