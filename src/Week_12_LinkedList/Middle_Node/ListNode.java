package Week_12_LinkedList.Middle_Node;


// Class for the nodes of the singly linked list
class ListNode {
    int val;          // Value stored in the node
    ListNode next;    // Pointer to the next node in the list

    // Constructor to create an empty node
    ListNode() {}

    // Constructor to create a node with a value
    ListNode(int val) {
        this.val = val;
    }

    // Constructor to create a node with a value and a next pointer
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
