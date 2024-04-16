// Given a sorted array of distinct integers that is rotated in natures find the value of the maximum element in the array.

package Week_9_Binary_Search.Assignment_BinarySearch;

import java.util.Scanner;

public class Minimum_Element_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the size of the array from the user
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Get the elements of the array from the user
        System.out.print("Enter the elements of Array (Rotated-sorted array): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Binary search for finding the minimum element in a rotated sorted array
        int start = 0, end = n-1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;

            // Check if mid is greater than the last element
            if (arr[mid] > arr[n-1]){
                ans = mid;
                start = mid + 1; // Search in the right half
            }
            else end = mid - 1; // Search in the left half
        }

        // Print the index and value of the minimum element
        System.out.println("Minimum element is found at index: "+(ans));
        System.out.println("Value of minimum element is: "+arr[ans]);
    }
}
