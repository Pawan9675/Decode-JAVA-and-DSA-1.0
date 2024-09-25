package Week_12_LinkedList.Middle_Node;

public class Left_Middle_Node {
    public ListNode middleNode(ListNode head) {

        /*
        Modified Approach to find the left middle node in case of an even number of nodes:

        - We still use the slow and fast pointer approach.
        - The fast pointer is initialized at head.next (instead of head) to ensure that the slow pointer
          stops at the left middle node when there is an even number of nodes.

        Time Complexity: O(n) where n is the length of the LinkedList.
        Space Complexity: O(1) since no extra space is used apart from two pointers.
        */

        // Edge case: If the list is empty or has only one node, return the head as the middle
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize slow at the head and fast at head.next
        ListNode slow = head;
        ListNode fast = head.next;

        // Traverse the list with fast and slow pointers
        // Now fast is starting from the second node, so when it reaches the end,
        // slow will be at the first (left) middle node in case of an even number of nodes
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer by one node
            fast = fast.next.next;   // Move fast pointer by two nodes
        }

        // When fast pointer reaches the end, slow pointer will be at the first middle
        return slow;  // Return the left middle node
    }

    // Method to print the linked list from a given node
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create the linked list: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        head.next.next.next.next.next = new ListNode(60);

        // Print the linked list
        System.out.print("Linked List: ");
        printList(head);

        // Find the middle node
        Left_Middle_Node solution = new Left_Middle_Node();
        ListNode middleNode = solution.middleNode(head);

        // Print the middle node
        System.out.println("Left Middle Node: " + middleNode.val);
    }
}
