package Week_4_Arrays;

import java.util.Scanner;
// ONE PASS SOLUTION
public class Sort_0_and_1_WithoutUsingExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != 0 && arr[j] != 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

                // arr[i] = 0;
                // arr[j] = 1;      we can use this method too, don't need to use extra temp variable
                // i++;
                // j--;
            }

            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;
        }

        System.out.println("Sorted Array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
