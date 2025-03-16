// Given an array of elements, sort the array in decreasing order using min heap.

package Week_17_PriorityQueue.Assignment_PriorityQueue;

import java.util.*;

public class MinHeapSortDescending {
    public static void main(String[] args) {
        // 🏷️ Step 1: Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 🏷️ Step 2: Create a Min Heap (PriorityQueue in Java)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // 🏷️ Step 3: Insert all elements into the Min Heap
        for (int num : arr) {
            minHeap.add(num);
        }
        
        // 🏷️ Step 4: Extract elements from Min Heap and store in reverse order
        int[] sortedArr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            sortedArr[i] = minHeap.poll(); // Remove min element
        }
        
        // 🏷️ Step 5: Print the sorted array in decreasing order
        System.out.println("Sorted array in decreasing order:");
        System.out.println(Arrays.toString(sortedArr));
        
        sc.close();
    }
}
