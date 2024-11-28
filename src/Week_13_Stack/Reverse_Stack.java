package Week_13_Stack;

import java.util.Stack;

// Time Complexity: O(n) -> Due to popping and pushing elements in each iteration.
// Space Complexity: O(n) -> A new stack is used to store the reversed elements.

public class Reverse_Stack {
    public static void main(String[] args) {
        // Creating and initializing the original stack with Integer values.
        Stack<Integer> original_st = new Stack<>();

        // Pushing elements into the original stack.
        original_st.push(10);
        original_st.push(20);
        original_st.push(30);
        original_st.push(40);
        original_st.push(50);
        original_st.push(60);
        System.out.println("Original Stack -> " + original_st);
        System.out.println();

        // Creating a new temporary stack to store the reversed elements.
        Stack<Integer> reverse_st = new Stack<>();

        // Reversing the original stack by popping all elements and pushing them into the temporary stack.
        // This operation reverses the order of elements.
        while (!original_st.isEmpty()) {  // Continue until the original stack is empty.
            reverse_st.push(original_st.pop());  // Pop from the original stack and push into the reverse stack.
        }

        // Displaying the state of the reversed stack.
        System.out.println("Reverse Stack -> " + reverse_st);  // Output: [60, 50, 40, 30, 20, 10]
    }
}