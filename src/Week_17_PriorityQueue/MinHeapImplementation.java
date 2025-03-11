/*
Heap is implemented by array and visualised as a complete binary tree with Heap Order Property.

Note:
- The smallest element is always at the root.
- The parent node is always smaller than its children.
- The left child of a node is at 2 * i + 1 index.
- The right child of a node is at 2 * i + 2 index.
- The parent of a node is at (i - 1) / 2 index.
- The last non-leaf node is at (n / 2) - 1 index.
- The last node is at n - 1 index.
- The height of the heap is log(n) base 2.
- The time complexity of heap operations is O(log n).
- The space complexity of heap is O(n).

Addition / Insertion:
Step 1: Add the element at the end of the array.
Step 2: Compare the element with its parent.
Step 3: If the element is smaller than its parent, swap them.
Step 4: Repeat steps 2 and 3 until the element is at the correct position.

Note:
- The element is added at the end to maintain the complete binary tree property.
- The element is compared with its parent to maintain the heap order property.
- The Time Complexity of Step 1 is O(1) and Steps 2-4 is O(log n).


Deleting / Removing:
Step 1: Swap the root with the last element.
Step 2: Remove the last element.
Step 3: Compare the root with its children.
Step 4: If the root is greater than its children, swap it with the smaller child.
Step 5: Repeat steps 3 and 4 until the root is at the correct position.
Step 6: Return the removed element.
Step 7: Decrease the size of the heap.

Note:
- The root is swapped with the last element to maintain the complete binary tree property.
- The root is compared with its children to maintain the heap order property.
- The Time Complexity of Steps 1-2 is O(1) and Steps 3-5 is O(log n).
 */
package Week_17_PriorityQueue;

public class MinHeapImplementation {
    public static class MinHeap {
        private int[] heap;
        private int size;

        public MinHeap(int capacity) {
            heap = new int[capacity];
            size = 0;
        }

        public void swap(int index1, int index2) {
            int temp = heap[index1];
            heap[index1] = heap[index2];
            heap[index2] = temp;
        }

        public void heapifyUp(int index) {
            int parent = (index - 1) / 2;

            if (index > 0 && heap[index] < heap[parent]) {
                swap(index, parent);
                heapifyUp(parent);
            }
        }

        public void add(int element) {
            if (size == heap.length) {
                throw new IllegalStateException("Heap is full");
            }
            heap[size++] = element;
            heapifyUp(size - 1);
        }

        public void heapifyDown(int index) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }

            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != index) {
                swap(index, smallest);
                heapifyDown(smallest);
            }
        }

        public int remove() {
            if (size == 0) {
                throw new IllegalStateException("Heap is empty");
            }
            int removedElement = heap[0];
            swap(0, size - 1);
            size--;
            heapifyDown(0);
            return removedElement;
        }

        public int peek() {
            if (size == 0) {
                throw new IllegalStateException("Heap is empty");
            }
            return heap[0];
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == heap.length;
        }

        public boolean contains(int element) {
            for (int i = 0; i < size; i++) {
                if (heap[i] == element) {
                    return true;
                }
            }
            return false;
        }

        public void printHeap() {
            for (int i = 0; i < size; i++) {
                System.out.print(heap[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(15);
        System.out.println(minHeap.size());
        System.out.println(minHeap.peek());

        minHeap.add(0);
        System.out.println(minHeap.size());
        System.out.println(minHeap.peek());

        System.out.println(minHeap.remove());
        System.out.println(minHeap.size());
        System.out.println(minHeap.peek());
    }
}
