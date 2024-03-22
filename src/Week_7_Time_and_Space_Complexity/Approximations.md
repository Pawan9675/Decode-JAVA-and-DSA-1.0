### Important Approximation for Time and Space Complexity
- Powers of 'n' are important.
- Highest power of n is considered.
  - Example: 
    1. O(n^3 + 100n^2 - 5n) ~ O(n^3)
    2. O(n^1/3 + n^1/2) ~ O(n^1/2)
- If there are other variables like m, they are separate.
  - Example:
    1. O(n + 10m) ~ O(n + m)
- Constant time complexity ~ O(1)