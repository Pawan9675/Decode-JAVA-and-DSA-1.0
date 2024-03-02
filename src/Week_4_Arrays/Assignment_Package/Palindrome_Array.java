// If an array arr contains n elements, then check if the given array is a palindrome or not .
package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class Palindrome_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (arr[left] != arr[right]) {
                flag = false;
                break;
            } else {
                left++;
                right--;
            }
        }

        if (!flag) System.out.println("Array is not palindrome");
        else System.out.println("Array is palindrome");
    }
}
