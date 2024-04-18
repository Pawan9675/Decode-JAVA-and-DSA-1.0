package Week_10_Recursion;

import java.util.Scanner;

public class Print_1_To_N_Global_Variable {
    static int number;
    public static void print(int x) {
        if (x > number) return;
        System.out.println(x);
        print(x + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();

        System.out.println("Numbers in Increasing order from 1 to " + number + ": ");
        print(1);
    }
}
