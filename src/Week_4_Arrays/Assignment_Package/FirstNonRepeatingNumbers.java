// Find the first non-repeating element in the array .
package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class FirstNonRepeatingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println("First non-repeating number: " + arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating numbers found.");
        }
    }
}
