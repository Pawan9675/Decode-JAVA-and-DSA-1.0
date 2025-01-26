/**
 * TREEMAP IN JAVA
 * =================
 * A TreeMap is a part of Java's `java.util` package.
 * It implements the `Map` interface and is backed by a **Red-Black Tree**.
 * A TreeMap stores key-value pairs in a **sorted order** (based on natural ordering of keys or a comparator).
 * 
 * Key Features:
 * --------------
 * 1. **Sorted Order**: Keys are stored in ascending order (according to their natural ordering or a custom comparator).
 * 2. **Unique Keys**: Keys must be unique, and duplicate keys will overwrite the existing value.
 * 3. **No Null Keys**: TreeMap does not allow null keys.
 * 4. **Performance**: Operations like `put`, `get`, and `remove` have O(log n) time complexity.
 */

package Week_16_HashMap_And_HashSet;

import java.util.TreeMap;
import java.util.Map;

public class BasicsOfTreeMap {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> map = new TreeMap<>();

        /**
         * 1. Adding Elements
         * -------------------
         * - Use the `put(key, value)` method to add key-value pairs to the TreeMap.
         * - If the key already exists, its value is updated.
         * - Time Complexity: O(log n)
         */
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);

        System.out.println("TreeMap after adding elements: " + map);
        // Output: TreeMap after adding elements: {A=1, B=2, C=3, D=4, E=5, F=6}

        /**
         * 2. Checking Keys and Values
         * ----------------------------
         * - `containsKey(key)`: Checks if a key exists in the map.
         * - `containsValue(value)`: Checks if a value exists in the map.
         * - Time Complexity: O(log n)
         */
        System.out.println("Does the map contain key 'A'? " + map.containsKey("A"));  // Output: true
        System.out.println("Does the map contain key 'Z'? " + map.containsKey("Z"));  // Output: false

        System.out.println("Does the map contain value 1? " + map.containsValue(1));  // Output: true
        System.out.println("Does the map contain value 10? " + map.containsValue(10)); // Output: false

        /**
         * 3. Updating Values
         * -------------------
         * - Adding a new key-value pair is done using `put(key, value)`.
         * - If the key already exists, its value is updated with the new value.
         */
        map.put("G", 7); // Adding a new pair
        System.out.println("TreeMap after adding 'G': " + map);
        // Output: TreeMap after adding 'G': {A=1, B=2, C=3, D=4, E=5, F=6, G=7}

        map.put("A", 0); // Updating the value of an existing key
        System.out.println("TreeMap after updating 'A': " + map);
        // Output: TreeMap after updating 'A': {A=0, B=2, C=3, D=4, E=5, F=6, G=7}

        /**
         * 4. Getting the Size of the Map
         * -------------------------------
         * - Use `size()` to get the number of key-value pairs in the map.
         * - Time Complexity: O(1)
         */
        System.out.println("Size of the TreeMap: " + map.size());
        // Output: Size of the TreeMap: 7

        /**
         * 5. Removing Elements
         * ---------------------
         * - Use `remove(key)` to remove a key-value pair.
         * - Removing a non-existent key has no effect and throws no error.
         * - `remove(key, value)` removes the pair only if the value matches.
         * - Time Complexity: O(log n)
         */
        map.remove("A"); // Removes the key "A" and its value
        System.out.println("TreeMap after removing 'A': " + map);
        // Output: TreeMap after removing 'A': {B=2, C=3, D=4, E=5, F=6, G=7}

        map.remove("Z"); // Attempt to remove a non-existent key
        System.out.println("TreeMap after trying to remove 'Z': " + map);
        // Output: TreeMap after trying to remove 'Z': {B=2, C=3, D=4, E=5, F=6, G=7}

        map.remove("C", 5); // Key exists, but value doesn't match
        System.out.println("After trying to remove 'C' with incorrect value: " + map);
        // Output: TreeMap after trying to remove 'C' with incorrect value: {B=2, C=3, D=4, E=5, F=6, G=7}

        map.remove("C", 3); // Correct key-value pair
        System.out.println("After removing 'C' with correct value: " + map);
        // Output: TreeMap after removing 'C' with correct value: {B=2, D=4, E=5, F=6, G=7}

        /**
         * 6. Accessing Values
         * --------------------
         * - Use `get(key)` to retrieve the value associated with a key.
         * - If the key does not exist, `null` is returned.
         * - Time Complexity: O(log n)
         */
        System.out.println("Value of key 'B': " + map.get("B"));  // Output: 2
        System.out.println("Value of key 'Z': " + map.get("Z"));  // Output: null

        /**
         * 7. Iterating Over the Map
         * --------------------------
         * - Iterate over keys, values, or key-value pairs using:
         *   - `keySet()`: Returns a set of all keys.
         *   - `values()`: Returns a collection of all values.
         *   - `entrySet()`: Returns a set of all key-value pairs.
         */

        // Iterating over keys and accessing their values
        System.out.print("Iterating over keys: ");
        for (String key : map.keySet()) {
            System.out.print(key + ": " + map.get(key) + " ");
        }
        System.out.println();
        // Output: Iterating over keys: B: 2 D: 4 E: 5 F: 6 G: 7

        // Iterating over values
        System.out.print("Iterating over values: ");
        for (int value : map.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
        // Output: Iterating over values: 2 4 5 6 7

        // Iterating over key-value pairs
        System.out.println("Iterating over key-value pairs: ");
        for (var pair : map.entrySet()) {
            System.out.println(pair);
        }
        // Output:
        // B=2
        // D=4
        // E=5
        // F=6
        // G=7

        System.out.println("Key-Value Pairs in TreeMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        // Output:
        // B = 2
        // D = 4
        // E = 5
        // F = 6
        // G = 7

        /**
         * 8. Replacing values
         * -----------------
         * - Use `replace(key, newValue)` to update the value for a specific key.
         * - Use `replace(key, oldValue, newValue)` to update the value only if the current value matches `oldValue`.
         */

        // Replace the value of an existing key
        map.replace("B", 20);
        System.out.println("After replacing value of 'B': " + map);
        // Output: {B=20, D=4, E=5, F=6, G=7}

        // Attempt to replace with incorrect current value (no change)
        boolean replaced = map.replace("D", 5, 30); // Incorrect oldValue, no update
        System.out.println("After attempting to replace 'D' with incorrect oldValue: " + map);
        System.out.println("Was the value replaced? " + replaced); // Output: false
        // Output: {B=20, D=4, E=5, F=6, G=7}

        // Replace with correct current value
        replaced = map.replace("D", 4, 30); // Correct oldValue, value is updated
        System.out.println("After replacing 'D' with correct oldValue: " + map);
        System.out.println("Was the value replaced? " + replaced); // Output: true
        // Output: {B=20, D=30, E=5, F=6, G=7}

        // Replace a non-existent key (no effect)
        map.replace("Z", 50);
        System.out.println("After trying to replace non-existent key 'Z': " + map);
        // Output: {B=20, D=30, E=5, F=6, G=7}

        /**
         * 9. Navigating with TreeMap
         * -------------------------
         * TreeMap also supports various navigation methods like:
         * - `firstKey()`: Retrieves the first (lowest) key.
         * - `lastKey()`: Retrieves the last (highest) key.
         * - `higherKey(key)`: Retrieves the least key greater than the specified key.
         * - `lowerKey(key)`: Retrieves the greatest key less than the specified key.
         */

        System.out.println("First Key: " + map.firstKey());  // Output: B
        System.out.println("Last Key: " + map.lastKey());    // Output: G
        System.out.println("Higher than 'C': " + map.higherKey("C")); // Output: D
        System.out.println("Lower than 'F': " + map.lowerKey("F")); // Output: E

        /**
         * 10. Clearing the TreeMap
         * ------------------------
         * - `clear()` removes all key-value pairs from the TreeMap.
         */
        map.clear();
        System.out.println("TreeMap after clearing: " + map);
        // Output: {}
    }
}
