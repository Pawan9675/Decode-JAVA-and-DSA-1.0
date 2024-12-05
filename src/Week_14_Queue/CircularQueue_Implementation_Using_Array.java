package Week_14_Queue;

public class CircularQueue_Implementation_Using_Array {
    public static class CircularQueue{ 
        int front = -1;
        int rear = -1;
        int size = 0;
        int []arr = new int[5];  // Fixed size array for the queue
        
        // Adds an element to the queue.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is Full!");
            }
            else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            }
            else if (rear < arr.length - 1) {
                arr[++rear] = val;
            }
            else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        // Removes an element from the queue.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            else {
                int val = arr[front];
                if (front == arr.length - 1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        // Peeks at the front element of the queue without removing it.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            else return arr[front];
        }

        // Checks if the queue is empty.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        public boolean isEmpty() {
            return size == 0;
        }

        // Checks if the queue is full.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        public boolean isFull() {
            return size == arr.length;
        }

        // Returns the current size of the queue.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        public int getSize() {
            return size;
        }

        // Displays the elements in the queue.
        // Time Complexity: O(n) where n is the number of elements in the queue.
        // Space Complexity: O(1)
        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }
            else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            else { // rear < front (queue is wrapped)
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        // Clears the queue by resetting front, rear, and size.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        public void clear() {
            front = rear = -1;
            size = 0;
            System.out.println("Queue has been cleared.");
        }
    }

    public static void main(String[] args) throws Exception {
        CircularQueue cq = new CircularQueue(); 
        cq.display();  // Display empty queue

        // Adding elements to the queue
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.display();  // Display after adding 4 elements

        // Removing one element from the queue
        cq.remove();
        cq.display();  // Display after removing 1 element

        // Adding more elements to the queue
        cq.add(5);
        cq.display();  // Display after adding 5
        cq.add(6);
        cq.display();  // Display after adding 6 (this will wrap around)

        // Check if the queue is full
        System.out.println("Is the queue full? " + cq.isFull());  // Should return true

        // Display current size of the queue
        System.out.println("Current size of queue: " + cq.getSize());  // Should return 5

        // Display the current front element
        System.out.println("Front element: " + cq.peek());

        // Clear the queue
        cq.clear();
        cq.display();  // Display after clearing the queue

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + cq.isEmpty());  // Should return true
    }
}
