package Week_13_Stack;

import java.util.Scanner;
import java.util.Stack;

// Time Complexity: O(n) - Traversing the stack to reach the index and restoring elements.
// Space Complexity: O(n) - Temporary stack to hold elements.
public class Push_Element_At_Any_Index {
    public static void main(String[] args) {
        Stack<Integer> original_st = new Stack<>();
        Stack<Integer> temp_st = new Stack<>();

        // Initializing the stack with some values.
        original_st.push(10);
        original_st.push(20);
        original_st.push(30);
        original_st.push(40);
        original_st.push(50);
        original_st.push(60);

        System.out.println("Original Stack -> " + original_st);
        System.out.println();

        // Asking the user for input: which element to insert and at which index.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to insert: ");
        int newElement = sc.nextInt();
        System.out.print("Enter the index at which to insert the element: ");
        int index = sc.nextInt();

        // Check if the index is valid.
        if (index < 0 || index > original_st.size()) {
            System.out.println("Invalid index! The index must be between 0 and " + original_st.size());
            return;
        }

        // Step 1: Remove elements from the original stack and push them into the temporary stack
        // until we reach the desired index.
        while (original_st.size() != index) {
            temp_st.push(original_st.pop());
        }

        // Step 2: Push the new element at the specified index.
        original_st.push(newElement);

        // Step 3: Restore the elements from the temporary stack back into the original stack.
        while (!temp_st.isEmpty()) {
            original_st.push(temp_st.pop());
        }

        // Display the new stack after inserting the element.
        System.out.println("New Stack -> " + original_st);
    }
}
