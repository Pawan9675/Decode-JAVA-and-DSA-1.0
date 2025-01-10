package Week_15_Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ConstructTreesUsingLevelOrder {

    // Tree Node Definition
    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // Level Order Traversal Method
    public static void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);

        System.out.println("Level Order Traversal:");
        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            while (levelSize-- > 0) {
                TreeNode currentNode = queue.poll();
                System.out.print(currentNode.value + " ");

                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
            }
            System.out.println(); // Newline after each level
        }
    }

    // Construct Tree from Level Order Input
    public static TreeNode constructTree(int[] inputArray, int size) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(inputArray[0]);
        queue.add(root);

        int i = 1;
        int j = 2;

        while (!queue.isEmpty() && i < size) {
            TreeNode currentNode = queue.poll();
            TreeNode leftChild;
            TreeNode rightChild;

            if (inputArray[i] != Integer.MIN_VALUE) leftChild = new TreeNode(inputArray[i]);
            else leftChild = null;

            if (j != size && inputArray[j] != Integer.MIN_VALUE) rightChild = new TreeNode(inputArray[j]);
            else rightChild = null;

            currentNode.left = leftChild;
            currentNode.right = rightChild;

            if (leftChild != null) queue.add(leftChild);
            if (rightChild != null) queue.add(rightChild);

            i += 2;
            j += 2;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the tree:");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Tree is empty!");
            return;
        }

        System.out.println("Enter the elements of the tree in level order (use -1 for null nodes):");
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
            if (inputArray[i] == -1) {
                inputArray[i] = Integer.MIN_VALUE; // Represent null nodes
            }
        }

        // Construct the tree
        TreeNode root = constructTree(inputArray, n);

        // Perform level order traversal
        levelOrderTraversal(root);
    }
}
