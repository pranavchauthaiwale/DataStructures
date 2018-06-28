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

    public static TreeNode getBinarySearchTree(){
        TreeNode root = new TreeNode(25);
        TreeNode c1 = new TreeNode(14);
        TreeNode c2 = new TreeNode(61);

        TreeNode c3 = new TreeNode(7);
        TreeNode c4 = new TreeNode(18);
        TreeNode c5 = new TreeNode(42);
        TreeNode c6 = new TreeNode(78);

        TreeNode c7 = new TreeNode(9);
        TreeNode c8 = new TreeNode(30);
        TreeNode c9 = new TreeNode(71);
        TreeNode c10 = new TreeNode(108);

        root.setLeftNode(c1);
        root.setRightNode(c2);

        c1.setLeftNode(c3);
        c1.setRightNode(c4);

        c2.setLeftNode(c5);
        c2.setRightNode(c6);

        c3.setRightNode(c7);
        c5.setLeftNode(c8);
        c6.setLeftNode(c9);
        c6.setRightNode(c10);
        return root;
    }
}
