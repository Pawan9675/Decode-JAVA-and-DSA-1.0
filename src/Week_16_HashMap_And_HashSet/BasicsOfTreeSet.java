/**
 * TREESET IN JAVA
 * =================
 * A TreeSet is part of Java's `java.util` package.
 * It implements the `Set` interface and is backed by a TreeMap.
 * A TreeSet stores elements in **sorted** order, as defined by their natural ordering or a provided comparator.
 * 
 * Key Features:
 * --------------
 * 1. **Sorted Elements**: Elements are stored in ascending order.
 * 2. **Unique Elements**: Duplicate elements are not allowed.
 * 3. **No Nulls**: TreeSet does not allow null elements.
 * 4. **Fast Performance**: Operations like add, remove, and contains have O(log n) time complexity.
 * 5. **Navigable Set**: TreeSet supports additional navigation methods (e.g., `first()`, `last()`, `higher()`, etc.).
 */

package Week_16_HashMap_And_HashSet;

import java.util.TreeSet;

public class BasicsOfTreeSet {
    public static void main(String[] args) {
        /**
         * CREATING A TREESET
         * -------------------
         * Syntax: TreeSet<Type> set = new TreeSet<>();
         * TreeSet stores elements in **sorted order** (ascending by default).
         */
        TreeSet<Integer> set = new TreeSet<>();

        /**
         * 1. Adding Elements
         * -------------------
         * - Use the `add(element)` method to add elements to the TreeSet.
         * - Duplicate elements are ignored.
         * - Elements are automatically sorted in ascending order.
         * - Time Complexity: O(log n)
         */
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(-5);
        set.add(100);
        set.add(10); // Duplicate element, will be ignored

        System.out.println("TreeSet after adding elements: " + set);
        // Output: TreeSet after adding elements: [-5, 10, 20, 30, 100]

        /**
         * 2. Checking for an Element
         * ---------------------------
         * - Use the `contains(element)` method to check if an element exists.
         * - Returns `true` if the element is found, otherwise `false`.
         * - Time Complexity: O(log n)
         */
        System.out.println("Does the set contain 20? " + set.contains(20));  // Output: true
        System.out.println("Does the set contain 500? " + set.contains(500)); // Output: false

        /**
         * 3. Size of the TreeSet
         * ----------------------
         * - Use `size()` to get the number of elements in the TreeSet.
         * - Time Complexity: O(1)
         */
        System.out.println("Size of the TreeSet: " + set.size());
        // Output: Size of the TreeSet: 5

        /**
         * 4. Removing Elements
         * ---------------------
         * - Use the `remove(element)` method to remove a specific element.
         * - Removing a non-existent element has no effect and throws no error.
         * - Time Complexity: O(log n)
         */
        set.remove(30); // Removes 30
        System.out.println("TreeSet after removing 30: " + set);
        // Output: TreeSet after removing 30: [-5, 10, 20, 100]

        set.remove(500); // Attempt to remove a non-existent element
        System.out.println("TreeSet after trying to remove 500: " + set);
        // Output: No change, as 500 is not present

        /**
         * 5. Converting TreeSet to an Array
         * ----------------------------------
         * - Use the `toArray()` method to convert the TreeSet to an array.
         */
        Object[] array = set.toArray();
        System.out.print("TreeSet as an array: ");
        for (Object num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Example Output: TreeSet as an array: -5 10 20 100

        /**
         * 6. Iterating Over a TreeSet
         * ---------------------------
         * - Use a for-each loop to iterate through the TreeSet.
         * - TreeSet does not support indexing, so traditional for-loops cannot be used.
         */
        System.out.print("Iterating over the TreeSet: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Example Output: Iterating over the TreeSet: -5 10 20 100

        /**
         * 7. Clearing the TreeSet
         * ------------------------
         * - Use the `clear()` method to remove all elements from the TreeSet.
         */
        set.clear();
        System.out.println("TreeSet after clearing: " + set);
        // Output: TreeSet after clearing: []

        /**
         * 8. Handling Duplicate Elements
         * -------------------------------
         * - Adding duplicate elements to a TreeSet has no effect; it only stores unique elements.
         */
        set.add(50);
        set.add(50); // Duplicate element, will be ignored
        System.out.println("TreeSet after adding duplicate elements: " + set);
        // Output: TreeSet after adding duplicate elements: [50]

        set.remove(50); // Removes the single occurrence of 50
        System.out.println("TreeSet after removing the element: " + set);
        // Output: TreeSet after removing the element: []

        /**
         * 9. Navigational Methods
         * ------------------------
         * TreeSet also provides several navigational methods to access elements.
         */
        
        // `first()` - Returns the first (lowest) element in the set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println("First element: " + set.first()); // Output: 10
        
        // `last()` - Returns the last (highest) element in the set
        System.out.println("Last element: " + set.last());  // Output: 40
        
        // `higher(element)` - Returns the least element greater than the specified element
        System.out.println("Element higher than 20: " + set.higher(20)); // Output: 30
        
        // `lower(element)` - Returns the greatest element less than the specified element
        System.out.println("Element lower than 30: " + set.lower(30)); // Output: 20
        
        // `ceiling(element)` - Returns the least element greater than or equal to the specified element
        System.out.println("Ceiling of 25: " + set.ceiling(25)); // Output: 30
        
        // `floor(element)` - Returns the greatest element less than or equal to the specified element
        System.out.println("Floor of 35: " + set.floor(35)); // Output: 30
        
        /**
         * 10. Subsets and Ranges
         * ----------------------
         * - TreeSet allows you to obtain subsets within a range of elements.
         */
        
        // `headSet(toElement)` - Returns all elements strictly less than `toElement`
        System.out.println("HeadSet (less than 30): " + set.headSet(30));  // Output: [10, 20]
        
        // `tailSet(fromElement)` - Returns all elements greater than or equal to `fromElement`
        System.out.println("TailSet (greater than or equal to 30): " + set.tailSet(30)); // Output: [30, 40]
        
        // `subSet(fromElement, toElement)` - Returns a view of the set between the two elements
        System.out.println("SubSet (from 20 to 40): " + set.subSet(20, 40));  // Output: [20, 30]
    }
}
