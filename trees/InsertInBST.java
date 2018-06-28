package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

import java.util.Stack;

public class InsertInBST {
    public static void main(String[] args){
        TreeNode root = TreeUtils.getBinarySearchTree();
        System.out.println("Inorder traversal of given BST before insertion: ");
        iterativeInOrder(root);
        int newData = 39;
        insertInBinarySearchTree(root, newData);
        System.out.println(String.format("%sInorder traversal of given BST after insertion of %d: ",
                System.lineSeparator(), newData) );
        iterativeInOrder(root);
    }

    private static void insertInBinarySearchTree(TreeNode root, int data){
        if(root == null){
            return;
        }

        TreeNode currentNode = root;
        while(true){
            if(currentNode.getData() > data){
                if(currentNode.getLeftNode() != null){
                    currentNode = currentNode.getLeftNode();
                }
                else {
                    currentNode.setLeftNode(new TreeNode(data));
                    break;
                }
            }
            else{
                if(currentNode.getRightNode() != null){
                    currentNode = currentNode.getRightNode();
                }
                else {
                    currentNode.setRightNode(new TreeNode(data));
                    break;
                }
            }
        }
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
