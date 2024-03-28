package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class Delete_Element_At_Specific_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50]; // Create an array of size 50
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt(); // Read the size of the array from the user
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read the elements of the array from the user
        }

        System.out.print("Enter the position of the element to be deleted: ");
        int position = sc.nextInt(); // Read the position of the element to be deleted

        System.out.println("Arrays before deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" "); // Print the array before deletion
        }
        System.out.println();

        // Shift elements to the left from position+1 to n-1
        for (int i = position ; i <= n - 1; i++) {
            arr[i] = arr[i+1]; // Move each element one position to the left starting from the position+1
        }

        // Decrement the size of the array
        n--; // Decrease the size of the array since an element is deleted



        System.out.println("Arrays after deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" "); // Print the array after deletion
        }
        System.out.println();
    }
}
