// Given an array of n integers and a target value x. Print whether x exists in the array or not.
package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Search_Element_In_Array {
    public static int searchElement(int[] arr, int index, int target) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return searchElement(arr, index + 1, target);
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

        int result = searchElement(arr, 0, target);
        if (result == -1) {
            System.out.println("The element " + target + " is not found in the array.");
        } else {
            System.out.println("The element " + target + " is found at index " + result + ".");
        }
    }
}

