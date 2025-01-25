package Week_16_HashMap_And_HashSet;
/**
 * HASHSET IN JAVA
 * =================
 * A HashSet is a part of Java's `java.util` package.
 * It implements the `Set` interface, backed by a HashMap.
 * 
 * Key Features:
 * --------------
 * 1. **Unique Elements**: Duplicate elements are not allowed.
 * 2. **Unordered Collection**: Elements are stored in random order (no indexing).
 * 3. **Fast Performance**: Operations like add, remove, and contains have O(1) time complexity.
 */

import java.util.HashSet;

public class BasicsOfHashSet {
    public static void main(String[] args) {
        /**
         * CREATING A HASHSET
         * -------------------
         * Syntax: HashSet<Type> set = new HashSet<>();
         */
        HashSet<Integer> set = new HashSet<>();

        /**
         * 1. Adding Elements
         * -------------------
         * - Use the `add(element)` method to add elements to the HashSet.
         * - Duplicate elements are ignored.
         * - Note: Elements are stored in random order.
         * - Time Complexity: O(1)
         */
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(-5);
        set.add(100);
        set.add(10); // Duplicate element, will be ignored

        System.out.println("HashSet after adding elements: " + set);
        // Output (order may vary): [100, 20, -5, 30, 10]

        /**
         * 2. Checking for an Element
         * ---------------------------
         * - Use the `contains(element)` method to check if an element exists.
         * - Returns `true` if the element is found, otherwise `false`.
         * - Time Complexity: O(1)
         */
        System.out.println("Does the set contain 20? " + set.contains(20));  // Output: true
        System.out.println("Does the set contain 500? " + set.contains(500)); // Output: false

        /**
         * 3. Size of the HashSet
         * -----------------------
         * - Use the `size()` method to get the number of elements in the HashSet.
         * - Time Complexity: O(1)
         */
        System.out.println("Size of the HashSet: " + set.size());
        // Output: Size of the HashSet: 5

        /**
         * 4. Removing Elements
         * ---------------------
         * - Use the `remove(element)` method to remove a specific element.
         * - Removing a non-existent element has no effect and throws no error.
         * - Time Complexity: O(1)
         */
        set.remove(30); // Removes 30
        System.out.println("HashSet after removing 30: " + set);
        // Output (order may vary): [100, 20, -5, 10]

        set.remove(500); // Attempt to remove a non-existent element
        System.out.println("HashSet after trying to remove 500: " + set);
        // Output: No change, as 500 is not present

        /**
         * 5. Converting HashSet to an Array
         * ----------------------------------
         * - Use the `toArray()` method to convert the HashSet to an array.
         */
        Object[] array = set.toArray();
        System.out.print("HashSet as an array: ");
        for (Object num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Example Output: HashSet as an array: 100 20 -5 10

        /**
         * 6. Iterating Over a HashSet
         * ----------------------------
         * - Use a for-each loop to iterate through the HashSet.
         * - HashSet does not support indexing, so traditional for-loops cannot be used.
         */
        System.out.print("Iterating over the HashSet: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Example Output: Iterating over the HashSet: 100 20 -5 10

        /**
         * 7. Clearing the HashSet
         * ------------------------
         * - Use the `clear()` method to remove all elements from the HashSet.
         */
        set.clear();
        System.out.println("HashSet after clearing: " + set);
        // Output: HashSet after clearing: []

        /**
         * 8. Handling Duplicate Elements
         * -------------------------------
         * - Adding duplicate elements to a HashSet has no effect; it only stores unique elements.
         */
        set.add(50);
        set.add(50); // Duplicate element, will be ignored
        System.out.println("HashSet after adding duplicate elements: " + set);
        // Output: HashSet after adding duplicate elements: [50]

        set.remove(50); // Removes the single occurrence of 50
        System.out.println("HashSet after removing the element: " + set);
        // Output: HashSet after removing the element: []
    }
}
