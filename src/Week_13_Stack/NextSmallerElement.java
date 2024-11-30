package Week_13_Stack;

import java.util.*;

public class NextSmallerElement {
    // Function to find the next smaller element for each element of the array.
    public static int[] nextSmallerElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n]; // Array to store the next smaller elements
        Stack<Integer> st = new Stack<>(); // Stack to keep track of smaller elements

        // Initialize the last element's next smaller element as -1
        result[n - 1] = -1;
        st.push(arr[n - 1]);

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
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

        // Get the result of next smaller elements
        int[] result = nextSmallerElement(arr);

        // Display the result
        System.out.println("The next smaller elements for each array element are: ");
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
