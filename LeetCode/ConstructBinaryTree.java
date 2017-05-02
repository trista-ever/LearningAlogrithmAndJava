package LeetCode;

/**
 * 2017/4/18 20:56
 *
 * @author weiyu si
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConstructBinaryTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

           int length = postorder.length;
           if(length==0) return null;
           TreeNode root = new TreeNode(postorder[length-1]);
           buildTree0(inorder,postorder,0,length-1,root,length-1);
           return root;

    }

    public void buildTree0(int[] inorder, int[] postorder,int st,int end, TreeNode root,int j){ //中序start,end
        System.out.println("start:"+root.val);
        System.out.println("i:"+st);
        System.out.println("j:"+end);
        if(st>=end) return;
        int index=0;
        for(int i=st;i<=end;i++){
            if(inorder[i]==root.val)
                index=i;
        }
        System.out.println("index"+index);
        if (index==st){
            root.right= new TreeNode(postorder[j-1]);
            System.out.println("st:"+root.right.val);
            buildTree0(inorder,postorder, st+1,end,root.right,j-1 ); }
        else if (index==end){
            root.left= new TreeNode(postorder[end-1]);
            System.out.println("end"+root.left.val);
            buildTree0(inorder,postorder,st,end-1,root.left,end-1);}
        else{
            root.left= new TreeNode(postorder[index-1]);
            root.right= new TreeNode(postorder[j-1]);
            System.out.println(root.left.val);
            System.out.println(root.right.val);
            buildTree0(inorder,postorder,st,index-1,root.left,index-1);
            buildTree0(inorder,postorder,index+1,end,root.right,j-1);
        }

    }
    public static void main(String[] args){
        ConstructBinaryTree a= new ConstructBinaryTree();
        int[] in=new int[]{1,2,3,4};
        int[] post= new int[]{4,3,2,1};
        a.buildTree(in,post);
    }

}
