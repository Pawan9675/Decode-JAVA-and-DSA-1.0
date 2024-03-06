package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class SuffixSumWithoutUsingExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = n-2; i >= 0; i--) {
            arr[i] = arr[i+1] + arr[i];
        }

        System.out.println("Suffix array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
