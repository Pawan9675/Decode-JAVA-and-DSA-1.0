package Week_12_LinkedList.Singly_LinkedList;

import java.util.Scanner;

// Main class with method to find the nth node from the end
public class Nth_From_End {

    // Definition for singly-linked list node
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to find the nth node from the end of the linked list
    public static ListNode findNthFromEnd(ListNode head, int n) {
        // Initialize two pointers both starting at the head of the list
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        // Move the fastPointer n steps ahead
        for (int i = 0; i < n; i++) {
            // If n is larger than the list's length, return null (or handle this case)
            if (fastPointer == null) return null;
            fastPointer = fastPointer.next;
        }

        // Now move both fastPointer and slowPointer one step at a time
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        // slowPointer is now pointing to the nth node from the end
        return slowPointer;
    }

    // Function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Function to create a linked list from user input
    public static ListNode createLinkedList(int numNodes, Scanner sc) {
        if (numNodes <= 0) return null;

        System.out.print("Enter value for node 1: ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;

        for (int i = 2; i <= numNodes; i++) {
            System.out.print("Enter value for node " + i + ": ");
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        return head;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of nodes
        System.out.print("Enter the number of nodes in the linked list: ");
        int numNodes = sc.nextInt();

        // Create the linked list with user input
        ListNode head = createLinkedList(numNodes, sc);

        System.out.println("Original linked list:");
        printList(head);

        // Input for n (which node from the end)
        System.out.print("Enter the value of n (to find nth node from end): ");
        int n = sc.nextInt();

        // Find the nth node from the end
        ListNode result = findNthFromEnd(head, n);

        // Display the result
        if (result != null) {
            System.out.println("The " + n + "th node from the end has the value: " + result.val);
        } else {
            System.out.println("The linked list has fewer than " + n + " nodes.");
        }

        sc.close();
    }
}
