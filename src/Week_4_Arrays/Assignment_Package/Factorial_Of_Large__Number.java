// Find the factorial of a large number.
// Hint :- use an array to store every digit of answer.
package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class Factorial_Of_Large__Number {
    static int multiply(int x, int res[], int res_size) {
        int carry = 0;
        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }
        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }

    // Function to find factorial of a large number
    static void factorial(int n) {
        int[] res = new int[10000];
        res[0] = 1;
        int res_size = 1;
        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);

        // Print the result stored in the array
        System.out.println("Factorial of given number is: ");
        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        factorial(n);
    }
}
