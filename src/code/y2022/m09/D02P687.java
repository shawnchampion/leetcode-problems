package code.y2022.m09;

public class D02P687 {

    public static class TreeNode {
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

    private int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        samePath(root);
        return max;
    }

    private int samePath(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = samePath(node.left);
        int right = samePath(node.right);
        boolean equalLeft = node.left != null && node.left.val == node.val;
        boolean equalRight = node.right != null && node.right.val == node.val;
        if (equalLeft) {
            left+=1;
        }
        if (equalRight) {
            right+=1;
        }
        if (equalLeft && equalRight) {
            max = Math.max(left + right, max);
            return Math.max(left, right);
        } else if (equalLeft){
            max = Math.max(Math.max(left, right), max);
            return left;
        } else if (equalRight){
            max = Math.max(Math.max(left, right), max);
            return right;
        } else {
            return 0;
        }
    }
}
