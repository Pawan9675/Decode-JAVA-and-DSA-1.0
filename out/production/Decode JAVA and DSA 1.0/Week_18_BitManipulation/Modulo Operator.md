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
