// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
// find two numbers such that they add up to a specific target number.
// Return the indices of the two numbers added by one. Return -1 if pair does not exist.

package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class DoubletSumOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int left = 0, right = n-1;
        boolean flag = false;
        while (left<right){
            if (arr[left]+arr[right] == target){
                System.out.println("Indices are : "+(++left)+" , "+(++right));
                flag = true;
                break;
            }
            else if (arr[left]+arr[right] > target) right--;
            else left++;
        }
        if (!flag) System.out.println(-1);
    }
}
