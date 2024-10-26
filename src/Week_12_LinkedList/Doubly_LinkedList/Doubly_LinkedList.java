package Week_12_LinkedList.Doubly_LinkedList;

public class Doubly_LinkedList {

    // Method to print the linked list from head to tail
    public static void printFromHead(DoublyLinkedListNode head) {
        DoublyLinkedListNode currentNode = head;  // Start from the head node

        // Traverse the list until the end (null) and print each node's value
        while (currentNode != null) {
            System.out.print(currentNode.value + " <-> ");
            currentNode = currentNode.next;  // Move to the next node in the list
        }
        System.out.println("null");  // Mark the end of the list
    }

    // Method to print the linked list in reverse order (tail to head)
    public static void printFromTail(DoublyLinkedListNode tail) {
        DoublyLinkedListNode currentNode = tail;  // Start from the tail node

        // Traverse the list backwards until reaching null
        while (currentNode != null) {
            System.out.print(currentNode.value + " <-> ");
            currentNode = currentNode.previous;  // Move to the previous node
        }
        System.out.println("null");  // Mark the start of the list
    }

    // Method to print the linked list when a random node is given
    public static void displayFromRandomNode(DoublyLinkedListNode node) {
        DoublyLinkedListNode currentNode = node;

        // Move to the head of the list to ensure we print from the start
        while (currentNode.previous != null) {
            currentNode = currentNode.previous;
        }

        // Now that we're at the head, print the list from head to tail
        printFromHead(currentNode);
    }

    public static void main(String[] args) {

        // Creating individual nodes with values
        DoublyLinkedListNode node1 = new DoublyLinkedListNode(10);   // Head node with value 10
        DoublyLinkedListNode node2 = new DoublyLinkedListNode(20);   // Node with value 20
        DoublyLinkedListNode node3 = new DoublyLinkedListNode(30);   // Node with value 30
        DoublyLinkedListNode node4 = new DoublyLinkedListNode(40);   // Tail node with value 40

        // Connecting nodes to form a doubly linked list
        node1.next = node2; node2.previous = node1;  // Link node1 to node2 and vice versa
        node2.next = node3; node3.previous = node2;  // Link node2 to node3 and vice versa
        node3.next = node4; node4.previous = node3;  // Link node3 to node4 and vice versa

        // Display the linked list starting from the head
        System.out.println("Doubly Linked List (head to tail):");
        printFromHead(node1);

        // Display the linked list in reverse, starting from the tail
        System.out.println("\nDoubly Linked List (tail to head):");
        printFromTail(node4);

        // Display the linked list starting from a random node (node3)
        System.out.println("\nDisplay from a random node (starting at node3):");
        displayFromRandomNode(node3);
    }
}
