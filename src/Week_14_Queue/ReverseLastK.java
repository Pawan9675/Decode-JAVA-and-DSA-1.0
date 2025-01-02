package Week_14_Queue;

import java.util.*;

public class ReverseLastK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input queue size
        System.out.print("Enter the size of the queue: ");
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter " + n + " elements of the queue:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        // Input k (number of elements to reverse)
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Check if k is valid
        if (k > n || k < 0) {
            System.out.println("Invalid value of k. It should be between 0 and " + n);
            return;
        }

        // Reverse the last k elements
        reverseLastK(queue, k);

        // Output the modified queue
        System.out.println("Modified queue: " + queue);
    }

    public static void reverseLastK(Queue<Integer> queue, int k) {
        int n = queue.size();

        // Step 1: Dequeue first (n-k) elements
        for (int i = 0; i < n - k; i++) {
            queue.add(queue.remove());
        }

        // Step 2: Push the last k elements into a stack for reversing
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // Step 3: Add the reversed elements back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
