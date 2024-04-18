package Week_10_Recursion;

import java.util.Scanner;

public class Sum_1_To_N_Parameterised {
    public static void sum(int num, int add) {
        if (num == 0) {
            System.out.print("Sum: " + add);
            return;
        }
        sum(num - 1, add + num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        sum(number, 0);
    }
}
