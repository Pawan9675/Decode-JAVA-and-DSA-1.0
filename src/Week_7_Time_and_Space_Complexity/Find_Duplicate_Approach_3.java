// Given an array of size n+1 consisting of integers from 1 to n.
// One of the elements is duplicate in the array. Find that duplicate element.

// Number of Operation = 7 Operations
/*
Observation:
    1. Time Efficient
    2. Space Efficient
*/
package Week_7_Time_and_Space_Complexity;


public class Find_Duplicate_Approach_3 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 4, 1, 7, 1, 5};

        int n = arr.length-1;
        int sum1 = 0;

        for (int i = 0; i <= n; i++) {
            sum1 += arr[i];
        }

        int sum2 = n*(n+1) / 2;

        System.out.println("Duplicate element: "+ (sum1-sum2));
    }
}
