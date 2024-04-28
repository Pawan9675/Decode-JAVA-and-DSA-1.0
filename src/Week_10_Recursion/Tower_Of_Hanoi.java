package Week_10_Recursion;

import java.util.Scanner;

public class Tower_Of_Hanoi {
    public static void toh(int n, char source, char helper, char destination) {
        if (n == 0) return;

        toh(n - 1, source, destination, helper);
        System.out.println(source + " -> " + destination);
        toh(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disk: ");
        int n = sc.nextInt();

        toh(n, 'A', 'B', 'C');
    }
}
