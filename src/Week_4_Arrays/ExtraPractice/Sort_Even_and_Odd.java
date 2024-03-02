package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class Sort_Even_and_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) left++;
            if (arr[right] % 2 != 0) right--;
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
