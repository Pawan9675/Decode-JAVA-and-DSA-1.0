// Find the square root of the given non-negative value x. Round it off to the nearest floor integer value.
package Week_9_Binary_Search.Extra_Practice;

import java.util.Scanner;

public class Square_Root {
    /*
        Linear approach:
            public static int sqrt(int target) {
                if (target == 0 || target == 1) {
                    return target;
                }
                int y = 0;
                while ((long)y * y <= target) {
                    y++;
                }
                return y - 1;
            }

            Time Complexity: O(√n)
        */

    /*
        Binary search approach to find the square root of a non-negative integer and round it off to the nearest floor integer value.
        Time Complexity: O(log n)

        Parameters:
        - num: The non-negative integer for which the square root is to be found.

        Returns:
        - The square root rounded off to the nearest floor integer value.
    */
    public static int sqrt(int num){
        int start = 0, end = num;
        int ans = -1; // Initialize ans to -1 as the square root of 0 or 1 is 0 or 1 itself
        while (start <= end){
            int mid = start + (end - start)/2;
            int value = mid*mid;
            if (value == num) return mid; // If the square of mid is equal to num, mid is the square root
            else if (value < num) {
                ans = mid; // Update ans to current mid, as it is the closest to the square root
                start = mid+1; // Move to the right half of the search space
            }
            else end = mid-1; // Move to the left half of the search space
        }
        return ans; // Return the closest floor integer value of the square root
    }
    /*
    public static int sqrt(int num){
        if (num == 0 || num == 1) {
            return num; // Return num if it is 0 or 1
        }

        int start = 1, end = num;
        int ans = 0;
        while (start <= end){
            int mid = start + (end - start)/2;
            // Check if mid^2 is less than or equal to num without causing overflow
            if (mid <= num / mid) {
                start = mid + 1; // Move to the right half of the search space
                ans = mid; // Update ans to current mid, as it is the closest to the square root
            } else {
                end = mid - 1; // Move to the left half of the search space
            }
        }
        return ans; // Return the closest floor integer value of the square root
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int result = sqrt(num);
        System.out.println("Nearest square root of "+num+" is: "+result);
    }
}
