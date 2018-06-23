package trees.TreeUtils;

public class TreeUtils {

    public static TreeNode getBinaryTree(){
        TreeNode root = new TreeNode(15);
        TreeNode c1 = new TreeNode(8);
        TreeNode c2 = new TreeNode(12);
        TreeNode c3 = new TreeNode(25);
        TreeNode c4 = new TreeNode(14);
        TreeNode c5 = new TreeNode(6);
        TreeNode c6 = new TreeNode(44);
        TreeNode c7 = new TreeNode(9);
        TreeNode c8 = new TreeNode(-2);
        TreeNode c9 = new TreeNode(11);
        c3.setLeftNode(c7);
        c3.setRightNode(c8);

        c4.setLeftNode(c9);

        c2.setLeftNode(c5);
        c2.setRightNode(c6);

        c1.setLeftNode(c3);
        c1.setRightNode(c4);

        root.setLeftNode(c1);
        root.setRightNode(c2);
        return root;
    }
}
