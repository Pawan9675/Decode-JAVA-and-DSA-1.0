package Week_15_Trees;

import java.util.*;

public class CountSubtreesInRange {
    public static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Global variable to store the count of subtrees in range
    private static int subtreeCount;

    // Recursive function to count subtrees within a range
    public static boolean countSubtreesRecursive(TreeNode root, int low, int high) {
        if (root == null) return true;

        // Check left and right subtrees
        boolean left = countSubtreesRecursive(root.left, low, high);
        boolean right = countSubtreesRecursive(root.right, low, high);

        // If the current subtree lies within range, increment the count
        if (root.data >= low && root.data <= high && left && right) {
            subtreeCount++;
            return true;
        }

        // Otherwise, return false
        return false;
    }

    // Predefined BST
    public static TreeNode createBST() {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(35);
        return root;
    }

    public static void main(String[] args) {
        // Create a predefined BST
        TreeNode root = createBST();

        // Input the range
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range (low and high):");
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        // Count subtrees in range using a recursive approach
        subtreeCount = 0; // Reset the global counter
        countSubtreesRecursive(root, low, high);
        System.out.println("Number of subtrees in range [" + low + ", " + high + "] = " + subtreeCount);
    }
}
