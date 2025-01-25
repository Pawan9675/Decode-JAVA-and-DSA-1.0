/**
 * HASHMAP IN JAVA
 * =================
 * A HashMap is a part of Java's `java.util` package.
 * It is used to store key-value pairs, where each key maps to a specific value.
 * 
 * Key Features:
 * --------------
 * 1. **Key-Value Pairs**: HashMap stores data in the form of key-value pairs.
 * 2. **Unique Keys**: Keys must be unique; duplicate keys overwrite the existing value.
 * 3. **Unordered Collection**: The order of insertion is not maintained.
 * 4. **Fast Performance**: Operations like `put`, `get`, and `remove` have O(1) average time complexity.
 */

package Week_16_HashMap_And_HashSet;

import java.util.HashMap;
import java.util.Map;

public class BasicsOfHashMap {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        /**
         * 1. Adding Elements
         * -------------------
         * - Use the `put(key, value)` method to add key-value pairs to the HashMap.
         * - If the key already exists, its value is updated.
         * - Time Complexity: O(1)
         */
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);

        System.out.println("HashMap after adding elements: " + map);
        // Output: HashMap after adding elements: {A=1, B=2, C=3, D=4, E=5, F=6}

        /**
         * 2. Checking Keys and Values
         * ----------------------------
         * - `containsKey(key)`: Checks if a key exists in the map.
         * - `containsValue(value)`: Checks if a value exists in the map.
         * - Time Complexity: O(1)
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
        System.out.println("HashMap after adding 'G': " + map);
        // Output: HashMap after adding 'G': {A=1, B=2, C=3, D=4, E=5, F=6, G=7}

        map.put("A", 0); // Updating the value of an existing key
        System.out.println("HashMap after updating 'A': " + map);
        // Output: HashMap after updating 'A': {A=0, B=2, C=3, D=4, E=5, F=6, G=7}

        /**
         * 4. Getting the Size of the Map
         * -------------------------------
         * - Use `size()` to get the number of key-value pairs in the map.
         * - Time Complexity: O(1)
         */
        System.out.println("Size of the HashMap: " + map.size());
        // Output: Size of the HashMap: 7

        /**
         * 5. Removing Elements
         * ---------------------
         * - Use `remove(key)` to remove a key-value pair.
         * - Removing a non-existent key does nothing (no error is thrown).
         * - `remove(key, value)` removes the pair only if the value matches.
         * - Time Complexity: O(1)
         */
        map.remove("A"); // Removes the key "A" and its value
        System.out.println("HashMap after removing 'A': " + map);
        // Output: HashMap after removing 'A': {B=2, C=3, D=4, E=5, F=6, G=7}

        map.remove("Z"); // Attempt to remove a non-existent key
        System.out.println("HashMap after trying to remove 'Z': " + map);
        // Output: HashMap after trying to remove 'Z': {B=2, C=3, D=4, E=5, F=6, G=7}

        map.remove("C", 5); // Key exists, but value doesn't match
        System.out.println("After trying to remove 'C' with incorrect value: " + map);
        // Output: {B=2, C=3, D=4, E=5, F=6, G=7}

        map.remove("C", 3); // Correct key-value pair
        System.out.println("After removing 'C' with correct value: " + map);
        // Output: {B=2, D=4, E=5, F=6, G=7}

        /**
         * 6. Accessing Values
         * --------------------
         * - Use `get(key)` to retrieve the value associated with a key.
         * - If the key does not exist, `null` is returned.
         * - Time Complexity: O(1)
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

        System.out.println("Key-Value Pairs in HashMap:");
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
         * 9. Clearing the HashMap
         * ------------------------
         * - `clear()` removes all key-value pairs from the HashMap.
         */
        map.clear();
        System.out.println("HashMap after clearing: " + map);
        // Output: {}
    }
}
