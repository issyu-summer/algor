package hot;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main105 {

    private Map<Integer,Integer> map;
    private int[]preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.map=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        this.preorder=preorder;
        return recur(0,0,inorder.length-1);
    }

    private TreeNode recur(int root,int left,int right){
        if(left>right){
            return null;
        }
        TreeNode node=new TreeNode(preorder[root]);
        int i=map.get(node.val);
        node.left=recur(root+1,left,i-1);
        node.right=recur(i-left+root+1,i+1,right);
        return node;
    }
}
