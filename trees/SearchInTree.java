package trees;

import trees.TreeUtils.TreeNode;
import trees.TreeUtils.TreeUtils;

import java.util.LinkedList;
import java.util.Queue;

public class SearchInTree {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getBinaryTree();
        int key = 44;
        boolean result = recursiveSearch(root, key);
        System.out.println(String.format("Recursive search for key %d is: %s", key, result));
        result = iterativeSearch(root, key);
        System.out.println(String.format("Iterative search for key %d is: %s", key, result));

    }

    public static boolean recursiveSearch(TreeNode root, int key) {
        if (root == null) {
            return false;
        }
//        if (root.getData() == key) {
//            return true;
//        }
//
//        boolean findL = recursiveSearch(root.getLeftNode(), key);
//        boolean findR = recursiveSearch(root.getRightNode(), key);
//        return findL || findR;

        //Simplified version of above code
        return root.getData() == key || recursiveSearch(root.getLeftNode(), key) || recursiveSearch(root.getRightNode(), key);
    }

    public static boolean iterativeSearch(TreeNode root, int key) {

        if (root == null) {
            return false;
        }

        // Using level order traversal for searching in the tree
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.getData() == key){
                return true;
            }
            if(currentNode.getLeftNode() != null){
                queue.offer(currentNode.getLeftNode());
            }
            if(currentNode.getRightNode() != null){
                queue.offer(currentNode.getRightNode());
            }
        }

        return false;
    }
}
