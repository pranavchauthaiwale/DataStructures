/*
 * Implement an algorithm that that calculates the size of a binary tree.
 * Size of a binary tree is the number of total elements in the given tree
 */

package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfTree {

    public static void main(String[] args){
        TreeNode root = TreeUtils.getBinaryTree();
        int size = recursiveSizeOfTree(root);
        System.out.println(String.format("Recursive implementation. Size of tree is: %d", size));
        size = iterativeSizeOfTree(root);
        System.out.println(String.format("Iterative implementation. Size of tree is %d", size));
    }

    public static int recursiveSizeOfTree(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1 + recursiveSizeOfTree(root.getLeftNode()) + recursiveSizeOfTree(root.getRightNode());
    }

    public static int iterativeSizeOfTree(TreeNode root){

        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;

        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            sum++;
            if(currentNode.getLeftNode() != null){
                queue.offer(currentNode.getLeftNode());
            }
            if(currentNode.getRightNode() != null){
                queue.offer(currentNode.getRightNode());
            }
        }
        return sum;
    }
}
