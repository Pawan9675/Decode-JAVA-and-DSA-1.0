package Week_17_PriorityQueue;

import java.util.Scanner;

/*
Instead of using the heapifyUp approach, we can use the heapifyDown approach. Means we can start from the last non-leaf node and heapifyDown the nodes. This approach is more efficient than the heapifyUp approach.

        1           ---> 2^0 (level 0)
       / \
      2   3         ---> 2^1 (level 1)
     / \ / \
    4  5 6  7       ---> 2^2 (level 2)
   / \
  8   9             ---> 2^(h - 1) (level h - 1)

Time Complexity Analysis:
--------------------------------
Total Time = Total iterations of heapifyDown
i.e. T(n) = 2^(h - 1) x 0 + 2^(h - 2) x 1 + 2^(h - 3) x 2 + ... + 2^1 x (h - 2) + 2^0 x (h - 1) ---> (1)
Multiplying (1) by 2 on both sides:
2 x T(n) = 2^(h - 1) x 1 + 2^(h - 2) x 2 + 2^(h - 3) x 3 + ... 2^2 x (h - 2) + 2^1 x (h - 1) ---> (2)
Subtracting (1) from (2):
2 x T(n) - T(n) = 2^(h - 1) x 1 + 2^(h - 2) x (2 - 1) + 2^(h - 3) x (3 - 2) + ... + 2^2 x (-2 + 3) + 2^1 x (-1 + 2) + 2^0 x (h - 1)
T(n) = 2^(h - 1) + 2^(h - 2) + 2^(h - 3) + 2^(h - 4) + ... + 2^3 + 2^2 + 2^1 + (h - 1)
T(n) = 2^1 + 2^2 + 2^3 + 2^4 + ... + 2^(h - 3) + 2^(h - 2) + 2^(h - 1) + (h - 1)
T(n) = ((2 x (2^(h - 1) - 1)) / (2 - 1)) + (h - 1)
T(n) = 2^h - 2 + h - 1
T(n) = 2^h + h - 3
T(n) = 2^log(n) + log(n) - 3                (where h = O(log(n)))
T(n) = n + log(n) - 3
T(n) = O(n)
 */
public class ConvertArrayToHeap_Optimised {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void heapifyDown(int[] array, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapifyDown(array, largest, n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyDown(array, i, n);
        }

        System.out.println("Array converted to Max Heap:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
