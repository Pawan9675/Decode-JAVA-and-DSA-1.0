package Week_10_Recursion;

import java.util.Scanner;

public class Print_Array {
    public static void printArray(int[] arr, int i) {
        if (i == arr.length) return;
        System.out.print(arr[i] + " ");
        printArray(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr, 0);
    }
}
