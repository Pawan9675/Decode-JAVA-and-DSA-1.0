package Week_14_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemoveLastKFromQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the queue
        System.out.print("Enter the number of elements in the queue: ");
        int n = scanner.nextInt();

        // Input the queue elements
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter the elements of the queue:");
        for (int i = 0; i < n; i++) {
            queue.offer(scanner.nextInt());
        }

        // Input the value of k
        System.out.print("Enter the number of elements to remove from the end (k): ");
        int k = scanner.nextInt();

        // Check for valid input
        if (k > n || k < 0) {
            System.out.println("Invalid value for k. It should be between 0 and " + n);
            return;
        }

        // Remove the last k elements
        int elementsToRetain = n - k;
        for (int i = 0; i < elementsToRetain; i++) {
            queue.offer(queue.poll()); // Rotate the queue to retain only the first (n - k) elements
        }
        for (int i = 0; i < k; i++) {
            queue.poll(); // Remove the last k elements
        }

        // Output the modified queue
        System.out.println("Queue after removing the last " + k + " elements: " + queue);

        scanner.close();
    }
}
