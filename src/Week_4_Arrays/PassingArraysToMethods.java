package Week_4_Arrays;

public class PassingArraysToMethods {
    public static void change(int [] arr){
        arr[0] = 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]);     //First element of array before calling the change function
        change(arr);
        System.out.println(arr[0]);     //Second element of array after calling the change function

        /*
        arrays are passed by reference in Java, so modifications to the array within the method affect
        the original array.

        Note -> In Java, Reference variable gets passed
        */
    }
}
