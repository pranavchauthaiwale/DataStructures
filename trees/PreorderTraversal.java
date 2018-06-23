package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

import java.util.Stack;

public class PreorderTraversal {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getBinaryTree();
        recursivePreorderTraversal(root);
        iterativePreorderTraversal(root);
    }

    public static void recursivePreorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.println(node.getData());
            recursivePreorderTraversal(node.getLeftNode());
            recursivePreorderTraversal(node.getRightNode());
        }
    }

    public static void iterativePreorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            System.out.print(currentNode.getData() + " ");
            if (currentNode.getRightNode() != null) {
                stack.push(currentNode.getRightNode());
            }
            if (currentNode.getLeftNode() != null) {
                stack.push(currentNode.getLeftNode());
            }
        }
    }

}
