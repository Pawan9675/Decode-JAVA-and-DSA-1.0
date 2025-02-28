package Week_17_PriorityQueue; 
/**
 * PRIORITY QUEUE (MAX HEAP) IN JAVA
 * ==================================
 * A `PriorityQueue` in Java is implemented using a **binary heap**.
 * By default, it acts as a **Min Heap**, but we can convert it into a **Max Heap** using a comparator.
 * 
 * Key Features:
 * --------------
 * 1. **Max Heap using Comparator**: The largest element is always at the head.
 * 2. **Dynamic Size**: Grows and shrinks as elements are added/removed.
 * 3. **No Null Elements**: Does not allow `null` elements.
 * 4. **Duplicate Elements Allowed**: Unlike a `TreeSet`, duplicates are permitted.
 * 5. **Unordered Iteration**: Elements are stored based on heap structure, not sorted order.
 * 6. **Performance**: Operations like `offer`, `poll`, and `remove` run in **O(log n)** time.
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        // Creating a Max Heap using PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        /**
         * 1. Adding Elements
         * -------------------
         * - `offer(element)` or `add(element)` is used to insert elements.
         * - The largest element always stays at the front.
         * - Time Complexity: O(log n)
         */
        pq.offer(10);
        pq.offer(20);
        pq.offer(15);
        pq.offer(30);
        pq.offer(5);
        pq.offer(40);

        System.out.println("PriorityQueue (Max Heap) after adding elements: " + pq);
        // Output (Heap structure, order may vary): [40, 30, 15, 10, 5, 20]

        /**
         * 2. Checking the Top Element
         * ----------------------------
         * - `peek()` returns the largest element (max).
         * - Returns `null` if the queue is empty.
         * - Time Complexity: O(1)
         */
        System.out.println("Largest Element (Max): " + pq.peek());  // Output: 40

        /**
         * 3. Removing Elements
         * ---------------------
         * - `poll()` removes and returns the largest element.
         * - `remove(element)` removes a specific element.
         * - Time Complexity: O(log n)
         */
        System.out.println("Removing largest element: " + pq.poll());  // Output: 40
        System.out.println("PriorityQueue after polling: " + pq);
        // Output: [30, 20, 15, 10, 5]

        pq.remove(15);
        System.out.println("PriorityQueue after removing 15: " + pq);
        // Output: [30, 20, 5, 10]

        /**
         * 4. Checking Size and Emptiness
         * -------------------------------
         * - `size()` returns the number of elements.
         * - `isEmpty()` checks if the queue is empty.
         * - Time Complexity: O(1)
         */
        System.out.println("Size of PriorityQueue: " + pq.size());  // Output: 4
        System.out.println("Is PriorityQueue empty? " + pq.isEmpty());  // Output: false

        /**
         * 5. Checking if an Element Exists
         * ----------------------------------
         * - `contains(element)` checks for an element's existence.
         * - Time Complexity: O(n)
         */
        System.out.println("Does the queue contain 20? " + pq.contains(20));  // Output: true
        System.out.println("Does the queue contain 50? " + pq.contains(50));  // Output: false

        /**
         * 6. Iterating Over Elements
         * ---------------------------
         * - Iteration order is NOT sorted (heap order is maintained internally).
         */
        System.out.print("Iterating over PriorityQueue: ");
        for (int num : pq) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Output (Heap structure, order may vary): 30 20 5 10

        /**
         * 7. Clearing the PriorityQueue
         * ------------------------------
         * - `clear()` removes all elements.
         */
        pq.clear();
        System.out.println("PriorityQueue after clearing: " + pq);
        // Output: []
    }
}
