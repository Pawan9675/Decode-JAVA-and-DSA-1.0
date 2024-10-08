### Definition: 
- Recursion is a programming technique where a function calls itself with different parameters and includes a base case to terminate the infinite loop.
- It involves solving a bigger problem by breaking it down into smaller sub-problems, solving each sub-problem recursively.
- In summary, recursion is a function calling itself to solve its sub-problems.


### The Recursion Spell:
1. Identify the smaller sub-problem ➡ Let recursion solve it (have full faith).
2. Self work ➡ Do your work.
3. Identify the base case ➡ Smallest problem for which the answer is obvious.
    ```
   // Base Case
   // Recursive work
   // Self work
    ```

### Syntax:
    methodName (N parameters)
    {
        if (haltCondition) {
            return result
        }
        return methodName (N parameters)
    }

### Time and Space Complexity:
 ```
      T.C. = Number of calls * Time Taken in 1 call
      S.C. = Number of max stack frames at any instances * Max space occupied in 1 stack frame
 ```
 
### ASCII
   - American Standard Code for Information Interchange.
   - Standard data encoding format for communication between computers.
   - Assigns standard values to letters, numerals, characters etc.
   - a-z: 97 to 122.
   - A-Z: 65 to 90.
   - 0-9: 48 to 57.

### Character to Integer Conversion
```
   char ch = '3';
   int ch_val = ch - '0';
```