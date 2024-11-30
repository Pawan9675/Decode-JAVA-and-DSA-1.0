package Week_13_Stack;

import java.util.*;

public class PreviousSmallerElement {
    // Function to find the previous smaller element for each element of the array.
    public static int[] previousSmallerElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n]; // Array to store the previous smaller elements
        Stack<Integer> st = new Stack<>(); // Stack to keep track of smaller elements

        // Initialize the first element's previous smaller element as -1
        result[0] = -1;
        st.push(arr[0]);

        // Traverse the array from left to right
        for (int i = 1; i < n; i++) {
            // Remove elements from the stack that are greater than or equal to arr[i]
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // If the stack is empty, there is no smaller element
            result[i] = st.isEmpty() ? -1 : st.peek();

            // Push the current element onto the stack
            st.push(arr[i]);
        }

        return result; // Return the result array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt(); // Size of the array

        int[] arr = new int[n]; // Declare the array

        // Taking input for array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the result of previous smaller elements
        int[] result = previousSmallerElement(arr);

        // Display the result
        System.out.println("The previous smaller elements for each array element are: ");
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
