// Count the number of elements strictly greater than x.
package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class StrictlyGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > num) {
                count++;
            }
        }
        System.out.println("Number of element that are strictly greater than " + num + " is: " + count);
    }
}
