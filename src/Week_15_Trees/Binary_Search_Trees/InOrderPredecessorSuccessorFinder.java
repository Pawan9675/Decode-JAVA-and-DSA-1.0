package Week_15_Trees.Binary_Search_Trees;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class InOrderPredecessorSuccessorFinder {

    // Approach 1: Using List
    public static int[] findPredecessorSuccessorWithList(TreeNode root, int key) {
        List<Integer> inorderList = new ArrayList<>();
        inorderTraversal(root, inorderList); // Perform in-order traversal

        Integer predecessor = null, successor = null;

        for (int i = 0; i < inorderList.size(); i++) {
            if (inorderList.get(i) == key) {
                predecessor = (i - 1 >= 0) ? inorderList.get(i - 1) : null;
                successor = (i + 1 < inorderList.size()) ? inorderList.get(i + 1) : null;
                break;
            }
        }

        return new int[]{predecessor != null ? predecessor : -1, successor != null ? successor : -1};
    }

    // Helper function for in-order traversal
    public static void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

    // Approach 2: Space Optimized
    private static Integer predecessor = null;
    private static Integer successor = null;

    public static int[] findPredecessorSuccessor(TreeNode root, int key) {
        predecessor = null;
        successor = null;
        inorderTraversalWithVariables(root, key);
        return new int[]{predecessor != null ? predecessor : -1, successor != null ? successor : -1};
    }

    public static void inorderTraversalWithVariables(TreeNode root, int key) {
        if (root == null) return;

        // Traverse the left subtree
        inorderTraversalWithVariables(root.left, key);

        // Check and update predecessor and successor
        if (root.val > key && successor == null) successor = root.val;
        if (root.val < key) predecessor = root.val;

        // Traverse the right subtree
        inorderTraversalWithVariables(root.right, key);
    }

    // Helper function to create a sample BST
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
        // Create a sample BST
        TreeNode root = createBST();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key to find predecessor and successor: ");
        int key = scanner.nextInt();

        // Approach 1
        int[] result1 = findPredecessorSuccessorWithList(root, key);
        System.out.println("Approach 1 (Using List): Predecessor = " + result1[0] + ", Successor = " + result1[1]);

        // Approach 2
        int[] result2 = findPredecessorSuccessor(root, key);
        System.out.println("Approach 2 (Space Optimized): Predecessor = " + result2[0] + ", Successor = " + result2[1]);
    }
}
