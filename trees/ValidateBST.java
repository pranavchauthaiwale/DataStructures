package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidateBST {
    public static void main(String[] args){
        TreeNode root = TreeUtils.getBinarySearchTree();
        System.out.println("Inorder traversal of given BST: ");
        iterativeInOrder(root);
        boolean result = validateBinarySearchTree(TreeUtils.getBinarySearchTree());
        System.out.println("Is BST valid: " + result);
    }

    private static boolean validateBinarySearchTree(TreeNode root){
        if(root == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.getLeftNode() != null){
                if(currentNode.getData() < currentNode.getLeftNode().getData()){
                    return false;
                }
                queue.offer(currentNode.getLeftNode());
            }
            if(currentNode.getRightNode() != null){
                if(currentNode.getData() > currentNode.getRightNode().getData()){
                    return false;
                }
                queue.offer(currentNode.getRightNode());
            }
        }
        return true;
    }

    private static void iterativeInOrder(TreeNode root){

        // Iterative in-order traversal on a valid Binary Search Tree will always produce sorted array
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while(true){
            if(currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.getLeftNode();
            }
            else {
                if(stack.isEmpty()){
                    break;
                }
                currentNode = stack.pop();
                System.out.print(currentNode.getData() + " ");
                currentNode = currentNode.getRightNode();
            }
        }
    }
}
