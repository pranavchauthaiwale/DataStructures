package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args){
        TreeNode root = TreeUtils.getBinaryTree();
        levelOrderTraversal(root);
    }

    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currentElement = queue.poll();
            System.out.print(currentElement.getData() + " ");
            if(currentElement.getLeftNode() != null){
                queue.offer(currentElement.getLeftNode());
            }
            if(currentElement.getRightNode() != null){
                queue.offer(currentElement.getRightNode());
            }
        }
    }
}
