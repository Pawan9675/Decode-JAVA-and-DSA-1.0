package Week_13_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Infix_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a valid infix expression (e.g., 3+5*2): ");
        String str = sc.nextLine();

        // Stacks for numbers and operators
        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();

        // Process the input expression
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            // If character is a digit, push it to the number stack
            if (ascii >= 48 && ascii <= 57) {
                num.push(ascii - 48);
            }
            // If operator stack is empty, push the operator
            else if (op.isEmpty()) {
                op.push(ch);
            } else {
                // Handle lower precedence operators (+, -)
                if (ch == '+' || ch == '-') {
                    int val2 = num.pop();
                    int val1 = num.pop();

                    if (op.peek() == '-') num.push(val1 - val2);
                    if (op.peek() == '+') num.push(val1 + val2);
                    if (op.peek() == '/') num.push(val1 / val2);
                    if (op.peek() == '*') num.push(val1 * val2);

                    op.pop();
                    op.push(ch);
                }
                // Handle higher precedence operators (*, /)
                else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int val2 = num.pop();
                        int val1 = num.pop();

                        if (op.peek() == '/') num.push(val1 / val2);
                        if (op.peek() == '*') num.push(val1 * val2);

                        op.pop();
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }

        // Process remaining operators in the stack
        while (num.size() > 1) {
            int val2 = num.pop();
            int val1 = num.pop();

            if (op.peek() == '-') num.push(val1 - val2);
            if (op.peek() == '+') num.push(val1 + val2);
            if (op.peek() == '/') num.push(val1 / val2);
            if (op.peek() == '*') num.push(val1 * val2);

            op.pop();
        }

        // Display the result
        System.out.println("The result of the infix expression is: " + num.peek());
    }
}
