// Move all zeros to the end of the array

package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class Move_All_Zeroes_To_End {
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
            if (arr[i] == 0 && arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            if (arr[i] != 0) i++;
            if (arr[j] == 0) j--;
        }

        System.out.println("Resulted Array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
