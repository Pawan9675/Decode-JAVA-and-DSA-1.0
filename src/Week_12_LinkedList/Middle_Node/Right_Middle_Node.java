package Week_12_LinkedList.Middle_Node;

public class Right_Middle_Node {
    public ListNode middleNode(ListNode head) {

        /*
        Approach to find the right middle node in case of an even number of nodes:

        - We use the slow and fast pointer approach.
        - Both the slow and fast pointers are initialized at the head.
        - The slow pointer moves one step at a time, while the fast pointer moves two steps at a time.
        - When the fast pointer reaches the end, the slow pointer will be at the right middle node.

        Time Complexity: O(n) where n is the length of the LinkedList.
        Space Complexity: O(1) since no extra space is used apart from two pointers.
        */

        // Edge case: If the list is empty or has only one node, return the head as the middle
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize both slow and fast pointers at the head
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list with fast and slow pointers
        // When fast reaches the end (or the last node), slow will be at the right middle node
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow-pointer by one node
            fast = fast.next.next;   // Move fast-pointer by two nodes
        }

        // When the fast-pointer reaches the end, the slow-pointer will be at the right middle
        return slow;  // Return the right middle node
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
        Right_Middle_Node solution = new Right_Middle_Node();
        ListNode middleNode = solution.middleNode(head);

        // Print the middle node
        System.out.println("Right Middle Node: " + middleNode.val);
    }
}
