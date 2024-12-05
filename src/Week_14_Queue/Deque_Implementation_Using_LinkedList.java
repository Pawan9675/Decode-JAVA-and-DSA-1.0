package Week_14_Queue;

public class Deque_Implementation_Using_LinkedList {

    // Node class to represent each element in the deque.
    public static class Node {
        int val;        // Value of the node
        Node next;      // Pointer to the next node
        Node prev;      // Pointer to the previous node

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Deque class with operations for a doubly linked list.
    public static class Deque {
        private Node front = null;  // Pointer to the front node
        private Node rear = null;   // Pointer to the rear node
        private int size = 0;       // Tracks the current size of the deque

        // Inserts an element at the front of the deque.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        void insertFront(int val) {
            Node newNode = new Node(val);
            if (front == null) { // Deque is empty
                front = rear = newNode;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
            size++;
        }

        // Inserts an element at the rear of the deque.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        void insertRear(int val) {
            Node newNode = new Node(val);
            if (rear == null) { // Deque is empty
                front = rear = newNode;
            } else {
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        // Removes and returns the front element of the deque.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        int deleteFront() {
            if (size == 0) {
                System.out.println("Deque is empty! Cannot delete from front.");
                return -1;
            }
            Node temp = front;
            front = front.next;
            if (front == null) rear = null; // Deque is empty after deletion
            else front.prev = null;
            size--;
            return temp.val;
        }

        // Removes and returns the rear element of the deque.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        int deleteRear() {
            if (size == 0) {
                System.out.println("Deque is empty! Cannot delete from rear.");
                return -1;
            }
            Node temp = rear;
            rear = rear.prev;
            if (rear == null) front = null; // Deque is empty after deletion
            else rear.next = null;
            size--;
            return temp.val;
        }

        // Returns the front element of the deque without removing it.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        int getFront() {
            if (size == 0) {
                System.out.println("Deque is empty! Cannot access front.");
                return -1;
            }
            return front.val;
        }

        // Returns the rear element of the deque without removing it.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        int getRear() {
            if (size == 0) {
                System.out.println("Deque is empty! Cannot access rear.");
                return -1;
            }
            return rear.val;
        }

        // Checks if the deque is empty.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        boolean isEmpty() {
            return size == 0;
        }

        // Returns the current size of the deque.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        int getSize() {
            return size;
        }

        // Displays all elements in the deque from front to rear.
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        void display() {
            if (isEmpty()) {
                System.out.println("Deque is empty!");
                return;
            }
            Node current = front;
            System.out.print("Deque elements: [");
            while (current != null) {
                System.out.print(current.val);
                if (current.next != null) System.out.print(", ");
                current = current.next;
            }
            System.out.println("]");
        }

        // Clears the deque by resetting front, rear, and size.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        void clear() {
            front = rear = null;
            size = 0;
            System.out.println("Deque has been cleared.");
        }

        // Checks if a specific value is present in the deque.
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        boolean contains(int val) {
            Node current = front;
            while (current != null) {
                if (current.val == val) return true;
                current = current.next;
            }
            return false;
        }

        // Searches for the position of a specific value in the deque.
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int search(int val) {
            Node current = front;
            int index = 0;
            while (current != null) {
                if (current.val == val) return index; // Found, return index
                current = current.next;
                index++;
            }
            return -1; // Not found
        }
    }

    public static void main(String[] args) {
        Deque deque = new Deque();

        System.out.println("** Inserting elements at the front and rear **");
        deque.insertFront(10); // Insert 10 at front
        deque.insertRear(20);  // Insert 20 at rear
        deque.insertFront(5);  // Insert 5 at front
        deque.insertRear(30);  // Insert 30 at rear
        deque.display();       // Output: [5, 10, 20, 30]
        System.out.println();

        System.out.println("** Getting front and rear elements **");
        System.out.println("Front element: " + deque.getFront()); // Output: 5
        System.out.println("Rear element: " + deque.getRear());   // Output: 30
        System.out.println();

        System.out.println("** Removing elements from the front and rear **");
        System.out.println("Removed from front: " + deque.deleteFront()); // Output: 5
        System.out.println("Removed from rear: " + deque.deleteRear());   // Output: 30
        deque.display();                                                  // Output: [10, 20]
        System.out.println();

        System.out.println("** Checking if deque contains specific elements **");
        System.out.println("Contains 10? " + deque.contains(10));  // Output: true
        System.out.println("Position of 20: " + deque.search(20)); // Output: 1
        System.out.println("Contains 15? " + deque.contains(15));  // Output: false
        System.out.println();

        System.out.println("** Getting deque size **");
        System.out.println("Current size of deque: " + deque.getSize());  // Output: 2
        System.out.println();

        System.out.println("** Checking if the deque is empty **");
        System.out.println("Is deque empty? " + deque.isEmpty());         // Output: false
        System.out.println();

        System.out.println("** Inserting more elements **");
        deque.insertFront(50); // Insert 50 at front
        deque.insertRear(60);  // Insert 60 at rear
        deque.display();       // Output: [50, 10, 20, 60]
        System.out.println();

        System.out.println("** Clearing the deque **");
        deque.clear();         // Clears the deque
        deque.display();       // Output: Deque is empty!
        System.out.println();

        System.out.println("** Checking if the deque is empty after clearing **");
        System.out.println("Is deque empty? " + deque.isEmpty());         // Output: true
    }
}
