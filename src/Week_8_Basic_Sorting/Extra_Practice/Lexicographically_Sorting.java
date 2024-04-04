// Give an array of names of the fruits; you are supposed to sort it in lexicographical order using the selection sort

package Week_8_Basic_Sorting.Extra_Practice;

import java.util.Scanner;

public class Lexicographically_Sorting {
    // Function to perform lexicographical sorting of an array of strings
    public static void lexicographicalSorting(String[] fruit){
        int n = fruit.length;

        // Using selection sort algorithm to sort the array lexicographically
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                // Comparing strings lexicographically
                if (fruit[j].compareTo(fruit[min_index]) < 0){
                    min_index = j;
                }
            }
            // Swapping the minimum element with the current element
            String temp = fruit[i];
            fruit[i] = fruit[min_index];
            fruit[min_index] = temp;
        }
    }

    // Function to print the elements of the array
    public static void printArray(String[] fruit){
        for (String element : fruit){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        String[] fruit = new String[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            fruit[i] = sc.next();
        }

        System.out.println("Original Array: ");
        printArray(fruit);

        lexicographicalSorting(fruit);

        System.out.println("Array after lexicographical sorting: ");
        printArray(fruit);
    }
}
