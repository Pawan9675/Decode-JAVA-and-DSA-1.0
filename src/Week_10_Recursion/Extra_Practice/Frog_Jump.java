// There are N stones, numbered 0,1,2,...,N-1. For each i (0<=i<N), the height of Stone i is hi.
// There is a frog who is initially on Stone 0. He will repeat the following action some number of times to reach Stone N-1:
// If the frog is currently on Stone i, jump to Stone i+l or Stone i+2.
// Here, a cost of |hi - hj| I is incurred, where j is the stone to land on.
// Find the minimum possible total cost incurred before the frog reaches Stone N.

// Input n = 4
// arr[] = 30 40 20
// Output = 30

package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Frog_Jump {

    // Function to calculate the minimum cost for the frog to jump from the current stone to the last stone
    public static int findMinimumCost(int[] heights, int totalStones, int currentIndex) {       // Time complexity: O(2^n)
        // Base case: if the frog is on the last stone, no further cost is required
        if (currentIndex == totalStones - 1) return 0;

        // Option 1: Jump to the next stone (currentIndex + 1)
        int costOneStep = Math.abs(heights[currentIndex] - heights[currentIndex + 1]) + findMinimumCost(heights, totalStones, currentIndex + 1);

        // If we are at the second last stone, only a one-step jump is possible
        if (currentIndex == totalStones - 2) return costOneStep;

        // Option 2: Jump to the stone after next (currentIndex + 2)
        int costTwoStep = Math.abs(heights[currentIndex] - heights[currentIndex + 2]) + findMinimumCost(heights, totalStones, currentIndex + 2);

        // Return the minimum of the two possible costs
        return Math.min(costOneStep, costTwoStep);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of stones
        System.out.print("Enter the number of stones: ");
        int numberOfStones = scanner.nextInt();

        // Input the heights of the stones
        int[] stoneHeights = new int[numberOfStones];
        System.out.println("Enter the heights of the stones: ");
        for (int i = 0; i < numberOfStones; i++) {
            stoneHeights[i] = scanner.nextInt();
        }

        // Calculate the minimum cost to jump from stone 0 to stone N-1
        int minCost = findMinimumCost(stoneHeights, numberOfStones, 0);

        // Print the result
        System.out.println("The minimum total cost for the frog to reach the last stone is: " + minCost);
    }
}
