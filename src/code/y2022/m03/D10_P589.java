package code.y2022.m03;

import java.util.*;

public class D10_P589 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        pre(root);
        return result;
    }

    private void pre(Node node) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        for (Node child : node.children) {
            pre(child);
        }
    }

    public List<Integer> preorder2(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> nodes = new Stack<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            Node node = nodes.pop();
            if (node == null){
                continue;
            }
            result.add(node.val);
            List<Node> children = node.children;
            Collections.reverse(children);
            nodes.addAll(children);
        }
        return result;
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}


