package Week_15_Trees.Binary_Search_Trees;

import java.util.Scanner;

public class DistanceBetweenNodes {

    // TreeNode definition
    public static class TreeNode {
        int value;
        TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // Function to find the distance of a node from the root
    public static int distanceFromRoot(TreeNode root, int target) {
        // If the current node matches the target, return 0
        if (root.value == target) return 0;

        // If the target is smaller, find distance in the left subtree
        if (root.value > target) {
            return 1 + distanceFromRoot(root.left, target);
        }

        // If the target is larger, find distance in the right subtree
        return 1 + distanceFromRoot(root.right, target);
    }

    // Function to find the minimum distance between two keys
    public static int distanceBetweenTwoKeys(TreeNode root, int key1, int key2) {
        // If both keys are smaller than the current node, traverse the left subtree
        if (root.value > key1 && root.value > key2) {
            return distanceBetweenTwoKeys(root.left, key1, key2);
        }

        // If both keys are larger than the current node, traverse the right subtree
        if (root.value < key1 && root.value < key2) {
            return distanceBetweenTwoKeys(root.right, key1, key2);
        }

        // If the keys are in different subtrees, the current node is the lowest common ancestor
        return distanceFromRoot(root, key1) + distanceFromRoot(root, key2);
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

        // Take input for the keys
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first key:");
        int firstKey = scanner.nextInt();
        System.out.println("Enter the second key:");
        int secondKey = scanner.nextInt();

        // Find and display distances
        System.out.println("Distance of " + firstKey + " from root: " + distanceFromRoot(root, firstKey));
        System.out.println("Distance of " + secondKey + " from root: " + distanceFromRoot(root, secondKey));
        System.out.println("Minimum distance between " + firstKey + " and " + secondKey + ": " +
                distanceBetweenTwoKeys(root, firstKey, secondKey));

        scanner.close();
    }
}
