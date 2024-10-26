package Week_12_LinkedList.Doubly_Circlular_LinkedList;

// Node class to represent each element in the doubly circular linked list
class dNode {
    int val;        // Value of the node
    dNode next;     // Pointer to the next node
    dNode prev;     // Pointer to the previous node

    // Constructor to initialize a new node
    public dNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

// Doubly Circular Linked List class
class DoublyCircularLinkedList {
    private dNode head;   // Points to the first element of the list
    private dNode tail;   // Points to the last element of the list
    private int size;     // Keeps track of the number of elements in the list

    // Method to insert a new value at the tail (end) of the linked list
    void insertAtTail(int val) {
        dNode newNode = new dNode(val); // Create a new node

        if (head == null) {               // If the list is empty
            head = tail = newNode;        // Set both head and tail to the new node
            head.next = head;             // Point head's next to itself
            head.prev = head;             // Point head's prev to itself
        } else {
            tail.next = newNode;          // Link current tail to new node
            newNode.prev = tail;          // Set new node's prev to current tail
            newNode.next = head;          // New node points to head
            head.prev = newNode;          // Head's prev points to new node
            tail = newNode;                // Update tail to be the new node
        }
        size++;                             // Increment size of the list
    }

    // Method to insert a new value at the head (start) of the linked list
    void insertAtHead(int val) {
        dNode newNode = new dNode(val);  // Create a new node

        if (head == null) {               // If the list is empty
            head = tail = newNode;        // Set both head and tail to the new node
            head.next = head;             // Point head's next to itself
            head.prev = head;             // Point head's prev to itself
        } else {
            newNode.next = head;          // New node points to the current head
            newNode.prev = tail;          // New node's prev points to tail
            head.prev = newNode;          // Current head's prev points to new node
            tail.next = newNode;          // Tail's next points to new node
            head = newNode;                // Update head to the new node
        }
        size++;                             // Increment size of the list
    }

    // Method to insert a new value at a specific index in the linked list
    void insert(int index, int val) {
        if (index == 0) {               // If inserting at the start
            insertAtHead(val);
            return;
        }

        if (index == size) {            // If inserting at the end
            insertAtTail(val);
            return;
        }

        if (index > size || index < 0) { // If index is out of bounds
            System.out.println("Invalid Index!");
            return;
        }

        dNode newNode = new dNode(val);   // Create a new node
        dNode currentNode = head;          // Start at the head

        // Traverse to the node just before the index
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        // Insert the new node between currentNode and its next node
        newNode.next = currentNode.next;
        newNode.prev = currentNode;         // Set new node's prev
        currentNode.next.prev = newNode;    // Update the next node's prev
        currentNode.next = newNode;
        size++;                             // Increment size of the list
    }

    // Method to get the value at a specific index in the linked list
    int get(int index) {
        if (index >= size || index < 0) { // Check if index is out of bounds
            throw new IndexOutOfBoundsException("Invalid Index!");
        }

        dNode currentNode = head;          // Start at the head

        // Traverse to the given index
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.val;            // Return the value at the given index
    }

    // Method to update the value at a specific index in the linked list
    void set(int index, int value) {
        if (index >= size || index < 0) { // Check if index is out of bounds
            throw new IndexOutOfBoundsException("Invalid Index!");
        }

        dNode currentNode = head;          // Start at the head

        // Traverse to the given index
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        currentNode.val = value;           // Update the value at the given index
    }

    // Method to delete the first node (head) from the linked list
    void deleteAtHead() {
        if (head == null) {                // Check if the list is empty
            throw new IllegalStateException("LinkedList is empty");
        }

        if (head == tail) {                // If there's only one node
            head = tail = null;            // Set both head and tail to null
        } else {
            head = head.next;              // Move the head to the next node
            head.prev = tail;              // Update new head's prev to tail
            tail.next = head;              // Update tail's next to new head
        }
        size--;                             // Decrement size of the list
    }

    // Method to delete the last node (tail) from the linked list
    void deleteAtTail() {
        if (head == null) {                // Check if the list is empty
            throw new IllegalStateException("LinkedList is empty");
        }

        if (head == tail) {                // If there's only one node
            head = tail = null;            // Set both head and tail to null
        } else {
            dNode currentNode = head;      // Start at the head
            // Traverse to find the node just before the tail
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            currentNode.next = head;       // Update the second-to-last node to point to head
            head.prev = currentNode;       // Update head's prev to the new tail
            tail = currentNode;            // Update tail to be the second-to-last node
        }
        size--;                             // Decrement size of the list
    }

    // Method to delete a node at a specific index in the linked list
    void delete(int index) {
        if (index == 0) {                  // If deleting the head
            deleteAtHead();
            return;
        }

        if (index >= size || index < 0) { // Check if index is out of bounds
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        dNode currentNode = head;          // Start at the head

        // Traverse to the node just before the index
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        // Remove the node at the index by skipping over it
        currentNode.next = currentNode.next.next; // Skip the node to be deleted
        currentNode.next.prev = currentNode;       // Update the next node's prev
        size--;                                     // Decrement size of the list
    }

    // Method to display the values in the linked list
    void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        dNode currentNode = head;           // Start at the head

        // Traverse and print each value until we reach the tail
        while (currentNode != tail) {
            System.out.print(currentNode.val + " <-> ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.val + " <-> (back to head)\n"); // Indicate circular connection
    }

    // Method to display the size of the linked list
    void size() {
        System.out.println("Current size of the list: " + size);
    }

    // Method to print the list starting from the head
    public static void printDoublyCircular(dNode head) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        dNode temp = head;
        while (true) {
            System.out.print(temp.val + " ");
            if (temp.next == head) break; // Break if we complete one full loop
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class to demonstrate the operations of the Doubly Circular Linked List
public class LinkedListImplementation {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList(); // Create a new list

        // Display the initial size (should be 0)
        list.size();

        // Insert values at the tail of the list
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        // Display the list and its size
        list.display();
        list.size();

        // Insert a value at the head
        list.insertAtHead(0);
        list.display();
        list.size();

        // Insert a value at index 2
        list.insert(2, 25);
        list.display();
        list.size();

        // Get and print the value at index 2
        System.out.println("Value at index 2: " + list.get(2));

        // Update the value at index 2
        list.set(2, 50);
        list.display();
        list.size();

        // Delete the head of the list
        list.deleteAtHead();
        list.display();
        list.size();

        // Delete the element at index 1
        list.delete(1);
        list.display();
        list.size();
    }
}
