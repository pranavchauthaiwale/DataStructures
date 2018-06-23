package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

import java.util.Stack;

public class InorderTraversal {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getBinaryTree();
        RecursiveInorderTraversal(root);
        IterativeInorderTraversal();
    }

    public static void RecursiveInorderTraversal(TreeNode node) {
        if (node != null) {
            RecursiveInorderTraversal(node.getLeftNode());
            System.out.println(node.getData());
            RecursiveInorderTraversal(node.getRightNode());
        }
    }

    public static void IterativeInorderTraversal() {

        TreeNode root = TreeUtils.getBinaryTree();
        TreeNode currentNode = root;
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeftNode();
            } else {
                if (stack.isEmpty()) {
                    break;
                } else {
                    currentNode = stack.pop();
                    System.out.print(currentNode.getData() + " ");
                    currentNode = currentNode.getRightNode();
                }
            }
        }
    }
}
