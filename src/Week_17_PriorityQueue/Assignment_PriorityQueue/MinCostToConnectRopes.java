// Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum cost,
// such that the cost to connect two ropes is equal to the sum of their lengths.

package Week_17_PriorityQueue.Assignment_PriorityQueue;

import java.util.*;

public class MinCostToConnectRopes {
    public static int minCostToConnectRopes(int[] ropes) {
        // 🏷️ Step 1: Create a Min Heap (PriorityQueue in Java)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // 🏷️ Step 2: Add all rope lengths into the Min Heap
        for (int rope : ropes) {
            minHeap.add(rope);
        }

        int totalCost = 0;

        // 🏷️ Step 3: Keep combining ropes until one remains
        while (minHeap.size() > 1) {
            int first = minHeap.poll();  // Smallest rope
            int second = minHeap.poll(); // Second smallest rope
            
            int newRope = first + second; // Connecting cost
            totalCost += newRope; // Add cost to total
            
            minHeap.add(newRope); // Insert new rope back into heap
        }

        return totalCost;
    }

    public static void main(String[] args) {
        // 🏷️ Input Handling
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of ropes: ");
        int n = sc.nextInt();

        int[] ropes = new int[n];
        System.out.println("Enter the lengths of the ropes:");
        for (int i = 0; i < n; i++) {
            ropes[i] = sc.nextInt();
        }

        // 🏷️ Compute Minimum Cost
        int minCost = minCostToConnectRopes(ropes);
        
        // 🏷️ Output the result
        System.out.println("Minimum cost to connect all ropes: " + minCost);

        sc.close();
    }
}
