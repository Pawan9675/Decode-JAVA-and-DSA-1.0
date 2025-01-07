package Week_15_Trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class Tree_Implementation {

    public static class TreeNode {
        int value;
        TreeNode leftChild;
        TreeNode rightChild;

        TreeNode(int value) {
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    /**
     * A helper class to store a tree node and its corresponding level
     */
    public static class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    /**
     * Time Complexity: O(n) - Each node is visited once.
     * Space Complexity: O(h) - h is the height of the tree (recursion stack).
     */
    public static void displayTree(TreeNode root) {
        if (root == null) return;

        System.out.print(root.value + " ");
        displayTree(root.leftChild);
        displayTree(root.rightChild);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static int calculateTreeSum(TreeNode root) {
        if (root == null) return 0;

        return root.value + calculateTreeSum(root.leftChild) + calculateTreeSum(root.rightChild);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static int calculateTreeProduct(TreeNode root) {
        if (root == null) return 1;
        return root.value * calculateTreeProduct(root.leftChild) * calculateTreeProduct(root.rightChild);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static int calculateNonZeroProduct(TreeNode root) {
        if (root == null) return 1;
        if (root.value != 0)
            return root.value * calculateNonZeroProduct(root.leftChild) * calculateNonZeroProduct(root.rightChild);
        else
            return calculateNonZeroProduct(root.leftChild) * calculateNonZeroProduct(root.rightChild);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static int findMaxValue(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.value, Math.max(findMaxValue(root.leftChild), findMaxValue(root.rightChild)));
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static int findMinValue(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.value, Math.min(findMinValue(root.leftChild), findMinValue(root.rightChild)));
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static int calculateTreeSize(TreeNode root) {
        if (root == null) return 0;
        return 1 + calculateTreeSize(root.leftChild) + calculateTreeSize(root.rightChild);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static int calculateTreeLevel(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(calculateTreeLevel(root.leftChild), calculateTreeLevel(root.rightChild));
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static void preorderTraversal(TreeNode root) {
        if (root == null) return;

        System.out.print(root.value + " ");
        preorderTraversal(root.leftChild);
        preorderTraversal(root.rightChild);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static void inorderTraversal(TreeNode root) {
        if (root == null) return;

        inorderTraversal(root.leftChild);
        System.out.print(root.value + " ");
        inorderTraversal(root.rightChild);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static void postorderTraversal(TreeNode root) {
        if (root == null) return;

        postorderTraversal(root.leftChild);
        postorderTraversal(root.rightChild);
        System.out.print(root.value + " ");
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static void reversePreorderTraversal(TreeNode root) {
        if (root == null) return;

        System.out.print(root.value + " ");
        reversePreorderTraversal(root.rightChild);
        reversePreorderTraversal(root.leftChild);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static void reverseInorderTraversal(TreeNode root) {
        if (root == null) return;

        reverseInorderTraversal(root.rightChild);
        System.out.print(root.value + " ");
        reverseInorderTraversal(root.leftChild);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     */
    public static void reversePostorderTraversal(TreeNode root) {
        if (root == null) return;

        reversePostorderTraversal(root.rightChild);
        reversePostorderTraversal(root.leftChild);
        System.out.print(root.value + " ");
    }

    /**
     * Time Complexity: O(n) - Each node is visited once.
     * Space Complexity: O(n) - Queue space for level order traversal.
     */
    public static void levelOrder1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size(); // Number of nodes at the current level

            while (size-- > 0) {
                TreeNode node = queue.remove();
                System.out.print(node.value + " ");

                if (node.leftChild != null) queue.add(node.leftChild);
                if (node.rightChild != null) queue.add(node.rightChild);
            }
            System.out.println(); // Move to the next level
        }
    }

    /**
     * Level Order Traversal Using Pair Class
     * Prints nodes level by level using a Pair to keep track of node levels.
     * Time Complexity: O(n) - Visits each node once.
     * Space Complexity: O(n) - Queue space for storing nodes and levels.
     */
    public static void levelOrder2(TreeNode root) {
        int prevLevel = 0;
        Queue<Pair> queue = new LinkedList<>();
        if (root != null) queue.add(new Pair(root, 0));

        System.out.println("Level-Order Traversal Using Pair Class:");
        while (!queue.isEmpty()) {
            Pair front = queue.remove();
            TreeNode temp = front.node;
            int lvl = front.level;

            if (lvl != prevLevel) {
                System.out.println();
                prevLevel++;
            }
            System.out.print(temp.value + " ");

            if (temp.leftChild != null) queue.add(new Pair(temp.leftChild, lvl + 1));
            if (temp.rightChild != null) queue.add(new Pair(temp.rightChild, lvl + 1));
        }
        System.out.println();
    }

    /**
     * Time Complexity: O(n) - Each node is visited once.
     * Space Complexity: O(h) - h is the height of the tree (recursion stack).
     */
    public static void nthLevel(TreeNode root, int currLevel, int level) {
        if (root == null) return;

        if (currLevel == level) {
            System.out.print(root.value + " ");
            return;
        }

        nthLevel(root.leftChild, currLevel + 1, level);
        nthLevel(root.rightChild, currLevel + 1, level);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeNode root = new TreeNode(1); // Root Node
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        // Object reference outputs
        System.out.println("Object Reference Outputs:");
        System.out.println(root);               // Output: Week_15_Trees.TreeImplementation$TreeNode@6acbcfc0
        System.out.println(root.value);         // Output: 1
        System.out.println(root.leftChild);     // Output: null
        System.out.println(root.rightChild);    // Output: null

        root.leftChild = node2; root.rightChild = node3;
        node2.leftChild = node4; node2.rightChild = node5;
        node3.rightChild = node6;

        // Values of Nodes
        System.out.println("\nValues of Nodes:");
        System.out.println(node2.value); // Output: 2
        System.out.println(root.leftChild.value); // Output: 2 (root.leftChild = node2)

        System.out.println(node5.value); // Output: 5
        System.out.println(root.leftChild.rightChild.value); // Output: 5 (root.leftChild.rightChild = node5)

        System.out.println("\nTree Traversal and Calculations:");
        System.out.print("Display Tree (Preorder): ");
        displayTree(root); // Output: 1 2 4 5 3 6

        System.out.println("\n\nSum of Tree Nodes: " + calculateTreeSum(root)); // Output: 21
        System.out.println("Product of Tree Nodes: " + calculateTreeProduct(root)); // Output: 720
        System.out.println("Product of Non-Zero Nodes: " + calculateNonZeroProduct(root)); // Output: 720
        System.out.println("Maximum Value in Tree: " + findMaxValue(root)); // Output: 6
        System.out.println("Minimum Value in Tree: " + findMinValue(root)); // Output: 1
        System.out.println("Size of Tree (Number of Nodes): " + calculateTreeSize(root)); // Output: 6
        System.out.println("Levels in Tree: " + calculateTreeLevel(root)); // Output: 3
        System.out.println("Height of Tree: " + (calculateTreeLevel(root) - 1)); // Output: 2

        System.out.print("\nPreorder Traversal: ");
        preorderTraversal(root); // Output: 1 2 4 5 3 6

        System.out.print("\nInorder Traversal: ");
        inorderTraversal(root); // Output: 4 2 5 1 3 6

        System.out.print("\nPostorder Traversal: ");
        postorderTraversal(root); // Output: 4 5 2 6 3 1

        System.out.print("\nReverse Preorder Traversal: ");
        reversePreorderTraversal(root); // Output: 1 3 6 2 5 4

        System.out.print("\nReverse Inorder Traversal: ");
        reverseInorderTraversal(root); // Output: 6 3 1 5 2 4

        System.out.print("\nReverse Postorder Traversal: ");
        reversePostorderTraversal(root); // Output: 6 3 5 4 2 1

        System.out.println("\nLevel-Order Traversal: ");
        levelOrder1(root); // Output: 1 2 3 4 5 6

        System.out.println("\nLevel-Order Traversal Using Pair Class: ");
        levelOrder2(root); // Output: Each level on a new line

        // Input for nth Level Elements
        System.out.print("\nEnter the level (0-based) of the Tree: ");
        int level = sc.nextInt();
        System.out.print("Elements of level " + level + ": ");
        nthLevel(root, 0, level); // Prints elements of the nth level

        // Level-Order Traversal Using nthLevel
        System.out.println("\n\nLevel-Order Traversal Using nthLevel:");
        for (int lvl = 0; lvl <= calculateTreeLevel(root) - 1; lvl++) {
            System.out.print("Level " + lvl + ": ");
            nthLevel(root, 0, lvl);
            System.out.println();
        }

    }
}
