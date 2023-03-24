package code.history;

import java.util.HashMap;
import java.util.Map;

public class P563 {

    static class TreeNode {
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

    int ans = 0;

    public int findTilt(TreeNode root) {
        fun(root);
        return ans;
    }

    private int fun(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int sumL = fun(node.left);
        int sumR = fun(node.right);

        ans += Math.abs(sumL - sumR);

        return node.val + sumL + sumR;
    }
}
