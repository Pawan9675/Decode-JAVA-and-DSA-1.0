// Print all the elements present in the given queue only using add(), remove(), peek(), size() and extra queue.

package Week_14_Queue;

import java.util.*;

public class PrintQueueUsingAllFunctions {
    public static void main(String[] args) {
        // Creating a queue and adding elements to it.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // Printing all elements of the queue using only add(), remove(), peek(), size(), and an extra queue.
        System.out.println("Elements in the queue:");
        printQueue(queue);
    }

    // Function to print all elements of the queue using allowed functions and an extra queue.
    public static void printQueue(Queue<Integer> queue) {
        // Creating an extra queue for temporary storage.
        Queue<Integer> tempQueue = new LinkedList<>();

        // Use a while loop to iterate over all elements of the queue.
        while (queue.size() > 0) {
            // Print the front element.
            System.out.print(queue.peek() + " ");

            // Remove the front element and add it to the temporary queue.
            tempQueue.add(queue.remove());  // Fixed syntax here
        }

        // Restore the original queue from the temporary queue.
        while (tempQueue.size() > 0) {
            queue.add(tempQueue.remove());
        }
    }
}
