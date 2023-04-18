package code.y2023.m04;

public class D18P1026 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    public int maxAncestorDiff(TreeNode root) {
        return f(root, root.val, root.val);
    }

    int f(TreeNode node, int min, int max) {
        if (node == null) {
            return 0;
        }
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);
        int diff = Math.abs(max - min);
        diff = Math.max(diff, f(node.left, min, max));
        diff = Math.max(diff, f(node.right, min, max));
        return diff;
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
