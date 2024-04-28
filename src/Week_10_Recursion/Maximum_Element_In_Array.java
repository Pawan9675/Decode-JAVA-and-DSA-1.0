package Week_10_Recursion;

import java.util.Scanner;

public class Maximum_Element_In_Array {
    public static void printMax(int[] arr, int n, int index, int max) {
        if (index == n) {
            System.out.println("Maximum value in the given array: " + max);
            return;
        }
        if (max < arr[index]) max = arr[index];
        printMax(arr, n, index + 1, max);
    }

    public static int findMax(int[] arr, int n, int index) {
        if (index == n) return Integer.MIN_VALUE;
        return Math.max(arr[index], findMax(arr, n, index + 1));
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

        printMax(arr, n, 0, Integer.MIN_VALUE);
        System.out.println("Maximum value in the given array: " + findMax(arr, n, 0));
    }
}
