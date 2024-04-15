// Given a sorted integer array and an integer 'x', find the upper bound of x.
// Upper Bound -> Smallest Index such that arr[index] > x.
/*
Linear Approach:

for (int i = 0; i < arr.length; i++){
    if (arr[i] > target){
        System.out.println(arr[i]);
        break;
    }
}
*/
package Week_9_Binary_Search;

import java.util.Scanner;

public class Upper_Bound {
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

        int start = 0, end = n-1; // Initialize start and end pointers for binary search
        int upper = n;

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index
            if (arr[mid] > target) {
                upper = mid; // Update upper bound if current element is greater to target
                end = mid - 1; // Move end pointer to the left of mid
            } else {
                start = mid + 1; // Move start pointer to the right of mid
            }
        }

        // Print the result
        System.out.println("Lower bound of " + target + " is at index: " + upper);
    }
}
