package Week_13_Stack;

// Implementation of a Stack using a LinkedList.
public class Implementation_Of_Stack_Using_LinkedList {

    // Node class representing each element in the linked list.
    public static class Node {
        int val;   // Value of the node.
        Node next; // Reference to the next node.

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Stack class implementing stack operations using a linked list.
    public static class Stack {
        Node head = null; // Reference to the top of the stack.
        int size = 0;     // Tracks the size of the stack.

        // Pushes an element onto the stack.
        // Time Complexity: O(1) - Constant time to add a node at the head.
        // Space Complexity: O(1) - Constant space for adding a node.
        void push(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }

        // Removes and returns the top element from the stack.
        // Time Complexity: O(1) - Constant time to remove the top node.
        // Space Complexity: O(1) - Constant space for removing a node.
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.val;
            head = head.next;
            size--;
            return top;
        }

        // Returns the top element of the stack without removing it.
        // Time Complexity: O(1) - Constant time to access the top element.
        // Space Complexity: O(1) - Constant space for accessing the node.
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        // Checks if the stack is empty.
        // Time Complexity: O(1) - Constant time to check.
        // Space Complexity: O(1) - Constant space for checking.
        boolean isEmpty() {
            return size == 0;
        }

        // Returns the current size of the stack.
        // Time Complexity: O(1) - Constant time to retrieve the size.
        // Space Complexity: O(1) - Constant space for returning the size.
        int size() {
            return size;
        }

        // Displays the elements of the stack in reverse order (as a stack is LIFO).
        // Time Complexity: O(n) - Linear time to traverse the stack.
        // Space Complexity: O(n) - Recursive space for the call stack.
        void display() {
            System.out.print("Stack elements: ");
            displayRecursive(head);
            System.out.println("null");
        }

        // Helper function to display elements recursively.
        void displayRecursive(Node temp) {
            if (temp == null) return;
            displayRecursive(temp.next);
            System.out.print(temp.val + " -> ");
        }

        // Checks if the stack contains a specific element.
        // Time Complexity: O(n) - Linear time to search through the stack.
        // Space Complexity: O(1) - Constant space for searching.
        boolean contains(int val) {
            Node current = head;
            while (current != null) {
                if (current.val == val) return true;
                current = current.next;
            }
            return false;
        }

        // Searches for the index (0-based) of an element in the stack.
        // Time Complexity: O(n) - Linear time to search through the stack.
        // Space Complexity: O(1) - Constant space for searching.
        int search(int val) {
            Node current = head;
            int index = 0;
            while (current != null) {
                if (current.val == val) return index;
                current = current.next;
                index++;
            }
            return -1; // Element not found.
        }

        // Clears the stack by setting head to null and size to 0.
        // Time Complexity: O(1) - Constant time to clear the stack.
        // Space Complexity: O(1) - Constant space for clearing.
        void clear() {
            head = null;
            size = 0;
            System.out.println("Stack has been cleared.");
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        // Push elements to the stack.
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display(); // Output: Stack elements: [10, 20, 30, 40, 50]

        // Checking size and top element.
        System.out.println("Size of stack: " + st.size()); // Output: Size of stack: 5
        System.out.println("Top element: " + st.peek());   // Output: Top element: 50

        // Popping elements.
        System.out.println("Popped element: " + st.pop()); // Output: Popped element: 50
        System.out.println("Popped element: " + st.pop()); // Output: Popped element: 40

        // Checking current size.
        System.out.println("Current size: " + st.size()); // Output: Current size: 3
        st.display(); // Output: Stack elements: [10, 20, 30]

        // Popping remaining elements.
        System.out.println("Popped element: " + st.pop()); // Output: Popped element: 30
        System.out.println("Popped element: " + st.pop()); // Output: Popped element: 20
        System.out.println("Popped element: " + st.pop()); // Output: Popped element: 10

        // Checking current size after emptying the stack.
        System.out.println("Current size after emptying: " + st.size()); // Output: Current size after emptying: 0
        System.out.println("Is stack empty? " + st.isEmpty()); // Output: Is stack empty? true

        // Test contains and search methods.
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Does stack contain 20? " + st.contains(20));  // Output: true
        System.out.println("Does stack contain 50? " + st.contains(50));  // Output: false

        System.out.println("Position of 20: " + st.search(20));  // Output: Position of 20: 2
        System.out.println("Position of 50: " + st.search(50));  // Output: -1

        // Clear the stack.
        st.clear();  // Output: Stack has been cleared.
        System.out.println("Is stack empty? " + st.isEmpty());  // Output: true
        st.display();  // Output: Stack elements: []
    }
}
