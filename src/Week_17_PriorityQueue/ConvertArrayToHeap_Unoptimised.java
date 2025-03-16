package Week_17_PriorityQueue;

import java.util.Scanner;
/*

        1           ---> 2^0
       / \
      2   3         ---> 2^1
     / \ / \
    4  5 6  7       ---> 2^2
   / \
  8   9             ---> 2^(h - 1)

Property of complete binary tree:
-----------------------------------
1. The tree is completely filled on all levels except possibly for the lowest, which is filled from the left up to a point.
2. A complete binary tree can be represented in an array.
3. Height of a complete binary tree is always floor(log n).
        - 2^0 + 2^1 + 2^2 + ... + 2^(h - 1) = n          (where n is the number of nodes)
        - (1 x (2^h - 1)) / (2 - 1) = n
        - 2^h - 1 = n
        - 2^h = n + 1
        - Taking log on both sides
        - h = log(n + 1) ~ O(log n)
4. The total number of nodes in a complete binary tree of height h is 2^(h + 1) - 1.
5. The total number of leaf nodes in a complete binary tree having nodes n is either (n + 1) / 2 or n / 2.
        - Total number of nodes = n
        - 2^0 + 2^1 + 2^2 + ... + 2^(h - 3) + 2^(h - 2) + 2^(h - 1) = n         (where 2^(h - 1) is the last level)
        - 1 x (2^(h - 1) - 1) / (2 - 1) = n
        - 2^(h - 1) + 2^(h - 1) = n + 1
        - 2 x 2^(h - 1) = n + 1
        - 2^(h - 1) = (n + 1) / 2
        i.e. The last level has almost half of the nodes.

Why complete binary tree is used to represent heap?
----------------------------------------------------
1. A complete binary tree can be represented in an array.
2. The left child of a node is at index 2i + 1.
3. The right child of a node is at index 2i + 2.
4. The parent of a node is at index (i - 1) / 2.
So we can easily access the parent, left child, and right child of a node using the array representation.
 */

/*
Note: A sorted array is always a valid Min/Max Heap. But vice-versa is not true.

Approach:
At any point of time, the region of the array from 0 to i is a valid heap.

Time Complexity: O(n log n)
Space Complexity: O(1)

Time Complexity Analysis:
--------------------------------
Total Time = Total iterations of heapifyUp
i.e. T(n) = 2^0 x 0 + 2^1 x 1 + 2^2 x 2 + ... + 2^(h - 1) x (h - 1) ---> (1)
Multiplying (1) by 2 on both sides:
2 x T(n) = 2^1 x 0 + 2^2 x 1 + 2^3 x 2 + ... + 2^h x (h - 1) ---> (2)

Subtracting (1) from (2):
2T(n) - T(n) = 2^1 x (0 - 1) + 2^2 x (1 - 2) + 2^3 x (2 - 3) + ... + 2^(h - 1) x (-2 + 1) + 2^h x (h - 1)
=> T(n) = 2^1 x (-1) + 2^2 x (-1) + 2^3 x (-1) + ... + 2^(h - 1) x (-1) + 2^h x (h - 1)
=> T(n) = (-1) x (2^1 + 2^2 + 2^3 + ... + 2^(h-1)) + 2^h x (h - 1)
=> T(n) = (-1) x ((2 x (2^(h-1) - 1)) / (2 - 1)) + 2^h x (h - 1)
=> T(n) = (-1) x (2 x (2^(h-1)- 1)) + 2^h x (h - 1)
=> T(n) = (-1) x (2^h - 2) + 2^h x (h - 1)
=> T(n) = 2 - 2^h + 2^h x (h - 1)
=> T(n) = 2^h x (h - 1) - 2^h + 2
=> T(n) = 2^h x (h - 1 - 1) + 2
=> T(n) = 2^h x (h - 2) + 2
=> T(n) = 2^log n x (log n - 2) + 2
=> T(n) = n x (log n - 2) + 2 ~ O(n log n)
 */

public class ConvertArrayToHeap_Unoptimised {
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void heapifyUp(int[] array, int index) {
        int parent = (index - 1) / 2;

        if (index > 0 && array[index] > array[parent]) {
            swap(array, index, parent);
            heapifyUp(array, parent);
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

        for (int i = 1; i < n; i++) {
            heapifyUp(array, i);
        }

        System.out.println("Array converted to Max Heap:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
