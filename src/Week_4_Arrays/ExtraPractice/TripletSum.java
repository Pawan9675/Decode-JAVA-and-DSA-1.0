package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i]+arr[j]+arr[k] == target)
                        count++;
                }
            }
        }

        System.out.println("Triplet sum count: "+count);
    }
}
