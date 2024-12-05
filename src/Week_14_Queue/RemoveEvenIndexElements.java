package Week_14_Queue;

import java.util.*;

public class RemoveEvenIndexElements {
    public static void main(String[] args) {
        // Creating a queue and adding elements to it.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        System.out.println("Original queue: " + queue);

        // Removing elements at even indices (0-based indexing).
        removeEvenIndexElements(queue);

        System.out.println("Queue after removing elements at even indices: " + queue);
    }

    // Function to remove elements at even indices from the queue.
    public static void removeEvenIndexElements(Queue<Integer> queue) {
        // Create a temporary queue to store elements at odd indices.
        Queue<Integer> tempQueue = new LinkedList<>();

        int index = 0;  // 0-based index
        int size = queue.size();  // Get the initial size of the queue

        // Iterate through the queue and filter out even-indexed elements.
        while (size > 0) {
            int element = queue.remove();  // Remove the front element of the queue

            // If the index is odd, add it to the tempQueue, otherwise skip it.
            if (index % 2 != 0) {
                tempQueue.add(element);
            }

            index++;
            size--;  // Decrease the size counter
        }

        // Restore the queue with only elements at odd indices.
        while (!tempQueue.isEmpty()) {
            queue.add(tempQueue.remove());
        }
    }
}
