package code.y2022.m08;

public class D20P654 {
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int max = max(nums, left, right);
        TreeNode node = new TreeNode(nums[max]);
        node.left = buildTree(nums, left, max - 1);
        node.right = buildTree(nums, max + 1, right);
        return node;
    }

    private int max(int[] nums, int left, int right) {
        int max = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }
}