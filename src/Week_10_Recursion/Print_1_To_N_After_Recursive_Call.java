package Week_10_Recursion;

import java.util.Scanner;

public class Print_1_To_N_After_Recursive_Call {
    public static void print(int num) {
        if (num == 0) return;
        print(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("Numbers in Increasing order from 1 to " + number + ": ");
        print(number);
    }
}
