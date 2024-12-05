package Week_14_Queue;

public class Implementation_Of_Queue_Using_Array {

    public static class Queue {
        private int[] arr = new int[5];  // Array to hold queue elements.
        private int front = -1;  // Front index of the queue.
        private int rear = -1;   // Rear index of the queue.
        private int size = 0;    // Current size of the queue.

        // Add function to insert an element into the queue.
        // Time Complexity: O(1) - Constant time to add an element.
        // Space Complexity: O(1) - Constant space for adding an element.
        public void add(int val) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full! Cannot add " + val);
                return;
            }
            if (front == -1 && rear == -1) {
                front = rear = 0;  // Queue is empty.
                arr[rear] = val;
            } else {
                arr[++rear] = val;
            }
            size++;
        }

        // Remove function to remove and return the front element.
        // Time Complexity: O(1) - Constant time to remove an element.
        // Space Complexity: O(1) - Constant space for removing an element.
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            front++;  // Move the front pointer forward.
            size--;
            return arr[front - 1];
        }

        // Peek function to view the front element without removing it.
        // Time Complexity: O(1) - Constant time to access the front element.
        // Space Complexity: O(1) - Constant space for accessing the front element.
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }

        // Checks if the queue is empty.
        // Time Complexity: O(1) - Constant time to check if the queue is empty.
        // Space Complexity: O(1) - Constant space for checking emptiness.
        public boolean isEmpty() {
            return size == 0;
        }

        // Check if the queue is full.
        // Time Complexity: O(1) - Constant time to check if the queue is full.
        // Space Complexity: O(1) - Constant space for checking fullness.
        public boolean isFull() {
            return rear == arr.length - 1;
        }

        // Returns the current size of the queue.
        // Time Complexity: O(1) - Constant time to retrieve the size.
        // Space Complexity: O(1) - Constant space for retrieving the size.
        public int size() {
            return size;
        }

        // Displays all elements in the queue.
        // Time Complexity: O(n) - Linear time to display all elements.
        // Space Complexity: O(1) - Constant space for displaying elements.
        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.print("Queue elements: [");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]);
                if (i < rear) System.out.print(", ");
            }
            System.out.println("]");
        }


        // Checks if an element is present in the queue.
        // Time Complexity: O(n) - Linear time to search through the queue.
        // Space Complexity: O(1) - Constant space for checking if an element exists.
        public boolean contains(int val) {
            for (int i = front; i <= rear; i++) {
                if (arr[i] == val) return true;
            }
            return false;
        }

        // Searches for the position of an element in the queue.
        // Time Complexity: O(n) - Linear time to search for the element.
        // Space Complexity: O(1) - Constant space for searching.
        public int search(int val) {
            for (int i = front; i <= rear; i++) {
                if (arr[i] == val) {
                    return i - front;  // Return the position relative to the front of the queue.
                }
            }
            return -1;  // Return -1 if element is not found.
        }

        // Clears the queue by resetting the front and rear pointers.
        // Time Complexity: O(1) - Constant time to clear the queue.
        // Space Complexity: O(1) - Constant space for clearing the queue.
        public void clear() {
            front = rear = -1;
            size = 0;
            System.out.println("Queue has been cleared.");
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

        // Checking size and if the queue is full.
        System.out.println("Size of queue: " + q.size()); // Output: Size of queue: 5
        System.out.println("Is queue full? " + (q.size() == 5)); // Output: Is queue full? true

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

        q.clear();  // Clear the queue
        System.out.println("Is queue empty after clear? " + q.isEmpty());  // Output: true
        q.display();  // Output: Queue elements: []
    }
}
