package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Find_Last_Index {
    public static int lastIndex(int[] arr, int target, int index) {
        if (index < 0) return -1;
        if (arr[index] == target) return index;
        return lastIndex(arr, target, index - 1);
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
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        int result = lastIndex(arr, target, n - 1);
        if (result == -1) {
            System.out.println("The target element " + target + " is not found in the array.");
        } else {
            System.out.println("The last occurrence of the target element " + target + " is at index: " + result);
        }
    }
}
