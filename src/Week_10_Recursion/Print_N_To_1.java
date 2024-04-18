package Week_10_Recursion;

import java.util.Scanner;

public class Print_N_To_1 {
    public static void print(int num) {
        if (num == 0) return;
        System.out.println(num);
        print(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("Numbers in Decreasing order from " + number + " to 1: ");
        print(number);
    }
}
