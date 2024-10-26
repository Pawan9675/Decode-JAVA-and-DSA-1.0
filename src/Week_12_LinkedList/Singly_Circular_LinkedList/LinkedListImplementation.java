package Week_12_LinkedList.Singly_Circular_LinkedList;

// Node class to represent each element in the list
class Node {
    int val;       // Value of the node
    Node next;    // Pointer to the next node

    // Constructor to initialize a new node
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// Singly Circular Linked List class
class SinglyCircularLinkedList {
    private Node head;  // Points to the first element of the list
    private Node tail;  // Points to the last element of the list
    private int size;   // Keeps track of the number of elements in the list

    // Method to insert a new value at the tail (end) of the linked list
    void insertAtTail(int val) {
        Node newNode = new Node(val);  // Create a new node with the provided value

        if (head == null) {             // If the list is empty
            head = tail = newNode;      // Set both head and tail to the new node
            tail.next = head;           // Point tail to head to maintain circular structure
        } else {
            tail.next = newNode;        // Link current tail to new node
            tail = newNode;             // Update tail to new node
            tail.next = head;           // Point new tail to head
        }
        size++;                         // Increment size of the list
    }

    // Method to insert a new value at the head (start) of the linked list
    void insertAtHead(int val) {
        Node newNode = new Node(val);  // Create a new node

        if (head == null) {             // If the list is empty
            head = tail = newNode;      // Set both head and tail to the new node
            tail.next = head;           // Point tail to head to maintain circular structure
        } else {
            newNode.next = head;        // New node points to the current head
            head = newNode;             // Update head to the new node
            tail.next = head;           // Update tail's next to new head
        }
        size++;                         // Increment size of the list
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

        Node newNode = new Node(val);   // Create a new node
        Node currentNode = head;         // Start at the head

        // Traverse to the node just before the index
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        // Insert the new node between currentNode and its next node
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;                         // Increment size of the list
    }

    // Method to get the value at a specific index in the linked list
    int get(int index) {
        if (index >= size || index < 0) { // Check if index is out of bounds
            throw new IndexOutOfBoundsException("Invalid Index!");
        }

        Node currentNode = head;          // Start at the head

        // Traverse to the given index
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.val;           // Return the value at the given index
    }

    // Method to update the value at a specific index in the linked list
    void set(int index, int value) {
        if (index >= size || index < 0) { // Check if index is out of bounds
            throw new IndexOutOfBoundsException("Invalid Index!");
        }

        Node currentNode = head;          // Start at the head

        // Traverse to the given index
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        currentNode.val = value;          // Update the value at the given index
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
            Node currentNode = head;       // Start at the head
            // Traverse to find the node just before the tail
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            currentNode.next = head;       // Update the second-to-last node to point to head
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

        Node currentNode = head;           // Start at the head

        // Traverse to the node just before the index
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        // Remove the node at the index by skipping over it
        currentNode.next = currentNode.next.next;
        size--;                             // Decrement size of the list
    }

    // Method to display the values in the linked list
    void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node currentNode = head;           // Start at the head

        // Traverse and print each value until we reach the tail
        while (currentNode != tail) {
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.val + " -> (back to head)\n"); // Indicate circular connection
    }

    public static void printSinglyCircular(Node head){      // When only head is given
        Node temp = head;
        while(true){
            System.out.print(temp.val + " ");
            if (temp.next==head) break;
            temp = temp.next;
        }
    }

    // Method to display the size of the linked list
    void size() {
        System.out.println("Current size of the list: " + size);
    }
}

// Main class to demonstrate the operations of the Singly Circular Linked List
public class LinkedListImplementation {
    public static void main(String[] args) {
        SinglyCircularLinkedList list = new SinglyCircularLinkedList(); // Create a new list

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
