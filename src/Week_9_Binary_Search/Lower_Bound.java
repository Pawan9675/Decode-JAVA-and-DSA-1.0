// Given a sorted integer array and an integer 'x', find the lower bound of x.
/*
Linear Approach:

for (int i = 0; i < arr.length; i++){
    if (arr[i] > target){
        System.out.println(arr[i-1]);
        break;
    }
}
*/
package Week_9_Binary_Search;

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

        int start = 0, end = n-1; // Initialize start and end pointers for binary search
        boolean flag = false; // Initialize a flag to track if the target is found

        // Binary search loop
        while (start <= end){
            int mid = start + (end - start)/2; // Calculate the middle index
            if (target == arr[mid]){ // If target is found at the middle index
                flag = true; // Set flag to true
                System.out.println("Lower bound of "+target+" is: "+arr[mid-1]); // Print the lower bound
                break; // Exit the loop
            }
            else if (target < arr[mid]) end = mid - 1; // If target is less than the middle element, adjust the end pointer
            else start = mid + 1; // If target is greater than the middle element, adjust the start pointer
        }

        // If target is not found, print the lower bound based on the end pointer
        if (!flag) System.out.println("Lower bound of "+target+" is: "+arr[end]);
    }
}
