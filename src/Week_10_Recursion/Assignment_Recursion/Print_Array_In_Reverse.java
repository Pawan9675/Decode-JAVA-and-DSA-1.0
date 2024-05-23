// Print all the elements of an array in reverse order.
package Week_10_Recursion.Assignment_Recursion;

import java.util.Scanner;

public class Print_Array_In_Reverse {
    public static void printArray(int[] arr, int i) {
        if (i < 0) return;
        System.out.print(arr[i] + " ");
        printArray(arr, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array in reverse order is: ");
        printArray(arr, n - 1);
    }
}
