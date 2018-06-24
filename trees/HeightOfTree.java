/*
 * Implement an algorithm that that calculates the height of a binary tree.
 * Height of a binary tree is number of edges from the root node to the deepest node.
 */

package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HeightOfTree {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getBinaryTree();
        int height = recursiveHeight(root);
        System.out.println(String.format("Recursive Implementation. Height of tree is: %d", height));
        height = iterativeHeight(root);
        System.out.println(String.format("Iterative implementation. Height of tree is: %d", height));
    }

    public static int recursiveHeight(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int heightL = recursiveHeight(node.getLeftNode());
        int heightR = recursiveHeight(node.getRightNode());
        int height = heightL > heightR ? heightL : heightR;

        return height + 1;
    }

    public static int iterativeHeight(TreeNode root) {

        //Using level order traversal using Queue to visit each element
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        int depth = -1;
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode == null) {
                depth++;
                if (!queue.isEmpty()) {
                    queue.offer(null);
                }
                continue;
            }
            if (currentNode.getLeftNode() != null) {
                queue.offer(currentNode.getLeftNode());
            }
            if (currentNode.getRightNode() != null) {
                queue.offer(currentNode.getRightNode());
            }
        }
        return depth;
    }

}
