package Week_13_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Infix_To_Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a valid infix expression
        System.out.print("Enter a valid infix expression (e.g., 8-(5+3)*(4/6)): ");
        String str = sc.nextLine();

        // Stacks for storing operators and postfix result
        Stack<String> postfix = new Stack<>();
        Stack<Character> op = new Stack<>();

        // Iterate through the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            // If the character is a number, push it to the postfix stack
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                postfix.push(s);
            }
            // If the operator stack is empty or '(' is encountered, push the operator
            else if (op.isEmpty() || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }
            // Process the closing parenthesis ')'
            else if (ch == ')') {
                while (op.peek() != '(') {
                    String val2 = postfix.pop();
                    String val1 = postfix.pop();
                    char o = op.pop();

                    // Form the postfix expression by combining operands and operator
                    String t = val1 + val2 + o;
                    postfix.push(t);
                }
                op.pop(); // Pop the '('
            }
            // Handle lower precedence operators (+, -)
            else {
                if (ch == '+' || ch == '-') {
                    // Process operators of the same or higher precedence
                    String val2 = postfix.pop();
                    String val1 = postfix.pop();
                    char o = op.pop();

                    // Combine the operands and operator in postfix notation
                    String t = val1 + val2 + o;
                    postfix.push(t);

                    op.push(ch); // Push the current operator
                }
                // Handle higher precedence operators (*, /)
                else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String val2 = postfix.pop();
                        String val1 = postfix.pop();
                        char o = op.pop();

                        // Combine the operands and operator in postfix notation
                        String t = val1 + val2 + o;
                        postfix.push(t);

                        op.push(ch); // Push the current operator
                    } else {
                        op.push(ch); // Push the current operator
                    }
                }
            }
        }

        // Process remaining operators in the stack
        while (postfix.size() > 1) {
            String val2 = postfix.pop();
            String val1 = postfix.pop();
            char o = op.pop();

            // Combine the operands and operator in postfix notation
            String t = val1 + val2 + o;
            postfix.push(t);
        }

        // Display the result
        System.out.println("The postfix expression is: " + postfix.peek());
    }
}
