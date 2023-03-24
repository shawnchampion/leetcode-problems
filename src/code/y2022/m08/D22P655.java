package code.y2022.m08;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class D22P655 {
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int depth = getDepth(root);
        int level = 0;
        while(level++ < depth) {
            int count = queue.size();
            List<String> line = new ArrayList<>();
            while(count-- > 0) {
                TreeNode node = queue.poll();
                int blank = (int)Math.pow(2, depth - level) - 1;
                for (int i = 0; i < blank; i++) {
                    line.add("");
                }
                if (node.val == 100) {
                    line.add("");
                } else {
                    line.add(String.valueOf(node.val));
                }
                for (int i = 0; i < blank; i++) {
                    line.add("");
                }
                if (null != node.left) {
                    queue.add(node.left);
                } else {
                    queue.add(new TreeNode(100));
                }
                if (null != node.right) {
                    queue.add(node.right);
                } else {
                    queue.add(new TreeNode(100));
                }
                if (count != 0) {
                    line.add("");
                }
            }
            result.add(line);
        }
        return result;
    }

    private int getDepth(TreeNode root) {
        int depth = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            depth++;
            int len = queue.size();
            while(len-- > 0) {
                TreeNode node = queue.poll();
                if (null != node.left) {
                    queue.add(node.left);
                }
                if (null != node.right) {
                    queue.add(node.right);
                }
            }
        }
        return depth;
    }
}

class TreeNode {
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
