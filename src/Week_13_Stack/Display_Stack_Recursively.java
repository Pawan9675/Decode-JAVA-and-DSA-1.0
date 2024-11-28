package Week_13_Stack;

import java.util.Stack;

// Program to display a stack in reverse and original order using recursion.
// Time Complexity: O(n) for both recursive methods.
// Space Complexity: O(n) due to the call stack space used by recursion.
public class Display_Stack_Recursively {

    // Method to display the stack in reverse order using recursion.
    // It pops elements from the stack, prints them, and then pushes them back after recursive calls.
    public static void displayReverseRecursively(Stack<Integer> st) {
        // Base condition: If the stack is empty, stop the recursion.
        if (st.isEmpty()) return;

        // Pop the top element and store it.
        int top = st.pop();
        System.out.print(top + " ");  // Print the top element.

        // Recursive call to process the remaining elements.
        displayReverseRecursively(st);

        // Push the popped element back to restore the stack to its original state.
        st.push(top);
    }

    // Method to display the stack in original order using recursion.
    // It pops elements, prints them after recursive calls, and then pushes them back.
    public static void displayRecursively(Stack<Integer> st) {
        // Base condition: If the stack is empty, stop the recursion.
        if (st.isEmpty()) return;

        // Pop the top element and store it.
        int top = st.pop();

        // Recursive call to process the remaining elements.
        displayRecursively(st);

        System.out.print(top + " ");  // Print the element after the recursive call.
        
        // Push the popped element back to restore the stack to its original state.
        st.push(top);
    }

    public static void main(String[] args) {
        // Creating and initializing a stack of integers.
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        // Display the stack in reverse order using recursion.
        System.out.println("Displaying stack in reverse order:");
        displayReverseRecursively(st);
        System.out.println();

        // Display the stack in its original order using recursion.
        System.out.println("Displaying stack in original order:");
        displayRecursively(st);
    }
}
