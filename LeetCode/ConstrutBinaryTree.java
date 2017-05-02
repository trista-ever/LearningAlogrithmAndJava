package LeetCode;

/**
 * 2017/4/20 21:04
 *
 * @author weiyu si
 */
public class ConstrutBinaryTree {
    public TreeNode buildTree(int[] inorder,int[] postorder){
        return rebuild(postorder,inorder,0,postorder.length-1,0,inorder.length-1);
    }
    public TreeNode rebuild(int[] postorder, int[] inorder,int postL,int postR,int inL,int inR){
        if(postL>postR || inL>inR) return null;
        TreeNode root = new TreeNode(postorder[postR]);
        int i=0;
        for(;i<inorder.length;i++){
            if(inorder[i]==postorder[postR])break;
        }
        int postLeftLen = i-inL;
        root.left=rebuild(postorder,inorder,postL,postL+postLeftLen-1,inL,i-1);
        root.right=rebuild(postorder,inorder,postL+postLeftLen,postR-1,i+1,inR);
        return root;
    }
    public static void main(String[] args){
        ConstructBinaryTree a= new ConstructBinaryTree();
        int[] in=new int[]{1,2,3,4};
        int[] post= new int[]{4,3,2,1};
        a.buildTree(in,post);
    }
}
