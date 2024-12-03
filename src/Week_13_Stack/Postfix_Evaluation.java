package Week_13_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Postfix_Evaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a valid postfix expression
        System.out.print("Enter a valid postfix expression (e.g., 53+42/*): ");
        String str = sc.nextLine();

        // Stack to evaluate the postfix expression
        Stack<Integer> stack = new Stack<>();

        // Iterate through the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is a number, push it to the stack
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert character to integer and push
            }
            // If the character is an operator, pop two operands and perform the operation
            else {
                int val2 = stack.pop(); // Pop the second operand
                int val1 = stack.pop(); // Pop the first operand

                // Perform the operation based on the operator
                if (ch == '+') {
                    stack.push(val1 + val2); // Addition
                } else if (ch == '-') {
                    stack.push(val1 - val2); // Subtraction
                } else if (ch == '*') {
                    stack.push(val1 * val2); // Multiplication
                } else if (ch == '/') {
                    stack.push(val1 / val2); // Division
                }
            }
        }

        // The final result is the only element left in the stack
        System.out.println("The result of the postfix expression is: " + stack.peek());
    }
}
