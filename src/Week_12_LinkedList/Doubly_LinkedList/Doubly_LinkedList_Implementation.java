package Week_12_LinkedList.Doubly_LinkedList;

class dNode{
    int val;
    dNode next;
    dNode prev;

    dNode(int val){
        this.val = val;
    }
}
// Definition of a Doubly Linked List (DLL)
class DoublyLinkedList {
    private dNode head;  // Points to the first node in the list
    private dNode tail;  // Points to the last node in the list
    private int size;    // Tracks the number of elements in the list

    /**
     * Method to insert a new value at the tail (end) of the Doubly Linked List.
     * Time Complexity -> O(1) if tail is directly accessible.
     * Space Complexity -> O(1)
     */
    void insertAtTail(int val) {
        dNode newNode = new dNode(val);  // Create a new node with the provided value

        if (size == 0) {                 // If the list is empty, both head and tail will point to newNode
            head = tail = newNode;
        } else {
            tail.next = newNode;         // Point the current tail's next to newNode
            newNode.prev = tail;         // Set newNode's previous to current tail
            tail = newNode;              // Update the tail to the new node
        }
        size++;                          // Increase the size of the list
    }

    /**
     * Method to insert a new value at the head (start) of the Doubly Linked List.
     * Time Complexity -> O(1)
     * Space Complexity -> O(1)
     */
    void insertAtHead(int val) {
        dNode newNode = new dNode(val);  // Create a new node with the provided value

        if (size == 0) {                 // If the list is empty, both head and tail will point to newNode
            head = tail = newNode;
        } else {
            newNode.next = head;         // Link the newNode to the current head
            head.prev = newNode;         // Link current head's previous to newNode
            head = newNode;              // Update head to the new node
        }
        size++;                          // Increase the size of the list
    }

    /**
     * Method to insert a new value at a specific index in the Doubly Linked List.
     * Time Complexity -> O(N) (due to traversal to the specified index)
     * Space Complexity -> O(1)
     */
    void insert(int index, int value) {
        if (index == 0) {                 // Insert at the head if index is 0
            insertAtHead(value);
            return;
        }
        if (index == size) {              // Insert at the tail if index equals size
            insertAtTail(value);
            return;
        }
        if (index > size || index < 0) {  // Check for invalid index
            System.out.println("Invalid Input!!!");
            return;
        }

        dNode newNode = new dNode(value); // Create a new node
        dNode temp = head;

        for (int i = 0; i < index - 1; i++) {  // Traverse to node at position (index - 1)
            temp = temp.next;
        }

        // Insert newNode between temp and temp.next
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        size++;  // Increase the size of the list
    }

    /**
     * Method to delete the node at the head of the Doubly Linked List.
     * Time Complexity -> O(1)
     * Space Complexity -> O(1)
     */
    void deleteAtHead() throws Error {
        if (size == 0) throw new Error("LinkedList is empty");  // Base Case: empty list
        head = head.next;                // Move head to the next node
        if (head != null) head.prev = null; // Disconnect the new head's previous link
        else tail = null;                // If list becomes empty, set tail to null
        size--;                          // Decrease size
    }

    /**
     * Method to delete the node at the tail of the Doubly Linked List.
     * Time Complexity -> O(1)
     * Space Complexity -> O(1)
     */
    void deleteAtTail() throws Error {
        if (size == 0) throw new Error("LinkedList is empty");  // Base Case: empty list
        tail = tail.prev;                // Move tail to the previous node
        if (tail != null) tail.next = null; // Disconnect the new tail's next link
        else head = null;                // If list becomes empty, set head to null
        size--;                          // Decrease size
    }

    /**
     * Method to delete a node at a specified index in the Doubly Linked List.
     * Time Complexity -> O(N) (due to traversal to the index)
     * Space Complexity -> O(1)
     */
    void delete(int index) throws Error {
        if (index == 0) {               // If deleting at the head
            deleteAtHead();
            return;
        }
        if (index == size - 1) {        // If deleting at the tail
            deleteAtTail();
            return;
        }
        if (index >= size || index < 0) throw new Error("Invalid Index");  // Out-of-bounds check

        dNode temp = head;
        for (int i = 0; i < index; i++) {  // Traverse to the specified index
            temp = temp.next;
        }

        // Remove the node at the index by adjusting links
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;                           // Decrease size
    }

    /**
     * Method to get the value at a specific index in the Doubly Linked List.
     * Time Complexity -> O(N)
     * Space Complexity -> O(1)
     */
    int get(int index) throws Error {
        if (index == size - 1) return tail.val; // Return tail value if index is the last element
        if (index >= size || index < 0) throw new Error("Invalid Index");  // Out-of-bounds check

        dNode temp = head;               // Start at head
        for (int i = 0; i < index; i++) { // Traverse to the specified index
            temp = temp.next;
        }
        return temp.val;                 // Return the value
    }

    /**
     * Method to set the value at a specific index in the Doubly Linked List.
     * Time Complexity -> O(N)
     * Space Complexity -> O(1)
     */
    void set(int index, int value) throws Error {
        if (index == size - 1) tail.val = value; // Update tail value if index is last
        if (index >= size || index < 0) throw new Error("Invalid Index"); // Out-of-bounds check

        dNode temp = head;
        for (int i = 0; i < index; i++) {  // Traverse to the specified index
            temp = temp.next;
        }
        temp.val = value;                 // Set the new value
    }

    // Check if the list is empty
    boolean isEmpty() { // Time Complexity -> O(1), Space Complexity -> O(1)
        return size == 0;
    }

    // Clear the entire list
    void clear() { // Time Complexity -> O(1), Space Complexity -> O(1)
        head = tail = null;
        size = 0;
    }

    // Check if the list contains a specific value
    boolean contains(int value) { // Time Complexity -> O(N), Space Complexity -> O(1)
        dNode temp = head;
        while (temp != null) {
            if (temp.val == value) return true;
            temp = temp.next;
        }
        return false;
    }

    // Reverse the doubly linked list
    void reverse() { // Time Complexity -> O(N), Space Complexity -> O(1)
        dNode current = head;
        dNode temp = null;
        tail = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) head = temp.prev;
    }

    /**
     * Method to display all values in the Doubly Linked List.
     * Time Complexity -> O(N)
     * Space Complexity -> O(1)
     */
    void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("null"); // End of the list
    }
}

// Main class to test DoublyLinkedList operations
public class Doubly_LinkedList_Implementation {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.display();          // Displaying an empty list
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();          // 10 <-> 20 <-> 30 <-> null
        list.insertAtHead(5);
        list.display();          // 5 <-> 10 <-> 20 <-> 30 <-> null
        list.insert(2, 15);
        list.display();          // 5 <-> 10 <-> 15 <-> 20 <-> 30 <-> null
        list.deleteAtHead();
        list.display();          // 10 <-> 15 <-> 20 <-> 30 <-> null
        list.deleteAtTail();
        list.display();          // 10 <-> 15 <-> 20 <-> null
        System.out.println(list.get(1)); // Get value at index 1: 15
        list.set(1, 25);
        list.display();          // 10 <-> 25 <-> 20 <-> null
        list.delete(1);
        list.display();         // 10 <-> 20 <-> null
        System.out.println("List contains 20: " + list.contains(20)); // Should print true
        System.out.println("List is empty: " + list.isEmpty()); // Should print false
        // Reverse the list
        list.reverse();
        list.display();        // 20 <-> 10 <-> null

        // Clear the list
        list.clear();
        System.out.println("List is empty after clearing: " + list.isEmpty()); // Should print true

    }
}
