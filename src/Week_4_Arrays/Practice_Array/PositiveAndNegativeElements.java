// Given an unsorted array arr[] of size N having both negative and positive integers,
// place all negative elements at the end of array
// without changing the order of positive elements and negative elements

package Week_4_Arrays.Practice_Array;

public class PositiveAndNegativeElements {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

        int[] ans = new int[arr.length];
        int k = 0;

        for (int element : arr) {
            if (element >= 0) {
                ans[k++] = element;
            }
        }

        for (int element : arr) {
            if (element < 0) {
                ans[k++] = element;
            }
        }

        System.out.println("Resulted Array: ");
        for (int element : ans) {
            System.out.print(element + " ");
        }
    }
}
