package Week_15_Trees.Binary_Search_Trees;

public class BSTMinMax {

    // Static inner class for TreeNode
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Function to find the minimum value in the BST
    public static int findMin(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        TreeNode temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.val;
    }

    // Function to find the maximum value in the BST
    public static int findMax(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        TreeNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.val;
    }

    public static void main(String[] args) {
        // Create the BST
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right.right = new TreeNode(40);

        // Find the minimum and maximum values
        int min = findMin(root);
        int max = findMax(root);

        // Display the results
        System.out.println("Minimum Value in the BST: " + min);
        System.out.println("Maximum Value in the BST: " + max);
    }
}
