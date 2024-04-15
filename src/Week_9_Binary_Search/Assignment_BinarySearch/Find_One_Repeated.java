// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive in sorted order.
// There is only one repeated number in nums, return this repeated number

package Week_9_Binary_Search.Assignment_BinarySearch;

import java.util.Scanner;

public class Find_One_Repeated {
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

        while (start<=end){
            int mid = start + (end - start)/2;
            // Check if the mid-element is in the correct position
            if (arr[mid] == mid+1) start = mid + 1; // Move to the right half
            // If the mid-element is not in the correct position, check if it's equal to the previous element
            if (arr[mid] == mid){
                // If it's equal to the previous element, it's the repeating number
                if (arr[mid] == arr[mid-1]){
                    System.out.println("Repeating number is "+arr[mid]);
                    break;
                }
                else end = mid - 1; // Move to the left half
            }
        }
        if(start > end) {
            System.out.println("No repeating element found");
        }
    }
}
