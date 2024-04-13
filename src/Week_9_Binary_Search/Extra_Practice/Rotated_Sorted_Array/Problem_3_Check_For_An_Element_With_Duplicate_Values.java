// Search element in rotated sorted array with duplicate elements.
// Return true if the element is found, else return false.

/*
Take an example:
    int[] arr = 1   1   1   1   1   1   2   3   1   1
                |               |                   |
              start            mid                 end

    Here, arr[start] == arr[mid] == arr[end]
    If 1 is not our target, all these 1's are of no use to us.
    and due to duplicacy of 1's, we are not able to determine sorted segments.
    So, we get rid of these 1's.

    Note: if mid == end and start != end then the pivot will never lie between mid and end and hence we can say mid to end is sorted.
*/

package Week_9_Binary_Search.Extra_Practice.Rotated_Sorted_Array;

import java.util.Scanner;

public class Problem_3_Check_For_An_Element_With_Duplicate_Values {
    // Function to search for a target element in a rotated sorted array
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid; // If target found at mid, return mid

                // Handling duplicate values
            else if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                start++;
                end--;
            } else if (arr[mid] <= arr[end]) { // If mid to end is sorted
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
