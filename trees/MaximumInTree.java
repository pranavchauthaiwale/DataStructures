package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumInTree {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getBinaryTree();
        int maximumValue = recursiveMaximum(root);
        System.out.println(String.format("Maximum value using recursive search is: %d", maximumValue));
        maximumValue = iterativeMaximum(root);
        System.out.println(String.format("Maximum value using iterative search is: %d", maximumValue));
    }

    public static int recursiveMaximum(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int maxL = recursiveMaximum(node.getLeftNode());
        int maxR = recursiveMaximum(node.getRightNode());
        int val = maxL > maxR ? maxL : maxR;
        val = val > node.getData() ? val : node.getData();
        return val;
    }

    public static int iterativeMaximum(TreeNode root) {

        //Using level order traversal to scan through the tree to find the maximum element
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxVal = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            maxVal = currentNode.getData() > maxVal ? currentNode.getData() : maxVal;

            if (currentNode.getLeftNode() != null) {
                queue.offer(currentNode.getLeftNode());
            }

            if (currentNode.getRightNode() != null) {
                queue.offer(currentNode.getRightNode());
            }
        }
        return maxVal;
    }
}
