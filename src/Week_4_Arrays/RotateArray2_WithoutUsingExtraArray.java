package Week_4_Arrays;

import java.util.Scanner;

public class RotateArray2_WithoutUsingExtraArray {
    public static void reverse(int[] arr, int i, int j){
        while (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        k = k % n;

        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, 0, n-1);

        System.out.print("Rotated Array: ");
        for (int i = 0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
