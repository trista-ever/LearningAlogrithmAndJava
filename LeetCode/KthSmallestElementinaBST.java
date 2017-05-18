package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2017/5/17 22:52
 *
 * @author weiyu si
 */
public class KthSmallestElementinaBST {
    //中序遍历后，取值
//    public int kthSmallest(TreeNode root, int k) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//        inorder(root,list);
//        return list.get(k-1);
//
//    }
//    public void inorder(TreeNode root, List a){
//        if(root == null) return;
//        inorder(root.left,a);
//        a.add(root.val);
//        inorder(root.right,a);
//    }

    //利用二叉查找树的性质，计算左子树的节点数目，查看是否在左子树上。
    public int kthSmallest(TreeNode root,int k){
           int len = count(root.left);
           if(k<len){
               return kthSmallest(root.left,k);
           }else if(k>len){
               return kthSmallest(root.right,k);
           }else{
               return root.val;
           }

    }
    public int count(TreeNode n){
        if(n==null) return 0;
        return 1+count(n.left)+count(n.right);
    }
}
