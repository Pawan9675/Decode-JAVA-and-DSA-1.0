package Week_17_PriorityQueue;

public class MaxHeapImplementation {
    public static class MaxHeap {
        private int[] heap;
        private int size;

        public MaxHeap(int capacity) {
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

            if (index > 0 && heap[index] > heap[parent]) {
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
            int largest = index;

            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }

            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }

            if (largest != index) {
                swap(index, largest);
                heapifyDown(largest);
            }
        }

        public int remove() {
            if (size == 0) {
                throw new IllegalStateException("Heap is empty");
            }
            int removedElement = heap[0];
            heap[0] = heap[--size];
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
        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(15);
        maxHeap.add(30);
        maxHeap.add(5);
        maxHeap.add(40);

        System.out.print("Max Heap after adding elements: ");
        maxHeap.printHeap();
        // Output (Heap structure, order may vary): 40 30 15
    }
}
