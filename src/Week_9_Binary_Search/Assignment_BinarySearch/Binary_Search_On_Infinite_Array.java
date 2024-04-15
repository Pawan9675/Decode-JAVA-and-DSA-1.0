// You have a sorted array of infinite numbers, how would you search an element in the array?

package Week_9_Binary_Search.Assignment_BinarySearch;

import java.util.Scanner;

public class Binary_Search_On_Infinite_Array {
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

        int low = 0, high = 1;

        // Double the high pointer until it exceeds the target value
        while (arr[high] < target){
            low = high;
            high *= 2;
        }

        // Perform binary search in the range [low, high]
        boolean flag = false;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (target == arr[mid]){
                System.out.println(target+ " found at index "+mid);
                flag = true;
                break;
            }
            else if (target < arr[mid]) high = mid - 1;
            else low = mid + 1;
        }

        // Print if the target is not found
        if (!flag) System.out.println(target+" doesn't exist");
    }
}
