package Week_17_PriorityQueue;
/**
 * PRIORITY QUEUE (MIN HEAP) IN JAVA
 * ==================================
 * A `PriorityQueue` is a part of Java's `java.util` package.
 * It implements the `Queue` interface and is backed by a **binary heap** (Min Heap by default).
 * A PriorityQueue stores elements in **natural order** (or based on a comparator).
 * 
 * Key Features:
 * --------------
 * 1. **Min Heap by Default**: The smallest element is always at the head.
 * 2. **Dynamic Size**: Automatically resizes as elements are added/removed.
 * 3. **No Null Elements**: PriorityQueue does not allow null elements.
 * 4. **Duplicate Elements Allowed**: Unlike a `TreeSet`, duplicates are permitted.
 * 5. **Unordered Iteration**: The iteration order is not sorted.
 * 6. **Performance**: Operations like `offer`, `poll`, and `remove` have O(log n) time complexity.
 */

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        // Creating a Min Heap using PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        /**
         * 1. Adding Elements
         * -------------------
         * - Use `offer(element)` or `add(element)` to insert elements.
         * - The smallest element always stays at the front.
         * - Time Complexity: O(log n)
         */
        pq.offer(10);
        pq.offer(20);
        pq.offer(15);
        pq.offer(30);
        pq.offer(5);
        pq.offer(40);

        System.out.println("PriorityQueue (Min Heap) after adding elements: " + pq);
        // Output (Heap structure, order may vary): [5, 10, 15, 30, 20, 40]

        /**
         * 2. Checking the Top Element
         * ----------------------------
         * - Use `peek()` to get the smallest element (min).
         * - Returns null if the queue is empty.
         * - Time Complexity: O(1)
         */
        System.out.println("Smallest Element (Min): " + pq.peek());  // Output: 5

        /**
         * 3. Removing Elements
         * ---------------------
         * - Use `poll()` to remove and return the smallest element.
         * - Use `remove()` to remove a specific element.
         * - Time Complexity: O(log n)
         */
        System.out.println("Removing smallest element: " + pq.poll());  // Output: 5
        System.out.println("PriorityQueue after polling: " + pq);
        // Output: [10, 20, 15, 30, 40]

        pq.remove(15);
        System.out.println("PriorityQueue after removing 15: " + pq);
        // Output: [10, 20, 40, 30]

        /**
         * 4. Checking Size and Emptiness
         * -------------------------------
         * - Use `size()` to get the number of elements.
         * - Use `isEmpty()` to check if the queue is empty.
         * - Time Complexity: O(1)
         */
        System.out.println("Size of PriorityQueue: " + pq.size());  // Output: 4
        System.out.println("Is PriorityQueue empty? " + pq.isEmpty());  // Output: false

        /**
         * 5. Checking if an Element Exists
         * ----------------------------------
         * - Use `contains(element)` to check for an element.
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
        // Output (Heap structure, order may vary): 10 20 40 30

        /**
         * 7. Clearing the PriorityQueue
         * ------------------------------
         * - Use `clear()` to remove all elements.
         */
        pq.clear();
        System.out.println("PriorityQueue after clearing: " + pq);
        // Output: []
    }
}
