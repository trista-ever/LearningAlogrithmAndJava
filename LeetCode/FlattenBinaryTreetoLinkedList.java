package LeetCode;

/**
 * 2017/4/20 21:38
 *
 * @author weiyu si
 */
public class FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        TreeNode s = new TreeNode(0);
        root=preoeder(root,s);

    }
    public TreeNode preoeder(TreeNode root,TreeNode s){
        if(root==null) return null;
        s.left=preoeder(root.left,s.left);
        s.right=preoeder(root.right,s.right);
        return s;
    }

}
