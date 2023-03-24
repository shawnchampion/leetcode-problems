package code.y2023.m02;

public class D03P1145 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        TreeNode nodeX = find(root, x);
        int countXL = count(nodeX.left);
        int countXR = count(nodeX.right);
        return (countXL > n / 2) || (countXR > n / 2) || (countXL + countXR) < n / 2;
    }

    private TreeNode find(TreeNode node, int x) {
        if (node == null) {
            return null;
        }
        if (node.val == x) {
            return node;
        }
        TreeNode left = find(node.left, x);
        if (left != null) {
            return left;
        }
        TreeNode right = find(node.right, x);
        if (right != null) {
            return right;
        }
        return null;
    }

    private int count(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = count(node.left);
        int right = count(node.right);
        return left + right + 1;
    }
}
