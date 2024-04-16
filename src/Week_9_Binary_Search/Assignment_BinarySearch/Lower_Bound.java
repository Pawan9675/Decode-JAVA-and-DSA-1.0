/*
You are given a sorted array containing N integers and a number target. Implement the upper bound
function that returns the index of an element just greater than the target element. If there exists no such
element then return -1.
Note:  The target may not be present in the array
*/
// Given a sorted integer array and an integer 'x', find the lower bound of x.
// Lower Bound -> Smallest Index such that arr[index] >= x.
/*
Linear Approach:

for (int i = 0; i < arr.length; i++){
    if (arr[i] >= target){
        System.out.println(arr[i]);
        break;
    }
}
*/
package Week_9_Binary_Search.Assignment_BinarySearch;

import java.util.Scanner;

public class Lower_Bound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the size of the array from the user
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Get the elements of the array from the user (assuming the array is sorted)
        System.out.print("Enter the elements of Array (sorted): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the target element from the user
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int start = 0, end = n - 1; // Initialize start and end pointers for binary search
        int lower = n;

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index
            if (arr[mid] >= target) {
                lower = mid; // Update lower bound if current element is greater than or equal to target
                end = mid - 1; // Move end pointer to the left of mid
            } else {
                start = mid + 1; // Move start pointer to the right of mid
            }
        }

        // Print the result
        System.out.println("Lower bound of " + target + " is at index: " + lower);
    }
}
