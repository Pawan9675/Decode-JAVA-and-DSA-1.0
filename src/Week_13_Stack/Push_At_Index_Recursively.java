package Week_13_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Push_At_Index_Recursively {
    // Recursive function to push an element at a specific index in the stack
    public static void pushAtIndex(Stack<Integer> stack, int value, int index) {
        // Base case: If the index is 0 or the stack is empty, push the value and return
        if (index == 0 || stack.isEmpty()) {
            stack.push(value);
            return;
        }

        // Pop the top element and recursively call the function
        int top = stack.pop();
        pushAtIndex(stack, value, index - 1);

        // Push the top element back after the value is inserted at the index
        stack.push(top);
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

        // Asking the user for input: element to insert and index
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to insert: ");
        int newElement = sc.nextInt();

        System.out.print("Enter the index at which to insert the element: ");
        int index = sc.nextInt();

        // Check if the index is valid
        if (index < 0 || index > original_st.size()) {
            System.out.println("Invalid index! Index must be between 0 and " + original_st.size());
        } else {
            // Insert the element at the specified index
            pushAtIndex(original_st, newElement, index);

            // Display the new stack after inserting the element
            System.out.println("New Stack -> " + original_st);
        }
    }
}
