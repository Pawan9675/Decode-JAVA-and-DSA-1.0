package Week_14_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeSTL {
    public static void main(String[] args) {
        // Deque is a double-ended queue that allows insertion and deletion of elements from both ends.
        // It can be implemented using ArrayDeque or LinkedList.
        // Declaration and instantiation of a Deque object that stores Integer values.

        Deque<Integer> dq = new LinkedList<>();  // Creates an empty deque for Integer values.

        // Checks if the deque is empty and prints true if it is, otherwise false.
        System.out.println("Is the deque empty? " + dq.isEmpty());  // Output: true

        // Prints the current state of the deque, which is empty at this point.
        System.out.println("Current deque: " + dq);  // Output: []

        // Adding (inserting) elements into the deque using addFirst(), addLast(), and add().
        dq.addFirst(1);  // Adds the element 1 to the front of the deque. Deque now: [1]
        dq.addLast(2);  // Adds the element 2 to the end of the deque. Deque now: [1, 2]
        dq.addFirst(3);  // Adds the element 3 to the front of the deque. Deque now: [3, 1, 2]
        dq.addLast(4);  // Adds the element 4 to the end of the deque. Deque now: [3, 1, 2, 4]
        dq.add(5);      // Adds the element 5 to the end of the deque. Deque now: [3, 1, 2, 4, 5]
        System.out.println("Deque after adding elements: " + dq);  // Output: [3, 1, 2, 4, 5]

        // Removing elements using removeFirstOccurrence() and removeLastOccurrence().
        dq.removeFirstOccurrence(1);  // Removes the first occurrence of 1. Deque now: [3, 2, 4, 5]
        System.out.println("Deque after removing first occurrence of 1: " + dq);  // Output: [3, 2, 4, 5]

        dq.removeLastOccurrence(5);  // Removes the last occurrence of 5. Deque now: [3, 2, 4]
        System.out.println("Deque after removing last occurrence of 5: " + dq);  // Output: [3, 2, 4]

        // Accessing the first and last elements using getFirst() and getLast().
        System.out.println("First element: " + dq.getFirst());  // Output: 3
        System.out.println("Last element: " + dq.getLast());    // Output: 4

        // Removing elements from the front and rear using removeFirst() and removeLast().
        System.out.println("Removed from front: " + dq.removeFirst());  // Output: 3
        System.out.println("Deque after removing first element: " + dq);  // Output: [2, 4]
        System.out.println("Removed from rear: " + dq.removeLast());    // Output: 4
        System.out.println("Deque after removing last element: " + dq);  // Output: [2]

        // Using the add() method to add an element to the rear of the deque (same as addLast()).
        dq.add(6);  // Adds the element 6 to the end of the deque. Deque now: [2, 6]
        System.out.println("Deque after add(6): " + dq);  // Output: [2, 6]

        // Using the remove() method to remove and return the first element (same as removeFirst()).
        System.out.println("Removed element using remove(): " + dq.remove());  // Output: 2
        System.out.println("Deque after remove(): " + dq);  // Output: [6]

        // Checks if the deque contains a specific element.
        System.out.println("Does the deque contain 6? " + dq.contains(6));  // Output: true
        System.out.println("Does the deque contain 5? " + dq.contains(5));  // Output: false

        // Gets the current size of the deque.
        System.out.println("Current size of deque: " + dq.size());  // Output: 1

        // Clears all elements from the deque.
        dq.clear();  // Removes all elements, making the deque empty.
        System.out.println("Deque after clear(): " + dq);  // Output: []
        System.out.println("Is the deque empty after clear()? " + dq.isEmpty());  // Output: true

        // Trying to get first and last elements from an empty deque to demonstrate exception handling.
        try {
            System.out.println("First element (empty deque): " + dq.getFirst());  // Throws NoSuchElementException
        } catch (Exception e) {
            System.out.println("Exception caught when accessing first element: " + e);
        }

        try {
            System.out.println("Last element (empty deque): " + dq.getLast());  // Throws NoSuchElementException
        } catch (Exception e) {
            System.out.println("Exception caught when accessing last element: " + e);
        }

        // Trying to remove elements from an empty deque to demonstrate exception handling.
        try {
            System.out.println("Removing from front (empty deque): " + dq.removeFirst());  // Throws NoSuchElementException
        } catch (Exception e) {
            System.out.println("Exception caught when removing from front: " + e);
        }

        try {
            System.out.println("Removing from rear (empty deque): " + dq.removeLast());  // Throws NoSuchElementException
        } catch (Exception e) {
            System.out.println("Exception caught when removing from rear: " + e);
        }
    }
}

/*
==========================
Summary of Deque Functions:
==========================

1. addFirst(E element):
   - Inserts the specified element at the front of the deque.
   - Example: dq.addFirst(10); // Adds 10 at the front of the deque

2. addLast(E element):
   - Inserts the specified element at the rear of the deque.
   - Example: dq.addLast(10); // Adds 10 at the rear of the deque

3. add(E element):
   - Adds the specified element at the rear of the deque. Same as addLast().
   - Example: dq.add(10); // Adds 10 at the rear of the deque

4. removeFirst():
   - Removes and returns the first element of the deque.
   - Throws NoSuchElementException if the deque is empty.
   - Example: dq.removeFirst(); // Removes and returns the first element

5. removeLast():
   - Removes and returns the last element of the deque.
   - Throws NoSuchElementException if the deque is empty.
   - Example: dq.removeLast(); // Removes and returns the last element

6. removeFirstOccurrence(Object o):
   - Removes the first occurrence of the specified element from the deque.
   - Example: dq.removeFirstOccurrence(10); // Removes first occurrence of 10

7. removeLastOccurrence(Object o):
   - Removes the last occurrence of the specified element from the deque.
   - Example: dq.removeLastOccurrence(10); // Removes last occurrence of 10

8. getFirst():
   - Returns the first element of the deque without removing it.
   - Throws NoSuchElementException if the deque is empty.
   - Example: dq.getFirst(); // Returns the first element without removing it

9. getLast():
   - Returns the last element of the deque without removing it.
   - Throws NoSuchElementException if the deque is empty.
   - Example: dq.getLast(); // Returns the last element without removing it

10. isEmpty():
    - Checks if the deque is empty.
    - Returns true if the deque is empty, false otherwise.
    - Example: dq.isEmpty(); // Checks if the deque is empty

11. size():
    - Returns the number of elements in the deque.
    - Example: dq.size(); // Returns the size of the deque

12. contains(Object o):
    - Checks if the deque contains the specified element.
    - Example: dq.contains(10); // Checks if 10 is in the deque

13. clear():
    - Removes all elements from the deque, making it empty.
    - Example: dq.clear(); // Clears the deque

14. remove():
    - Removes and returns the first element of the deque.
    - Throws NoSuchElementException if the deque is empty.
    - Example: dq.remove(); // Removes and returns the first element

*/
