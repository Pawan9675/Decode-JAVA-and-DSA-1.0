package Week_13_Stack;

import java.util.Stack;

public class Reverse_Stack_Recursively {

    // Method to display the stack using recursion
    // Pops elements, displays them after recursive calls, and then restores the stack
    public static void displayRecursively(Stack<Integer> st) {
        // Base condition: If the stack is empty, stop recursion
        if (st.isEmpty()) return;

        // Pop the top element and store it
        int top = st.pop();

        // Recursive call to display the remaining elements
        displayRecursively(st);

        // Print the current top element
        System.out.print(top + " ");

        // Push the popped element back to restore the stack's original state
        st.push(top);
    }

    // Recursive function to push an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> stack, int value) {
        // Base case: If the stack is empty, push the value and return
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        // Pop the top element and recursively call the function
        int top = stack.pop();
        pushAtBottom(stack, value);

        // Push the top element back after the value is inserted at the bottom
        stack.push(top);
    }

    // Recursive function to reverse the stack
    public static void reverse(Stack<Integer> stack) {
        // Base case: If the stack has only one element, return
        if (stack.size() == 1) return;

        // Pop the top element and store it
        int top = stack.pop();

        // Recursive call to reverse the remaining stack
        reverse(stack);

        // Push the popped element at the bottom of the stack
        pushAtBottom(stack, top);
    }

    public static void main(String[] args) {
        // Creating and initializing a stack of integers
        Stack<Integer> original_st = new Stack<>();
        original_st.push(1);
        original_st.push(2);
        original_st.push(3);
        original_st.push(4);
        original_st.push(5);
        original_st.push(6);

        // Display the original stack
        System.out.println("Original Stack -> " + original_st);
        System.out.println();

        // Reverse the stack
        reverse(original_st);

        // Display the reversed stack
        System.out.println("Reversed Stack -> " + original_st);
    }
}
