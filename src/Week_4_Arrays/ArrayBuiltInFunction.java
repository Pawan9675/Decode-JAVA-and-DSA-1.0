package Week_4_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayBuiltInFunction {
    public static void main(String[] args) {
        int[] arr = {10,56,63,8,1,0,45};
        System.out.print("Original array: ");
        for (int element : arr){
            System.out.print(element+" ");
        }

        // sorting an array in ascending order
        Arrays.sort(arr);

        System.out.println();
        System.out.print("Sorted array in ascending order: ");
        for (int element : arr){
            System.out.print(element+" ");
        }

        // Printing the elements of array
        System.out.println();
        System.out.println("Printed array: " + Arrays.toString(arr));

        // sorting an array in descending order
        Integer [] array = {2,4,1,9,10};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.print("Sorted array in descending order: ");
        System.out.println(Arrays.toString(array));

    }
}
