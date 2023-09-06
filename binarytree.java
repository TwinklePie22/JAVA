package Lab;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        // Create the binary tree
    	TreeNode root = new TreeNode(20);
        root.left = new TreeNode(5);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(15);
        root.left.right.left = new TreeNode(21);

        // Calculate the difference between the sum of odd and even level nodes
        int difference = calculateLevelDifference(root);
        System.out.println("Difference between the sum of odd level and even level nodes: " + difference);
    }

    private static int calculateLevelDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int oddSum = calculateLevelSum(root, 1);  // Calculate sum at odd levels
        int evenSum = calculateLevelSum(root, 0); // Calculate sum at even levels

        return oddSum - evenSum;
    }

    private static int calculateLevelSum(TreeNode node, int level) {
        if (node == null) {
            return 0;
        }

        // If the current level is odd, subtract the value of the node.
        // If the current level is even, add the value of the node.
        if (level % 2 == 0) {
            return node.val + calculateLevelSum(node.left, level + 1) + calculateLevelSum(node.right, level + 1);
        }else{
            return node.val - calculateLevelSum(node.left, level + 1) - calculateLevelSum(node.right, level + 1);
        } 
    }
}
