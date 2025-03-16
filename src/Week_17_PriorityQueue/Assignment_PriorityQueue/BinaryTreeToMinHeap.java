/*
Given a binary search tree which is also a complete binary tree. The problem is to convert the given BST into a Min Heap
with the condition that all the values in the left subtree of a node should be less than all the values in the right subtree of the node.
This condition is applied to all the nodes in the resultant converted Min Heap.
 */

package Week_17_PriorityQueue.Assignment_PriorityQueue;

import java.util.*;

class BinaryTreeToMinHeap {
    // 🏷️ Static inner class for TreeNode
    static class TreeNode {
        int value;
        TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    // 🏷️ Step 1: Perform Inorder Traversal (Left → Root → Right) to store sorted values
    public static void inorderTraversal(TreeNode root, List<Integer> values) {
        if (root == null) return;
        inorderTraversal(root.left, values);
        values.add(root.value);
        inorderTraversal(root.right, values);
    }

    // 🏷️ Step 2: Perform Preorder Traversal (Root → Left → Right) to fill values
    public static void fillTreeWithValues(TreeNode root, List<Integer> values, int[] index) {
        if (root == null) return;
        
        // Assign value from stored inorder list
        root.value = values.get(index[0]);
        index[0]++; // Move to the next value

        // Fill left and right subtrees
        fillTreeWithValues(root.left, values, index);
        fillTreeWithValues(root.right, values, index);
    }

    // 🏷️ Wrapper function to convert BST → Min Heap
    public static void convertBSTtoMinHeap(TreeNode root) {
        List<Integer> sortedValues = new ArrayList<>();

        // Step 1: Store values in Inorder (ascending order)
        inorderTraversal(root, sortedValues);
        
        // Step 2: Fill values using Preorder traversal
        int[] index = {0}; // Using array to maintain index reference
        fillTreeWithValues(root, sortedValues, index);
    }

    // 🏷️ Utility function to print level order traversal of the tree
    public static void levelOrderPrint(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.value + " ");
            
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    // 🏷️ Driver code
    public static void main(String[] args) {
        /*
               4
              / \
             2   6
            / \ / \
           1  3 5  7
        */
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        System.out.println("✅ BST (Level Order):");
        levelOrderPrint(root);

        // Convert BST to Min Heap
        convertBSTtoMinHeap(root);

        System.out.println("\n✅ Converted Min Heap (Level Order):");
        levelOrderPrint(root);
    }
}
