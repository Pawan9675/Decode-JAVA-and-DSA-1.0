// Given an array of size n+1 consisting of integers from 1 to n.
// One of the elements is duplicate in the array. Find that duplicate element.


// Number of Operation = 7 + 6 + 5 + 4 + 2 = 24 Operations

/*
Observation:
    1. Extra Time Consuming
    2. Space Efficient
*/

package Week_7_Time_and_Space_Complexity;

public class Find_Duplicate_Approach_1 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 4, 1, 7, 1, 5};

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate element: "+arr[i]);
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }

    }
}
