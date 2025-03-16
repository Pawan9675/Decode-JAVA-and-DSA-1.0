/*
Given the level order traversal of a complete Binary Tree, determine whether the Binary Tree is a Max Heap or not.
A complete binary tree means that all levels are filled except possibly the last level, and all nodes in the last level are as far left as possible.
 */

package Week_17_PriorityQueue.Assignment_PriorityQueue;

class BinaryTreeHeapChecker {
    // 🏷️ Static inner class for TreeNode
    static class TreeNode {
        int value;
        TreeNode leftChild, rightChild;

        public TreeNode(int value) {
            this.value = value;
            this.leftChild = this.rightChild = null;
        }
    }

    // 🏷️ Step 1: Calculate the total number of nodes in the tree
    public static int getTreeSize(TreeNode root) {
        if (root == null) return 0;
        return 1 + getTreeSize(root.leftChild) + getTreeSize(root.rightChild);
    }

    // 🏷️ Step 2: Check if the tree follows the completeness property
    public static boolean isCompleteTree(TreeNode root, int nodeIndex, int totalNodes) {
        if (root == null) return true;
        if (nodeIndex >= totalNodes) return false;
        
        // Recursively check left and right children
        return isCompleteTree(root.leftChild, 2 * nodeIndex + 1, totalNodes) &&
               isCompleteTree(root.rightChild, 2 * nodeIndex + 2, totalNodes);
    }

    // 🏷️ Step 3: Check if the tree follows the Max Heap property
    public static boolean satisfiesMaxHeap(TreeNode root) {
        if (root == null) return true;
        
        // Left child check
        if (root.leftChild != null && root.value < root.leftChild.value) return false;
        
        // Right child check
        if (root.rightChild != null && root.value < root.rightChild.value) return false;

        // Recursively check left and right subtrees
        return satisfiesMaxHeap(root.leftChild) && satisfiesMaxHeap(root.rightChild);
    }

    // 🏷️ Step 4: Final function to check if the tree is a Heap
    public static boolean isMaxHeap(TreeNode root) {
        int totalNodes = getTreeSize(root);
        return isCompleteTree(root, 0, totalNodes) && satisfiesMaxHeap(root);
    }

    // 🏷️ Driver code for testing
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.leftChild = new TreeNode(9);
        root.rightChild = new TreeNode(8);
        root.leftChild.leftChild = new TreeNode(7);
        root.leftChild.rightChild = new TreeNode(6);
        root.rightChild.leftChild = new TreeNode(5);
        root.rightChild.rightChild = new TreeNode(4);

        if (isMaxHeap(root))
            System.out.println("✅ The given binary tree is a Max Heap.");
        else
            System.out.println("❌ The given binary tree is NOT a Max Heap.");
    }
}
