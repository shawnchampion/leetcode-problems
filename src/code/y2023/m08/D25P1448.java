package code.y2023.m08;

public class D25P1448 {
    public int goodNodes(TreeNode root) {
        return good(root, -10000);
    }

    int good(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }
        max = Math.max(max, node.val);
        int num = good(node.left, max) + good(node.right, max);
        if (max <= node.val) {
            num += 1;
        }
        return num;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}