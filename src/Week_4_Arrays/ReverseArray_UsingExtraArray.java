package Week_4_Arrays;

import java.util.Scanner;

public class ReverseArray_UsingExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }

        int [] ans = new int[n];
        int k = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            ans[k++]  = arr[i];
        }

        System.out.print("Reversed Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
