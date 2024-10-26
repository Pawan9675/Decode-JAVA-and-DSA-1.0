package Week_12_LinkedList.Doubly_LinkedList;

public class Check_Palindrome_In_Doubly_LinkedList {

    // Method to check if the values in the doubly linked list form a palindrome
    private static boolean isPalindrome(DoublyLinkedListNode head, DoublyLinkedListNode tail) {
        // Traverse from both ends until the pointers meet or cross
        while (head != null && tail != null && head != tail && head.next != tail) {
            // If values at the two ends are not the same, it's not a palindrome
            if (head.value != tail.value) return false;

            // Move head forward and tail backward
            head = head.next;
            tail = tail.previous;
        }
        return true;  // If all values matched, it's a palindrome
    }

    public static void main(String[] args) {
        // Creating nodes with values
        DoublyLinkedListNode node1 = new DoublyLinkedListNode(10);
        DoublyLinkedListNode node2 = new DoublyLinkedListNode(20);
        DoublyLinkedListNode node3 = new DoublyLinkedListNode(30);
        DoublyLinkedListNode node4 = new DoublyLinkedListNode(20);
        DoublyLinkedListNode node5 = new DoublyLinkedListNode(10);

        // Linking nodes to form the doubly linked list
        node1.next = node2; node2.previous = node1;
        node2.next = node3; node3.previous = node2;
        node3.next = node4; node4.previous = node3;
        node4.next = node5; node5.previous = node4;

        // Checking if the linked list is a palindrome
        System.out.println("Is the doubly linked list a palindrome? " + isPalindrome(node1, node5));
    }
}
