package hot;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main106 {
    private Map<Integer,Integer> map;
    private int[]postOrder;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        this.postOrder=postorder;
        return recur(postorder.length-1,0,inorder.length-1);
    }

    private TreeNode recur(int root,int left,int right){
        if(left>right){
            return null;
        }
        TreeNode node=new TreeNode(postOrder[root]);
        int i=map.get(node.val);
        node.right=recur(root-1,i+1,right);
        node.left=recur(root-(right-i)-1,left,i-1);
        return node;
    }
}
