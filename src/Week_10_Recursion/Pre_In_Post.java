package Week_10_Recursion;

import java.util.Scanner;

public class Pre_In_Post {
    public static void pip(int num) {
        if (num == 0) return;
        System.out.print("Pre: " + num + " ");       // Pre
        pip(num - 1);
        System.out.print("In: " + num + " ");        // In
        pip(num - 1);
        System.out.print("Post: " + num + " ");      // Post
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        pip(num);
    }
}
