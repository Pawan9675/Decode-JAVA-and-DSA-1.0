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

### Syntax
    methodName (N parameters)
    {
        if (haltCondition) {
            return result
        }
        return methodName (N parameters)
    }