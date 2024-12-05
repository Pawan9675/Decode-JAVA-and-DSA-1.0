package Week_14_Queue;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        // Creating a queue using LinkedList.
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue.
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Printing the original queue.
        System.out.println("Original Queue: " + queue);

        // Reversing the queue using a stack.
        reverseQueue(queue);

        // Printing the reversed queue.
        System.out.println("Reversed Queue: " + queue);
    }

    // Function to reverse the queue using a stack.
    public static void reverseQueue(Queue<Integer> queue) {
        // Create a stack to hold the queue elements.
        Stack<Integer> stack = new Stack<>();

        // Transfer all elements from the queue to the stack.
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Transfer all elements back from the stack to the queue.
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
