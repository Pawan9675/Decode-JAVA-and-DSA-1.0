// WAP to find the smallest missing positive element in the sorted Array that contains only positive elements
package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class Smallest_Missing_Positive_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int x = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                System.out.println("Smallest missing element: " + x);
                flag = true;
                break;
            } else x++;
        }
        if (!flag) System.out.println("Smallest missing element: " + x);
    }
}
