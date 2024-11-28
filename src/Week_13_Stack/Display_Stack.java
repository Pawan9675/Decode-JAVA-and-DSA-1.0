package Week_13_Stack;

import java.util.Stack;

// Time Complexity: O(n) for each display method.
// Space Complexity: Depends on the method used.
public class Display_Stack {
    public static void main(String[] args) {
        // Creating and initializing a stack of integers.
        Stack<Integer> st = new Stack<>();

        // Pushing elements into the stack.
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        // Method 1: Display stack using the built-in toString() method.
        // Time Complexity: O(n), Space Complexity: O(n) (to store the string representation)
        System.out.println("Displaying stack using toString() method:");
        System.out.println(st);  // Output: [1, 2, 3, 4, 5, 6]
        System.out.println();

        // Method 2: Display stack using a for-each loop (does not modify the stack).
        // Time Complexity: O(n), Space Complexity: O(1)
        System.out.println("Displaying stack using for-each loop:");
        for (int num : st) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        // Method 3: Display stack manually by popping each element (modifies the stack).
        // Time Complexity: O(n), Space Complexity: O(1)
        System.out.println("Displaying stack manually by popping each element:");
        while (!st.isEmpty()) {
            System.out.println(st.pop());  // Removes and prints the top element of the stack.
        }
        System.out.println();

        // Reinitialize stack to demonstrate additional methods.
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        // Method 4: Display stack using a traditional for loop with the size() method.
        // Time Complexity: O(n), Space Complexity: O(1)
        System.out.println("Displaying stack using traditional for loop:");
        for (int i = 0; i < st.size(); i++) {
            System.out.print(st.get(i) + " ");  // Accessing elements without modifying the stack.
        }
        System.out.println();
        System.out.println();

        // Method 5: Display stack by converting it to an array.
        // Time Complexity: O(n), Space Complexity: O(n) (for storing array elements)
        System.out.println("Displaying stack by converting to an array:");
        Object[] stackArray = st.toArray();  // Converts the stack to an array.
        for (Object obj : stackArray) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
