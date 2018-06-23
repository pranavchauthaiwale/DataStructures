package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

public class MaximumInTree {

    public static void main(String[] args){
        TreeNode root = TreeUtils.getBinaryTree();
        int maximumValue = recursiveMaximum(root);
        System.out.println(maximumValue);
    }

    public static int recursiveMaximum(TreeNode node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int maxL = recursiveMaximum(node.getLeftNode());
        int maxR = recursiveMaximum(node.getRightNode());
        int val = maxL > maxR ? maxL : maxR;
        val = val > node.getData() ? val : node.getData();
        return val;
    }
}
