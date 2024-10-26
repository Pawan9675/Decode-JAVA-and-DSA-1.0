package Week_12_LinkedList.Singly_LinkedList;

// Class representing a node in the linked list
class Node {
    int val;        // Value of the node
    Node next;      // Pointer to the next node

    // Constructor to initialize the node with a value
    Node(int val) {
        this.val = val;
        this.next = null;       // 'next' is initialized to null (default behavior, so it's optional to write this)
    }
}

public class LinkedList_Introduction {
    public static void printLinkedList(Node head) {
        Node temp = head;  // Start from the head node

        // Traverse the linked list until reaching the end (null)
        while (temp != null) {
            System.out.print(temp.val + " -> ");  // Print the current node's value
            temp = temp.next;  // Move to the next node in the list
        }

        // Optional: A commented-out alternative loop using an index-based approach
    /*
    * for (int i = 0; i < 5; i++) {
    *     System.out.println(temp.val);  // Print the current node's value
    *     temp = temp.next;              // Move to the next node
    * }
    */
    }


    // Method to print the linked list recursively
    public static void printLinkedListRecursively(Node head){
        if (head == null) return;   // Base case: If the node is null, stop recursion

        System.out.print(head.val + " -> ");   // Print the current node's value
        printLinkedListRecursively(head.next); // Recursive call for the next node
    }

    // Method to print the linked list recursively in reverse order
    public static void printLinkedListRecursively_Reverse(Node head){
        if (head == null) return;   // Base case: If the node is null, stop recursion

        printLinkedListRecursively_Reverse(head.next); // Recursive call for the next node
        System.out.print(head.val + " -> ");   // Print the value after returning from recursion
    }

    public static void main(String[] args) {

        // Creating individual nodes for the linked list
        Node a = new Node(10);      // 'a' is the head node with value 10
        Node b = new Node(20);      // Node with value 20
        Node c = new Node(30);      // Node with value 30
        Node d = new Node(40);      // Node with value 40
        Node e = new Node(50);      // Node with value 50

        // Displaying initial values and references of nodes
        System.out.println("Node A reference: " + a);  // Example: Node@6acbcfc0 (memory reference)
        System.out.println("Value of A: " + a.val);    // Output: 10
        System.out.println("Node B reference: " + b);  // Example: Node@5f184fc6 (memory reference)
        System.out.println("Value of B: " + b.val);    // Output: 20

        // Initially, 'next' is null because nodes are not yet linked
        System.out.println("Next of A: " + a.next);    // Output: null
        System.out.println("Next of B: " + b.next);    // Output: null

        // Linking nodes to form the linked list

        /*
        * a.next = b;                     // Link node 'a' to node 'b'
        * System.out.println(b);          // Prints reference of node 'b', (Node@5f184fc6), (same)
        * System.out.println(a.next);     // Prints reference of the node that 'a' points to (node 'b'), (Node@5f184fc6), (same)
                                        // both should match
         */


        // Now we link all the nodes together to form a chain (linked list)
        a.next = b;         // a -> b, Link A to B
        b.next = c;         // a -> b -> c, Link B to C
        c.next = d;         // a -> b -> c -> d, Link C to D
        d.next = e;         // a -> b -> c -> d -> e, Link D to E


        // Printing the values in the linked list, starting from node 'a'
        System.out.println("Linked List Values:");
        System.out.println(a.val);                      // Output: 10
        System.out.println(a.next.val);                 // Output: 20
        System.out.println(a.next.next.val);            // Output: 30
        System.out.println(a.next.next.next.val);       // Output: 40
        System.out.println(a.next.next.next.next.val);  // Output: 50

        // Using a temporary pointer to traverse the linked list
        Node temp = a;  // Start from the head node 'a'
        System.out.println("Temp pointer starts at: " + temp.val);  // Output: 10

        temp = temp.next;  // Move temp to the next node
        System.out.println("Temp pointer moved to: " + temp.val);   // Output: 20

        // Printing the linked list using an iterative approach
        System.out.println("\nPrinting using iteration:");
        printLinkedList(a);

        // Printing the linked list using a recursive approach
        System.out.println("\n\nPrinting using recursion:");
        printLinkedListRecursively(a);

        // Printing the linked list in reverse order using recursion
        System.out.println("\n\nPrinting the LinkedList in reverse order:");
        printLinkedListRecursively_Reverse(a);

    }
}
