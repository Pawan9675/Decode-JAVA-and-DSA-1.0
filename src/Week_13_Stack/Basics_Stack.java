package Week_13_Stack;

// Importing the Stack class from Java's built-in library to use its stack-related functions.
import java.util.Stack;

public class Basics_Stack {
    public static void main(String[] args) {
        // Declaration and instantiation of a Stack object that stores Integer values.
        // Declaration: Stack<Integer> st
        // Instantiation: new Stack<>()
        Stack<Integer> st = new Stack<>();  // Creates an empty stack for Integer values.

        // Checks if the stack is empty and prints true if it is, otherwise false.
        // The isEmpty() method returns true if the stack contains no elements.
        System.out.println(st.isEmpty());  // Output: true, because the stack is empty initially.

        // Prints the current state of the stack, which is empty at this point.
        System.out.println(st);  // Output: [] (empty stack)

        // Pushing (inserting) elements into the stack.
        st.push(1);  // Adds the element 1 to the top of the stack. Stack now: [1]
        st.push(2);  // Adds the element 2 to the top of the stack. Stack now: [1, 2]
        st.push(3);  // Adds the element 3 to the top of the stack. Stack now: [1, 2, 3]
        st.push(4);  // Adds the element 4 to the top of the stack. Stack now: [1, 2, 3, 4]
        st.push(5);  // Adds the element 5 to the top of the stack. Stack now: [1, 2, 3, 4, 5]

        // Prints the current state of the stack after inserting elements.
        System.out.println(st);  // Output: [1, 2, 3, 4, 5]

        // Prints the current size of the stack, which is the number of elements in the stack.
        System.out.println(st.size());  // Output: 5

        // Removes and returns the top element from the stack (last inserted element).
        System.out.println(st.pop());  // Output: 5 (removes and returns 5), Stack now: [1, 2, 3, 4]

        // Returns the current top element of the stack without removing it.
        System.out.println(st.peek());  // Output: 4 (top element after popping 5)

        // Prints the current state of the stack after performing pop and peek operations.
        System.out.println(st);  // Output: [1, 2, 3, 4]

        // Checks if the stack is empty and prints false because the stack still contains elements.
        System.out.println(st.isEmpty());  // Output: false

        // Additional Stack Methods Demonstrated:

        // Search for an element in the stack and return its 1-based position from the top.
        System.out.println(st.search(3));  // Output: 2 (3 is the 2nd element from the top)

        // Adding more elements to demonstrate other functions.
        st.push(6);  // Adds 6 to the stack. Stack now: [1, 2, 3, 4, 6]
        st.push(7);  // Adds 7 to the stack. Stack now: [1, 2, 3, 4, 6, 7]

        // Check if the stack contains a specific element using contains() method.
        System.out.println(st.contains(6));  // Output: true (6 is present in the stack)

        // Clear all elements from the stack using the clear() method.
        st.clear();  // Removes all elements, making the stack empty.
        System.out.println(st.isEmpty());  // Output: true (stack is now empty)
    }
}

/*
==========================
Summary of Stack Functions:
==========================

1. push(E item):
   - Adds the specified item to the top of the stack.
   - Example: st.push(10); // Adds 10 to the stack

2. pop():
   - Removes and returns the top element from the stack.
   - Example: int top = st.pop(); // Removes and stores the top element

3. peek():
   - Returns the top element of the stack without removing it.
   - Example: int top = st.peek(); // Returns the top element

4. isEmpty():
   - Checks if the stack is empty.
   - Returns true if the stack contains no elements, false otherwise.
   - Example: boolean empty = st.isEmpty(); // Checks if the stack is empty

5. size():
   - Returns the number of elements in the stack.
   - Example: int size = st.size(); // Returns the size of the stack

6. search(Object o):
   - Returns the 1-based position of the object from the top of the stack.
   - Returns -1 if the object is not found.
   - Example: int position = st.search(3); // Returns position of 3

7. contains(Object o):
   - Checks if the stack contains the specified object.
   - Returns true if the object is found, false otherwise.
   - Example: boolean found = st.contains(6); // Checks if 6 is in the stack

8. clear():
   - Removes all elements from the stack, making it empty.
   - Example: st.clear(); // Clears the stack

==============================
Additional Stack Operations:
==============================

- isFull():
  * This function is not available in Java's Stack class because stacks are dynamic and grow as needed.

*/
