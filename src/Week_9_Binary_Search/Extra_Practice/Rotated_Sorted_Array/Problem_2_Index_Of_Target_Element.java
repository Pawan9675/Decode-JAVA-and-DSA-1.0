// Given the rotated sorted array of integers, which contains distinct elements,
// and an integer target, return the index of target if it is in the array. Otherwise, return -1.

/*
Properties of Rotated sorted Array:
    1. x    mid    y
         ~ x to mid is sorted and mid to y is sorted.
         ~ OR one of them will be sorted & other one will be unsorted.

    2. x        y
         ~ if (arr[x] < arr[y]) then x to y is sorted provided all elements are unique. i.e. the pivot doesn't lie between x and y (it could be x or y)
*/

package Week_9_Binary_Search.Extra_Practice.Rotated_Sorted_Array;

import java.util.Scanner;

public class Problem_2_Index_Of_Target_Element {

    // Function to search for a target element in a rotated sorted array
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid; // If target found at mid, return mid

            else if (arr[mid] < arr[end]) { // If mid to end is sorted
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1; // If target is in sorted part, search in right half
                } else {
                    end = mid - 1; // If not, search in left half
                }
            } else { // If start to end is sorted
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1; // If target is in sorted part, search in left half
                } else {
                    start = mid + 1; // If not, search in right half
                }
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Prompt user to enter the elements of the array
        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Prompt user to enter the target element to search
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        // Search for the target element and print the result
        if (search(arr, target) == -1) {
            System.out.println(target + " doesn't exist");
        } else {
            System.out.println(target + " found at index " + search(arr, target));
        }
    }
}
