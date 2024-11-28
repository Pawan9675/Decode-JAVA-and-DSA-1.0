package Week_13_Stack;

import java.util.Stack;

// Time Complexity: O(n) + O(n) + O(n) (Printing the final stack) = O(n)
// Space Complexity: O(n) + O(n) = O(n) due to usage of two additional stacks.
public class Copy_Stack {
    public static void main(String[] args) {
        Stack<Integer> original_st = new Stack<>();
        Stack<Integer> temp_st = new Stack<>();
        Stack<Integer> final_st = new Stack<>();

        original_st.push(10);
        original_st.push(20);
        original_st.push(30);
        original_st.push(40);
        original_st.push(50);
        original_st.push(60);
        System.out.println("Original Stack -> " + original_st);
        System.out.println();

        // Step 1: Remove elements from the original stack and push them into the temporary stack.
        System.out.println("Step 1 : ");
        while (!original_st.isEmpty()) {
            temp_st.push(original_st.pop());
        }
        System.out.println("Original Stack -> " + original_st);
        System.out.println("Temporary Stack -> " + temp_st);
        System.out.println("Final Stack -> " + final_st);
        System.out.println();

        // Step 2: Remove elements from the temporary stack and push them into the final stack.
        System.out.println("Step 2 : ");
        while (!temp_st.isEmpty()) {
            final_st.push(temp_st.pop());
        }
        System.out.println("Original Stack -> " + original_st);
        System.out.println("Temporary Stack -> " + temp_st);
        System.out.println("Final Stack -> " + final_st);
        System.out.println();
    }
}
