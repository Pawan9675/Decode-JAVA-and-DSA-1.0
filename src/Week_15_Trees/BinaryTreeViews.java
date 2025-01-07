package Week_15_Trees;

import java.util.*;

public class BinaryTreeViews {

    // Definition for a binary tree node (static so it can be used in the main method)
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }

    // Helper class to store nodes and its horizontal distance (HD)
    public static class Pair {
        TreeNode node;
        int hd;

        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // Right Side View function
    // Time Complexity: O(N), where N is the number of nodes in the tree (since we visit each node once)
    // Space Complexity: O(N), for storing nodes in the queue and the result list
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (i == levelSize - 1) result.add(node.val);  // Add the last node of the level
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }

        return result;
    }

    // Left Side View function
    // Time Complexity: O(N), where N is the number of nodes in the tree (since we visit each node once)
    // Space Complexity: O(N), for storing nodes in the queue and the result list
    public static List<Integer> leftSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                // Add the first node of the level
                if (i == 0) result.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }

        return result;
    }

    // Top View function
    // Time Complexity: O(N), where N is the number of nodes in the tree (since we visit each node once)
    // Space Complexity: O(N), for storing nodes in the queue and the map (for horizontal distance mapping)
    public static List<Integer> topView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Map to store the first node at each horizontal distance (HD)
        Map<Integer, Integer> topViewMap = new TreeMap<>();
        // Queue for level-order traversal: stores pairs of (node, HD)
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0)); // Start with the root at HD = 0

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            TreeNode node = current.node;
            int hd = current.hd;

            // If no node is recorded for this HD, record it
            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, node.val);
            }

            // Enqueue left and right children with updated HDs
            if (node.left != null) queue.add(new Pair(node.left, hd - 1));
            if (node.right != null) queue.add(new Pair(node.right, hd + 1));
        }

        // Add nodes to the result in order of their HD
        for (int value : topViewMap.values()) {
            result.add(value);
        }

        return result;
    }

    // Bottom View function
    // Time Complexity: O(N), where N is the number of nodes in the tree (since we visit each node once)
    // Space Complexity: O(N), for storing nodes in the queue and the map (for horizontal distance mapping)
    public static List<Integer> bottomView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Map to store the last node at each horizontal distance (HD)
        Map<Integer, Integer> bottomViewMap = new TreeMap<>();
        // Queue for level-order traversal: stores pairs of (node, HD)
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0)); // Start with the root at HD = 0

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            TreeNode node = current.node;
            int hd = current.hd;

            // Always update the map with the latest node at this HD
            bottomViewMap.put(hd, node.val);

            // Enqueue left and right children with updated HDs
            if (node.left != null) queue.add(new Pair(node.left, hd - 1));
            if (node.right != null) queue.add(new Pair(node.right, hd + 1));
        }

        // Add nodes to the result in order of their HD
        for (int value : bottomViewMap.values()) {
            result.add(value);
        }

        return result;
    }

    // Method to print the views
    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Print Right View
        List<Integer> rightView = rightSideView(root);
        System.out.println("Right View: " + rightView);

        // Print Left View
        List<Integer> leftView = leftSideView(root);
        System.out.println("Left View: " + leftView);

        // Print Top View
        List<Integer> topView = topView(root);
        System.out.println("Top View: " + topView);

        // Print Bottom View
        List<Integer> bottomView = bottomView(root);
        System.out.println("Bottom View: " + bottomView);
    }
}
