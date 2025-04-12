# Modulo Operator
The modulo operator is a mathematical operation that returns the remainder of a division between two numbers. In programming, it is often represented by the symbol `%`. The modulo operator is commonly used in various applications, such as determining if a number is even or odd, cycling through a range of values, and implementing circular buffers.

## Important Formulas:
Let `a` and `b` be two integers and `a` and `b` are very large numbers.
1. `(a + b) % c = ((a % c) + (b % c)) % c`
2. `(a - b) % c = ((a % c) - (b % c) + c) % c`
3. `(a * b) % c = ((a % c) * (b % c)) % c`
4. `(a / b) % c = ((a % c) * (b^-1 % c)) % c` where `b^-1` is the modular multiplicative inverse of `b` modulo `c`.
5. `(a ^ b) % c = ((a % c) ^ (b % (c-1))) % c` where `^` is the exponentiation operator.
6. `(a % b) = a - (b * (a // b))` where `//` is the floor division operator.

## Why Do We Use `(10^9 + 7)`?

`(10^9 + 7)` is a prime number commonly used as a modulus in competitive programming and algorithm design. The reasons for its popularity include:

1. **Large Range**: It is large enough to prevent overflow in most calculations, especially when dealing with large numbers.
2. **Prime Number**: Being a prime number allows for better properties in modular arithmetic, such as the existence of a modular multiplicative inverse for all integers that are coprime to \(10^9 + 7\).
3. **Efficiency**: It is computationally efficient to perform operations modulo `(10^9 + 7)` due to its size and properties.
4. **Commonly Accepted**: It is widely accepted in the competitive programming community, making it a standard choice for many problems involving modular arithmetic.

## Applications

The modulo operator is used in various scenarios, including:

- **Checking Even or Odd**: `n % 2 == 0` checks if `(n)` is even.
- **Circular Buffers**: Implementing data structures that wrap around.
- **Hashing**: Creating hash functions to distribute data evenly.
- **Cryptography**: Encrypting and decrypting data using modular arithmetic.
- **Number Theory**: Solving problems related to divisibility and remainders.