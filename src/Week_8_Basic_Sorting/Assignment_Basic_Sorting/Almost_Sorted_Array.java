package Week_8_Basic_Sorting.Assignment_Basic_Sorting;

import java.util.Scanner;

public class Almost_Sorted_Array {
    public static boolean checkAlmostSorted(int[] arr) {
        int n = arr.length;
        // perform bubble sort once
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                // swap elements
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // check whether the resultant array is sorted or not
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }

        // If the resultant array is sorted, return true
        return true;
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

        boolean isAlmostSorted = checkAlmostSorted(arr);
        if (isAlmostSorted) {
            System.out.println("The array is almost sorted.");
        } else {
            System.out.println("The array is not almost sorted.");
        }
    }
}
