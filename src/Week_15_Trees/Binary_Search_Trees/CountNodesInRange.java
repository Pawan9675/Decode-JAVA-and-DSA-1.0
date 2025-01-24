package Week_15_Trees.Binary_Search_Trees;

import java.util.*;


public class CountNodesInRange {
    public static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Approach 1: Recursive Traversal
    public static int getCountRecursive(TreeNode root, int low, int high) {
        // Base case
        if (root == null) return 0;

        // If the current node is in range
        if (root.data >= low && root.data <= high) {
            return 1 + getCountRecursive(root.left, low, high) + getCountRecursive(root.right, low, high);
        }

        // If the current node is smaller than the range, check the right subtree
        if (root.data < low) {
            return getCountRecursive(root.right, low, high);
        }

        // Otherwise, check the left subtree
        return getCountRecursive(root.left, low, high);
    }

    // Approach 2: Iterative Level Order Traversal (BFS)
    public static int getCountIterative(TreeNode root, int low, int high) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int count = 0;

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            // If the current node is in range, count it and process children
            if (current.data >= low && current.data <= high) {
                count++;

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            // If the current node is smaller than low, process the right child
            else if (current.data < low) {
                if (current.right != null) queue.add(current.right);
            }
            // If the current node is larger than high, process the left child
            else {
                if (current.left != null) queue.add(current.left);
            }
        }

        return count;
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

        // Define the range
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range (low and high):");
        int low = scanner.nextInt();
        int high = scanner.nextInt();


        // Recursive Approach
        int recursiveCount = getCountRecursive(root, low, high);
        System.out.println("Approach 1 (Recursive): Count of nodes in range = " + recursiveCount);

        // Iterative Approach
        int iterativeCount = getCountIterative(root, low, high);
        System.out.println("Approach 2 (Iterative): Count of nodes in range = " + iterativeCount);

        scanner.close();
    }
}
