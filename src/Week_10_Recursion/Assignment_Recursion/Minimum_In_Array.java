package Week_10_Recursion.Assignment_Recursion;

import java.util.Scanner;

public class Minimum_In_Array {
    public static int minValue(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        return Math.min(arr[index], minValue(arr, index + 1));
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

        System.out.println("Minimum value in the given array is: " + minValue(arr, 0));
    }
}
