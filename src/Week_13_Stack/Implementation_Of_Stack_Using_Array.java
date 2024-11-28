package Week_13_Stack;

public class Implementation_Of_Stack_Using_Array {

    public static class Stack {
        private int[] arr = new int[5];  // Array to hold stack elements.
        private int idx = 0;  // Tracks the top index of the stack.

        // Push function to add an element to the stack.
        // Time Complexity: O(1) - Constant time to add an element.
        // Space Complexity: O(1) - Constant space for pushing an element.
        void push(int val) {
            if (isFull()) { // Check if the stack is full before pushing.
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = val;
            idx++;
        }

        // Pop function to remove and return the top element.
        // Time Complexity: O(1) - Constant time to remove an element.
        // Space Complexity: O(1) - Constant space for popping an element.
        int pop() {
            if (isEmpty()) { // Check if the stack is empty before popping.
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = arr[idx - 1];
            idx--;
            return top;
        }

        // Peek function to view the top element without removing it.
        // Time Complexity: O(1) - Constant time to access the top element.
        // Space Complexity: O(1) - Constant space for accessing the top element.
        int peek() {
            if (isEmpty()) { // Check if the stack is empty before peeking.
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[idx - 1];
        }

        // Checks if the stack is full.
        // Time Complexity: O(1) - Constant time to check if the stack is full.
        // Space Complexity: O(1) - Constant space for checking the fullness.
        boolean isFull() {
            return idx == arr.length;
        }

        // Checks if the stack is empty.
        // Time Complexity: O(1) - Constant time to check if the stack is empty.
        // Space Complexity: O(1) - Constant space for checking emptiness.
        boolean isEmpty() {
            return idx == 0;
        }

        // Returns the current size of the stack.
        // Time Complexity: O(1) - Constant time to retrieve the size.
        // Space Complexity: O(1) - Constant space for retrieving the size.
        int size() {
            return idx;
        }

        // Displays the elements in the stack.
        // Time Complexity: O(n) - Linear time to display all elements.
        // Space Complexity: O(1) - Constant space for displaying elements.
        void display() {
            System.out.print("Stack elements: [");
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i]);
                if (i < idx - 1) System.out.print(", ");
            }
            System.out.println("]");
        }

        // Checks if an element is present in the stack.
        // Time Complexity: O(n) - Linear time to search through the stack.
        // Space Complexity: O(1) - Constant space for checking if an element exists.
        boolean contains(int val) {
            for (int i = 0; i < idx; i++) {
                if (arr[i] == val) return true;
            }
            return false;
        }

        // Searches for the position of an element in the stack.
        // Time Complexity: O(n) - Linear time to search for the element.
        // Space Complexity: O(1) - Constant space for searching.
        int search(int val) {
            for (int i = 0; i < idx; i++) {
                if (arr[i] == val) {
                    return i;  // Return the 0-based index.
                }
            }
            return -1;  // Return -1 if element is not found.
        }

        // Clears the stack by resetting the index.
        // Time Complexity: O(1) - Constant time to clear the stack.
        // Space Complexity: O(1) - Constant space for clearing the stack.
        void clear() {
            idx = 0;
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

        // Checking size and if the stack is full.
        System.out.println("Size of stack: " + st.size()); // Output: Size of stack: 5
        System.out.println("Is stack full? " + st.isFull()); // Output: Is stack full? true

        // Checking top element.
        System.out.println("Top element: " + st.peek()); // Output: Top element: 50

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

        st.clear();  // Clear the stack
        System.out.println("Is stack empty? " + st.isEmpty());  // Output: true
        st.display();  // Output: Stack elements: []
    }
}
