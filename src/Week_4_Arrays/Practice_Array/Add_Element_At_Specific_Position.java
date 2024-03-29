package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class Add_Element_At_Specific_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50]; // Create an array of size 50
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt(); // Read the size of the array from the user
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read the elements of the array from the user
        }

        System.out.print("Enter the element to be inserted: ");
        int element = sc.nextInt(); // Read the element to be inserted
        System.out.print("Enter the position of the element: ");
        int position = sc.nextInt(); // Read the position where the element should be inserted

        System.out.println("Arrays before insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" "); // Print the array before insertion
        }
        System.out.println();

        // Shift elements to the right from position to n-1
        for (int i = n - 1; i >= position; i--) {
            arr[i + 1] = arr[i]; // Move each element one position to the right starting from the last element
        }

        // Insert the element at the specified position
        arr[position] = element; // Insert the element at the specified position

        // Increment the size of the array
        n++; // Increase the size of the array since a new element is added



        System.out.println("Arrays after insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" "); // Print the array after insertion
        }
        System.out.println();
    }
}
