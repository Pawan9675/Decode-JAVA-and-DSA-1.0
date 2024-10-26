package Week_12_LinkedList.Singly_LinkedList;

// This is the class to implement a Singly Linked List
class SinglyLinkedList {        // User Defined Data Structure
    // Node reference to the head (start) and tail (end) of the list
    // These fields are private to enforce encapsulation, allowing controlled access only through public methods
    private Node head;          // Points to the first element of the list
    private Node tail;          // Points to the last element of the list
    private int size;           // Keeps track of the number of elements in the list

    /**
     * Method to insert a new value at the tail (end) of the LinkedList
     * Time Complexity -> O(1) [if tail is provided directly]
     * Space Complexity -> O(1)
     * If the tail is not available, time complexity would be O(N) due to traversal to the end of the list
     */
    void insertAtTail(int val) {
        Node newNode = new Node(val);       // Create a new node with the provided value

        if (head == null) {                 // If the list is empty, both head and tail point to the new node
            head = tail = newNode;
        } else {
            tail.next = newNode;            // Point the current tail to the new node
            tail = newNode;                 // Update the tail to the new node
        }
        size++;                             // Increase the size of the list
    }

    /**
     * Method to insert a new value at the head (start) of the LinkedList
     * Time Complexity -> O(1)
     * Space Complexity -> O(1)
     */
    void insertAtHead(int val) {
        Node newNode = new Node(val);       // Create a new node with the provided value

        if (head == null) {                 // If the list is empty, both head and tail point to the new node
            head = tail = newNode;
        } else {
            newNode.next = head;            // New node points to the current head
            head = newNode;                 // Update head to the new node
        }
        size++;                             // Increase the size of the list
    }

    /**
     * Method to insert a new value at a specific index in the LinkedList
     * Time Complexity -> O(N) (due to traversal to the given index)
     * Space Complexity -> O(1)
     */
    void insert(int index, int val) {
        if (index == 0) {                           // If inserting at the start, call insertAtHead
            insertAtHead(val);
            return;
        }

        if (index == size) {                        // If inserting at the end, call insertAtTail
            insertAtTail(val);
            return;
        }

        if (index > size || index < 0) {            // If the index is out of bounds, display error
            System.out.println("Invalid Input!!!");
            return;
        }

        Node newNode = new Node(val);               // Create a new node with the provided value

        // Traverse the list to the node before the index
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        // Insert the new node between currentNode and its next node
        newNode.next = currentNode.next;
        currentNode.next = newNode;

        size++;                                     // Increase the size of the list
    }


    /**
     * Method to get the value at a specific index in the LinkedList
     * Time Complexity -> O(N) (due to traversal to the index)
     * Space Complexity -> O(1)
     */
    int get(int index) throws Error {
        if (index == size - 1) return tail.val;         // If requesting the last element, return the tail's value

        // Check if the index is out of bounds
        if (index >= size || index < 0) {
            throw new Error("Invalid Input!!!");
        }

        Node currentNode = head;                        // Start at the head

        // Traverse the list to the given index
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.val;                         // Return the value at the given index
    }


    /**
     * Method to update the value at a specific index in the LinkedList
     * Time Complexity -> O(N) (due to traversal to the index)
     * Space Complexity -> O(1)
     */
    void set(int index, int value) throws Error {
        if (index == size - 1) tail.val = value;        // If updating the last element, update the tail

        // Check if the index is out of bounds
        if (index >= size || index < 0) {
            throw new Error("Invalid Input!!!");
        }

        Node currentNode = head;                        // Start at the head

        // Traverse the list to the given index
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        currentNode.val = value;                        // Update the value at the given index
    }

    /**
     * Method to delete the first node (head) from the LinkedList
     * Time Complexity -> O(1)
     * Space Complexity -> O(1)
     */
    void deleteAtHead() throws Error {
        if (head == null) throw new Error("LinkedList is empty");  // Throw error if the list is empty

        head = head.next;                                          // Move the head to the next node
        size--;                                                    // Reduce the size of the list
    }


    /**
     * Method to delete a node at a specific index in the LinkedList
     * Time Complexity -> O(N) (due to traversal to the index)
     * Space Complexity -> O(1)
     */
    void delete(int index) throws Error {
        if (index == 0) {  // If deleting the first node, call deleteAtHead
            deleteAtHead();
            return;
        }

        // Check if the index is out of bounds
        if (index >= size || index < 0) throw new Error("Invalid Index");

        Node currentNode = head;  // Start at the head

        // Traverse the list to the node before the index
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        // If deleting the last node, update the tail
        if (currentNode.next == tail) tail = currentNode;

        // Remove the node at the index by skipping over it
        currentNode.next = currentNode.next.next;

        size--;  // Reduce the size of the list
    }

    /**
     * Method to print the LinkedList values
     * Time Complexity -> O(N)
     * Space Complexity -> O(1)
     */
    void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node currentNode = head;  // Start at the head

        while (currentNode != null) {  // Traverse the list and print each value
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.next;  // Move to the next node
        }
        System.out.println("null");  // Newline after printing the list
    }

    /**
     * Method to display the size of the LinkedList
     * Time Complexity -> O(1) (but O(N) if the size is not tracked, and we need to traverse the list)
     * Space Complexity -> O(1)
     */
    void size() {
        System.out.println("Current size of the list: " + size);  // Print the size of the list
    }
}

// Main class to demonstrate LinkedList operations
public class LinkedList_Implementation {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();  // Create a new LinkedList

        // Display the initial size (should be 0)
        list.size();

        // Insert values at the tail of the list
        list.insertAtTail(10);
        list.insertAtTail(20);

        // Display the list and its size
        list.display();
        list.size();

        // Insert another value at the tail
        list.insertAtTail(30);

        // Display the list and its size
        list.display();
        list.size();

        // Insert a value at the head
        list.insertAtHead(0);
        list.display();
        list.size();

        // Insert a value at index 2
        list.insert(2, 50);
        list.display();
        list.size();

        // Get and print the value at index 2
        System.out.println(list.get(2));

        // Update the value at index 2
        list.set(2, 100);

        // Display the updated list and its size
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