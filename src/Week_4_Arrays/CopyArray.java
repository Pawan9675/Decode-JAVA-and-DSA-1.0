package Week_4_Arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int element : arr){
            System.out.print(element+" ");
        }
        System.out.println();

        // shallow copy
        int[] nums = arr;
        nums[0] = 10;
        System.out.println(nums[0]);
        System.out.println(arr[0]);

        // deep copy

        // Method 1 ->
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[1] = 10;
        System.out.println(brr[1]);
        System.out.println(arr[1]);

        // Method 2 ->
        int[] crr = new int[arr.length];
        for (int i = 0; i <crr.length ; i++) {
            crr[i] = arr[i];
        }
        crr[1] = 10;
        System.out.println(crr[1]);
        System.out.println(arr[1]);

        // Method 3 ->
        int[] drr = arr.clone();
        drr[1] = 10;
        System.out.println(drr[1]);
        System.out.println(arr[1]);
    }
}
