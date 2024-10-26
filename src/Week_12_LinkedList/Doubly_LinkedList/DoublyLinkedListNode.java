package Week_12_LinkedList.Doubly_LinkedList;

// Class representing a node in a doubly linked list
class DoublyLinkedListNode {
    int value;                    // Value of the node
    DoublyLinkedListNode next;    // Pointer to the next node
    DoublyLinkedListNode previous; // Pointer to the previous node

    // Constructor to initialize the node with a value
    DoublyLinkedListNode(int value) {
        this.value = value;
        this.next = null;         // Default behavior, 'next' is null
        this.previous = null;     // Default behavior, 'previous' is null
    }
}
