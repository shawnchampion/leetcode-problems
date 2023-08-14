package code.y2023.m08;

public class D14P617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        TreeNode node = new TreeNode();
        TreeNode left1 = null, left2 = null, right1 = null, right2 = null;
        if (root1 != null) {
            node.val += root1.val;
            left1 = root1.left;
            right1 = root1.right;
        }
        if (root2 != null) {
            node.val += root2.val;
            left2 = root2.left;
            right2 = root2.right;
        }
        node.left = mergeTrees(left1, left2);
        node.right = mergeTrees(right1, right2);
        return node;
    }

//    public TreeNode build(TreeNode root1, TreeNode root2) {
//        if (root1 == null && root2 == null) {
//            return null;
//        }
//        TreeNode node = new TreeNode();
//        TreeNode left1 = null, left2 = null, right1 = null, right2 = null;
//        if (root1 != null) {
//            node.val += root1.val;
//            left1 = root1.left;
//            right1 = root1.right;
//        }
//        if (root2 != null) {
//            node.val += root2.val;
//            left2 = root2.left;
//            right2 = root2.right;
//        }
//        node.left = build(left1, left2);
//        node.right = build(right1, right2);
//        return node;
//    }

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