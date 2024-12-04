package Week_13_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Push_At_Bottom_Recursively {
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

        // Asking the user for input: which element to insert at the bottom
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to insert at the bottom: ");
        int newElement = sc.nextInt();

        // Insert the element at the bottom of the stack
        pushAtBottom(original_st, newElement);

        // Display the new stack after inserting the element
        System.out.println("New Stack -> " + original_st);
    }
}
