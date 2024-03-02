// Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
package Week_4_Arrays.Practice_Array;

public class PositiveValuesInArray {
    public static void main(String[] args) {
        int[] arr = {2, 6, -5, -1, 0, 4, -9};

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] >= 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
