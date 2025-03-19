package Week_17_PriorityQueue.Assignment_PriorityQueue;

import java.util.PriorityQueue;

class StackUsingPriorityQueue {
    private PriorityQueue<Pair> pq;
    private int timestamp;

    // Constructor
    public StackUsingPriorityQueue() {
        pq = new PriorityQueue<>((a, b) -> Integer.compare(b.timestamp, a.timestamp)); // Max-Heap
        timestamp = 0;
    }

    // Push operation
    public void push(int value) {
        pq.offer(new Pair(timestamp++, value));  // Insert with increasing timestamp
    }

    // Pop operation
    public int pop() {
        if (pq.isEmpty()) throw new RuntimeException("Stack is empty");
        return pq.poll().value;  // Remove element with the highest timestamp
    }

    // Peek operation
    public int peek() {
        if (pq.isEmpty()) throw new RuntimeException("Stack is empty");
        return pq.peek().value;  // Peek element with the highest timestamp
    }

    // Get size operation
    public int getSize() {
        return pq.size();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return pq.isEmpty();
    }

    // Helper class for storing (timestamp, value)
    private static class Pair {
        int timestamp;
        int value;

        Pair(int timestamp, int value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    // Main function to test
    public static void main(String[] args) {
        StackUsingPriorityQueue stack = new StackUsingPriorityQueue();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());  // Output: 30
        System.out.println(stack.pop());   // Output: 30
        System.out.println(stack.getSize()); // Output: 2
        System.out.println(stack.isEmpty()); // Output: false
    }
}
