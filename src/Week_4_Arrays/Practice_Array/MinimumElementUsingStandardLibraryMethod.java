// Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4}
// using standard library method for calculating the minimum element.

package Week_4_Arrays.Practice_Array;

import java.util.Arrays;

public class MinimumElementUsingStandardLibraryMethod {
    public static void main(String[] args) {
        int[] arr = {2, -3, 5, 8, 1, 0, -4};

        Arrays.sort(arr);
        System.out.println("Minimum element: "+arr[0]);

       /* int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] < min){
                min = Math.min(min, arr[i]);
            }
        }

        System.out.println("Minimum element: "+min);*/

    }
}