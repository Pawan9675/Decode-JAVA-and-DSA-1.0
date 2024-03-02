// Given an array of positive and negative numbers, arrange them in an alternate fashion such that
// every positive number is followed by a negative and vice-versa maintaining the order of appearance.
//The number of positive and negative numbers need not be equal. Begin with a negative number.
//If there are more positive numbers, they appear at the end of the array. If there are more negative
//numbers, they too appear at the end of the array
package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class AlternatePositiveAndNegative {
    public static int[] alternateNegPos(int[] arr) {
        int n = arr.length;
        int posCount = 0;
        int negCount = 0;

        // Count the number of positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) posCount++;
            else negCount++;
        }

        // Separate positive and negative numbers into separate arrays
        int[] posArray = new int[posCount];
        int[] negArray = new int[negCount];

        int posIndex = 0;
        int negIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) posArray[posIndex++] = arr[i];
            else negArray[negIndex++] = arr[i];
        }

        // Merge positive and negative arrays in alternate fashion
        int[] result = new int[n];
        int i = 0, j = 0, k = 0;
        while (i < posCount && j < negCount) {
            result[k++] = negArray[j++];
            result[k++] = posArray[i++];
        }
        // Append remaining negative numbers
        while (j < negCount) {
            result[k++] = negArray[j++];
        }
        // Append remaining positive numbers
        while (i < posCount) {
            result[k++] = posArray[i++];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = alternateNegPos(arr);
        System.out.println("Resulted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
