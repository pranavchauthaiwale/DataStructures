package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

public class InorderTraversal {

    public static void main(String[] args){
        TreeNode root = TreeUtils.getBinaryTree();
        InorderTraversal(root);
    }

    public static void InorderTraversal(TreeNode node){
        if(node != null){
            InorderTraversal(node.getLeftNode());
            System.out.println(node.getData());
            InorderTraversal(node.getRightNode());
        }
    }
}
