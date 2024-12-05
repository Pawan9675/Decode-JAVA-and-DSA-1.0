package Week_14_Queue;

public class LinkedList_Implementation_Of_Queue {

    // Node class to represent each element in the queue.
    public static class Node {
        int val;      // Value of the node.
        Node next;    // Pointer to the next node.

        Node(int val) {
            this.val = val;
        }
    }

    public static class Queue {
        private Node head = null;  // Front (head) of the queue for deletion/peek.
        private Node tail = null;  // Rear (tail) of the queue for addition.
        private int size = 0;      // Tracks the current size of the queue.

        // Adds an element to the end (tail) of the queue.
        // Time Complexity: O(1) - Constant time to add an element at the tail.
        // Space Complexity: O(1) - Constant space for adding a node.
        public void add(int val) {
            Node temp = new Node(val);
            if (size == 0) { // Queue is empty.
                head = tail = temp;
            } else {
                tail.next = temp; // Link new node to the end.
                tail = temp;      // Update the tail pointer.
            }
            size++;
        }

        // Returns the front element of the queue without removing it.
        // Time Complexity: O(1) - Constant time to peek the front element.
        // Space Complexity: O(1) - Constant space for peeking.
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        // Removes and returns the front element of the queue.
        // Time Complexity: O(1) - Constant time to remove the front element.
        // Space Complexity: O(1) - Constant space for removal.
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = head.val;
            head = head.next; // Move the head pointer to the next node.
            size--;
            if (size == 0) {
                tail = null; // Reset tail if queue becomes empty.
            }
            return val;
        }

        // Displays all elements in the queue from front to rear.
        // Time Complexity: O(n) - Linear time to display all elements.
        // Space Complexity: O(1) - Constant space for displaying elements.
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue elements: [");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                if (temp.next != null) System.out.print(", ");
                temp = temp.next;
            }
            System.out.println("]");
        }

        // Checks if the queue is empty.
        // Time Complexity: O(1) - Constant time to check if the queue is empty.
        // Space Complexity: O(1) - Constant space for checking emptiness.
        public boolean isEmpty() {
            return size == 0;
        }

        // Returns the current size of the queue.
        // Time Complexity: O(1) - Constant time to retrieve the size.
        // Space Complexity: O(1) - Constant space for retrieving the size.
        public int size() {
            return size;
        }

        // Clears the queue by resetting head, tail, and size.
        // Time Complexity: O(1) - Constant time to clear the queue.
        // Space Complexity: O(1) - Constant space for clearing.
        public void clear() {
            head = tail = null;
            size = 0;
            System.out.println("Queue has been cleared.");
        }

        // Checks if an element is present in the queue.
        // Time Complexity: O(n) - Linear time to search through the queue.
        // Space Complexity: O(1) - Constant space for checking if an element exists.
        public boolean contains(int val) {
            Node temp = head;
            while (temp != null) {
                if (temp.val == val) return true;
                temp = temp.next;
            }
            return false;
        }

        // Searches for the position of an element in the queue.
        // Time Complexity: O(n) - Linear time to search for the element.
        // Space Complexity: O(1) - Constant space for searching.
        public int search(int val) {
            Node temp = head;
            int index = 0;
            while (temp != null) {
                if (temp.val == val) {
                    return index; // Return 0-based index.
                }
                temp = temp.next;
                index++;
            }
            return -1; // Return -1 if element is not found.
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        // Add elements to the queue.
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display(); // Output: Queue elements: [10, 20, 30, 40, 50]

        // Checking size and if the queue is empty.
        System.out.println("Size of queue: " + q.size()); // Output: Size of queue: 5

        // Peek at the front element.
        System.out.println("Front element: " + q.peek()); // Output: Front element: 10

        // Remove elements from the queue.
        System.out.println("Removed element: " + q.remove()); // Output: Removed element: 10
        System.out.println("Removed element: " + q.remove()); // Output: Removed element: 20

        // Checking current size.
        System.out.println("Current size: " + q.size()); // Output: Current size: 3
        q.display(); // Output: Queue elements: [30, 40, 50]

        // Remove remaining elements.
        System.out.println("Removed element: " + q.remove()); // Output: Removed element: 30
        System.out.println("Removed element: " + q.remove()); // Output: Removed element: 40
        System.out.println("Removed element: " + q.remove()); // Output: Removed element: 50

        // Checking current size after emptying the queue.
        System.out.println("Current size after emptying: " + q.size()); // Output: Current size after emptying: 0
        System.out.println("Is queue empty? " + q.isEmpty()); // Output: Is queue empty? true

        // Test contains and search methods.
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Does queue contain 20? " + q.contains(20));  // Output: true
        System.out.println("Does queue contain 50? " + q.contains(50));  // Output: false

        System.out.println("Position of 20: " + q.search(20));  // Output: Position of 20: 1
        System.out.println("Position of 50: " + q.search(50));  // Output: -1

        // Clear the queue.
        q.clear();  // Output: Queue has been cleared.
        System.out.println("Is queue empty after clear? " + q.isEmpty());  // Output: true
        q.display();  // Output: Queue is empty

    }
}
