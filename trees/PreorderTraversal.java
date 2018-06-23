package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

public class PreorderTraversal {

    public static void main(String[] args){
        TreeNode root = TreeUtils.getBinaryTree();
        preorderTraversal(root);
    }

    public static void preorderTraversal(TreeNode node){
        if(node != null){
            System.out.println(node.getData());
            preorderTraversal(node.getLeftNode());
            preorderTraversal(node.getRightNode());
        }
    }
}
