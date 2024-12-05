package Week_14_Queue;

// Importing Queue and LinkedList classes from Java's built-in library to use queue-related functions.
import java.util.Queue;
import java.util.LinkedList;

public class Basics_Queue {
    public static void main(String[] args) {
        // Queue<Integer> que = new Queue<>(); 
        // This is incorrect because Queue is an interface and cannot be instantiated directly.
        // Instead, we use a class that implements Queue, such as LinkedList.

        // Declaration and instantiation of a Queue object that stores Integer values.
        // Declaration: Queue<Integer> que
        // Instantiation: new LinkedList<>()


        Queue<Integer> que = new LinkedList<>();  // Creates an empty queue for Integer values.

        // Checks if the queue is empty and prints true if it is, otherwise false.
        System.out.println("Is the queue empty? " + que.isEmpty());  // Output: true

        // Prints the current state of the queue, which is empty at this point.
        System.out.println("Current queue: " + que);  // Output: []

        // Adding (inserting) elements into the queue using add().
        que.add(1);  // Adds the element 1 to the queue. Queue now: [1]
        que.add(2);  // Adds the element 2 to the queue. Queue now: [1, 2]
        que.add(3);  // Adds the element 3 to the queue. Queue now: [1, 2, 3]
        que.add(4);  // Adds the element 4 to the queue. Queue now: [1, 2, 3, 4]
        que.add(5);  // Adds the element 5 to the queue. Queue now: [1, 2, 3, 4, 5]

        // Prints the current state of the queue after adding elements.
        System.out.println("Queue after adding elements: " + que);  // Output: [1, 2, 3, 4, 5]

        // Adds an element using offer() method.
        que.offer(6);  // Adds the element 6 to the queue. Queue now: [1, 2, 3, 4, 5, 6]
        System.out.println("Queue after offer(6): " + que);  // Output: [1, 2, 3, 4, 5, 6]

        // Removes and returns the head element using remove().
        System.out.println("Element removed using remove(): " + que.remove());  // Output: 1
        System.out.println("Queue after remove(): " + que);  // Output: [2, 3, 4, 5, 6]

        // Removes and returns the head element using poll().
        System.out.println("Element removed using poll(): " + que.poll());  // Output: 2
        System.out.println("Queue after poll(): " + que);  // Output: [3, 4, 5, 6]

        // Returns the head element without removing it using peek().
        System.out.println("Head of the queue using peek(): " + que.peek());  // Output: 3

        // Prints the current size of the queue.
        System.out.println("Size of the queue: " + que.size());  // Output: 4

        // Checks if the queue contains a specific element.
        System.out.println("Does the queue contain 5? " + que.contains(5));  // Output: true

        // Clears all elements from the queue.
        que.clear();  // Removes all elements, making the queue empty.
        System.out.println("Is the queue empty after clear()? " + que.isEmpty());  // Output: true
    }
}

/*
==========================
Summary of Queue Functions:
==========================

1. add(E element):
   - Inserts the specified element into the queue.
   - Throws an IllegalStateException if the queue is full (for bounded queues).
   - Example: que.add(10); // Adds 10 to the queue

2. offer(E element):
   - Inserts the specified element into the queue.
   - Returns false if the queue is full (for bounded queues), but does not throw an exception.
   - Example: que.offer(10); // Adds 10 to the queue

3. remove():
   - Removes and returns the head element of the queue.
   - Throws a NoSuchElementException if the queue is empty.
   - Example: int head = que.remove(); // Removes and stores the head element

4. poll():
   - Removes and returns the head element of the queue.
   - Returns null if the queue is empty instead of throwing an exception.
   - Example: int head = que.poll(); // Removes and stores the head element

5. peek():
   - Returns the head element of the queue without removing it.
   - Returns null if the queue is empty.
   - Example: int head = que.peek(); // Returns the head element

6. isEmpty():
   - Checks if the queue is empty.
   - Returns true if the queue contains no elements, false otherwise.
   - Example: boolean empty = que.isEmpty(); // Checks if the queue is empty

7. size():
   - Returns the number of elements in the queue.
   - Example: int size = que.size(); // Returns the size of the queue

8. contains(Object o):
   - Checks if the queue contains the specified object.
   - Returns true if the object is found, false otherwise.
   - Example: boolean found = que.contains(5); // Checks if 5 is in the queue

9. clear():
   - Removes all elements from the queue, making it empty.
   - Example: que.clear(); // Clears the queue

==============================
Additional Queue Operations:
==============================

- element():
  * Returns the head of the queue without removing it.
  * Throws a NoSuchElementException if the queue is empty.
  * Example: int head = que.element(); // Returns the head element

- toArray():
  * Converts the queue to an array.
  * Example: Object[] arr = que.toArray(); // Converts queue to array
*/

/*
=======================================
Difference between poll() and remove():
=======================================
1. `remove()`:
   - Removes and returns the head of the queue.
   - Throws a `NoSuchElementException` if the queue is empty.
   - Use it when you are sure the queue is not empty.
   - Example: int head = que.remove();

2. `poll()`:
   - Removes and returns the head of the queue.
   - Returns `null` if the queue is empty, instead of throwing an exception.
   - Use it when you want to handle an empty queue gracefully.
   - Example: int head = que.poll();

=======================================
Difference between add() and offer():
=======================================
1. `add()`:
   - Inserts the specified element into the queue.
   - Throws an `IllegalStateException` if the queue is full (for bounded queues).
   - Example: que.add(10);

2. `offer()`:
   - Inserts the specified element into the queue.
   - Returns `false` if the queue is full, but does not throw an exception.
   - Example: que.offer(10);

*/ 
