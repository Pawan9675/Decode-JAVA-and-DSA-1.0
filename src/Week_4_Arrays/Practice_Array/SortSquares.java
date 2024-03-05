// Given an integer array 'a' sorted in non-descending order,
// return an array of the sequences of each number sorted in non-decreasing order.

package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class SortSquares {
    //    public static void reverse(int [] arr){
//        int i = 0, j = arr.length-1;
//        while (i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
//        int k = 0;
        int k = n - 1;
        int left = 0, right = n - 1;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }

//        reverse(ans);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
