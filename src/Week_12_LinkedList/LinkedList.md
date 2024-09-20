### Limitations of Arrays:

1. **Fixed Size:** Cannot change size after allocation.
2. **Wasted Space:** Over/underestimation leads to wasted or insufficient memory.
3. **Insertion:** Middle insertions require shifting (O(n)).
4. **Deletion:** Deleting requires shifting, causing inefficiency (O(n)).
5. **Search:** Unsorted search takes O(n).
6. **Memory Requirement:** Needs contiguous memory, causing fragmentation.
7. **No Resizing:** Cannot dynamically resize, leading to overhead.
8. **Limited Operations:** Lacks high-level operations like sorting.

### How does ArrayList Work?
- An ArrayList works by dynamically resizing itself. When it runs out of space, it creates a new array, typically double the original size, copies the existing elements into the new array, and then adds the new element. This allows flexibility, but resizing can be slower.


### Advantages of LinkedList over an Array:

1. **Dynamic Size:** Grows and shrinks as needed.
2. **Fast Insertion/Deletion:** O(1) time for adding/removing nodes.
3. **Non-contiguous Memory:** No need for continuous memory allocation.
4. **No Wasted Space:** Minimizes unused memory.
5. **Supports Complex Structures:** Easily forms stacks, queues, etc.


### Limitations of LinkedList:
1. **Slower Access:** `get()` is O(N) in LinkedLists vs O(1) in Arrays.
2. **Slower Modification:** `set()` is O(N) in LinkedLists vs O(1) in Arrays.
3. **Higher Memory Use:** Extra space for pointers in LinkedLists.
4. **Poor Cache Performance:** LinkedLists lack continuous memory, unlike Arrays.
5. **No Random Access:** Indexing in LinkedLists is slower.
6. **Pointer Overhead:** Each node has an extra pointer, increasing memory use.