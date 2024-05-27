// Given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array.
package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Find_All_Indices {
    public static void searchElement(int[] arr, int index, int target) {
        if (index == arr.length) return;
        if (arr[index] == target) System.out.println("Element found at index: " + index);
        searchElement(arr, index + 1, target);
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

        System.out.println("Indices of the target element " + target + " in the array:");
        searchElement(arr, 0, target);
    }
}

