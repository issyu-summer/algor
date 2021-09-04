package stack;

import code_top.ali.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import java.util.LinkedList;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Solution {

    List<TreeNode> tmp;
    public TreeNode pruneLeaves (TreeNode root) {
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            return null;
        }
        if(root.right!=null&&root.right.left==null&&root.right.right==null){
            return null;
        }
        // write code here
        tmp=new ArrayList<>();
        recur(root);
        delete(root);
        return root;
    }

    private void delete(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode l=root.left;
        TreeNode r=root.right;
        if(l!=null&&(tmp.contains(l.left)||tmp.contains(l.right))){
            root.left=null;
        }
        if(r!=null&&(tmp.contains(r.right)||tmp.contains(r.left))){
            root.right=null;
        }
        delete(root.left);
        delete(root.right);

    }
    private void recur(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            tmp.add(root);
        }
        recur(root.left);
        recur(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right=new TreeNode(1);
        root.right.right=new TreeNode(1);
        root.right.right.right=new TreeNode(1);
        root.right.right.right.right=new TreeNode(1);
        TreeNode node = new Solution().pruneLeaves(root);
        System.out.println();
    }
}
