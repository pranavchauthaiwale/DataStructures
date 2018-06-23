package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

public class PostorderTraversal {

    public static void main(String[] args){
        TreeNode root = TreeUtils.getBinaryTree();
    }

    public static void postorderTraversal(TreeNode node){
        if(node != null){
            postorderTraversal(node.getLeftNode());
            postorderTraversal(node.getRightNode());
            System.out.println(node.getData());
        }
    }
}
