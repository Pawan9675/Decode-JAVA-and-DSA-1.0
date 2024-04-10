// Given a sorted array of non-negative distinct integers, find the smallest missing non-negative element in it.
package Week_9_Binary_Search;

import java.util.Scanner;

public class Smallest_Missing_Number {
    /*
    Linear Approach:

    for (int i = 0; i < arr.length; i++){
        if (i != arr[i]){
            System.out.println(i);
            break;
        }
    */
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

        int start = 0, end = n-1;
        int ans = -1; // Initialize variable to store the smallest missing element
        while (start <= end){
            int mid = start  + (end - start)/2;
            if (mid == arr[mid]) // If mid-element is equal to its index, move to the right half
                start = mid + 1;
            else {
                // If mid-element is not equal to its index, update answer and move to the left half
                ans = mid;
                end = mid - 1;
            }
        }

        // Check if any missing element is found and print the result accordingly
        if (ans == -1)
            System.out.println("No smallest missing element exists");
        else
            System.out.println("Smallest missing element number is "+ans);
    }
}
