package LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 2017/5/11 20:43
 *
 * @author weiyu si
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new LinkedList<>();
        TreeNode st = root;
        while(!stack.isEmpty()||st!=null){
            if(st!=null){
                stack.push(st);
                res.add(st.val);
                st=st.left;
            }else{
                TreeNode a= stack.pop();
                st=a.right;
            }
        }
        return res;

    }
}
