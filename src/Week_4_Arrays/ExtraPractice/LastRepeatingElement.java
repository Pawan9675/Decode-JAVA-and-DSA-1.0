package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class LastRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lastRepeating = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    lastRepeating = arr[i];
                }
            }
        }

        if (lastRepeating != -1) {
            System.out.println("Last repeating number: " + lastRepeating);
        } else {
            System.out.println("No repeating numbers found.");
        }
    }
}
