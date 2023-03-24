package code.y2022.m08;

import java.util.*;

public class D27P662 {
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

    public static class Node {
        TreeNode treeNode;
        int order;

        Node(TreeNode treeNode, int order) {
            this.treeNode = treeNode;
            this.order = order;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(new Node(root, 1));
        int max = 0;
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> loc = new ArrayList<>();
            while (count-- > 0) {
                Node node = queue.poll();
                loc.add(node.order);
                if (node.treeNode.left != null) {
                    queue.add(new Node(node.treeNode.left, (node.order - 1) * 2 + 1));
                }
                if (node.treeNode.right != null) {
                    queue.add(new Node(node.treeNode.right, (node.order - 1) * 2 + 2));
                }
            }
            max = Math.max(loc.get(loc.size() - 1) - loc.get(0), max);
        }
        return max + 1;
    }
}
