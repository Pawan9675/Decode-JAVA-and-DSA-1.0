// Given an array of integers, change the value of all odd indexed elements to its second multiple
// and increment all even indexed values by 10.

package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class Modify_Even_and_Odd_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 10;
            } else {
                arr[i] = arr[i] * 2;
            }
        }

        System.out.println("Modified Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
