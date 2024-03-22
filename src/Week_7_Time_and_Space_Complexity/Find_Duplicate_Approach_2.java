// Given an array of size n+1 consisting of integers from 1 to n.
// One of the elements is duplicate in the array. Find that duplicate element.

// Number of Operation = 7 Operations

/*
Observation:
    1. Time Efficient
    2. Space consuming
*/

package Week_7_Time_and_Space_Complexity;

public class Find_Duplicate_Approach_2 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 4, 1, 7, 1, 5};

        int[] check  = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (check[arr[i]] == 0){
                check[arr[i]] ++;
            }
            else{
                System.out.println("Duplicate element: "+ arr[i]);
                break;
            }
        }
    }
}
