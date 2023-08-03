package JAVA_INTERNAL;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class binaryTreep5 {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.left.right.left = new TreeNode(8);

        int difference = calculateLevelDifference(root);
        System.out.println("Difference between the sum of odd level and even level nodes: " + difference);
    }

    private static int calculateLevelDifference(TreeNode root) {
        return calculateLevelSum(root, 1) - calculateLevelSum(root, 0);
    }

    private static int calculateLevelSum(TreeNode node, int level) {
        if (node == null) {
            return 0;
        }

        // If the current level is odd, subtract the value of the node.
        // If the current level is even, add the value of the node.
        if (level % 2 == 1) {
            return node.val - calculateLevelSum(node.left, level + 1) - calculateLevelSum(node.right, level + 1);
        } else {
            return node.val + calculateLevelSum(node.left, level + 1) + calculateLevelSum(node.right, level + 1);
        }
    }
}
