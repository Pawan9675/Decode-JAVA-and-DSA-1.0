package Week_4_Arrays;

import java.util.Scanner;

public class Sort_0_and_1_UsingExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int [] ans = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                ans[k++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1){
                ans[k++] = arr[i];
            }
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
