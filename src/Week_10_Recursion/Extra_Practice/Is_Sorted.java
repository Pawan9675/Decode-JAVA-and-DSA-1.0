package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Is_Sorted {
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length) return true;
        if (arr[index] < arr[index - 1]) return false;
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr, 1)) {
            System.out.println("The given array is sorted.");
        } else {
            System.out.println("The given array is not sorted.");
        }
    }
}
