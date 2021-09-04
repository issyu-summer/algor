package code_top.byte_dance;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">105.从前序与中序遍历序列构造二叉树</a><br/>
 * map.put(中序)、recur(root,l,r)
 */
public class Main105 {

    Map<Integer,Integer> map;
    int[]preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       this.map=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
       this.preorder=preorder;
        return recur(0,0,inorder.length-1);
    }

    private TreeNode recur(int root, int l, int r) {
        if(l>r){
            return null;
        }
        TreeNode node=new TreeNode(preorder[root]);
        int i=map.get(preorder[root]);
        node.left=recur(root+1,l,i-1);
        node.right=recur(i-l+root+1,i+1,r);
        return node;
    }
}
