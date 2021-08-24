package to;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main7 {

    //重建二叉树
    private int []pre;
    private Map<Integer,Integer> inDict;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.pre=preorder;
        this.inDict=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inDict.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }

    private TreeNode recur(int root,int l,int r){
        //数组已经为空,返回null
        if(l>r){
            return null;
        }
        TreeNode node=new TreeNode(pre[root]);
        int i=inDict.get(pre[root]);
        node.left=recur(root+1,l,i-1);
        node.right=recur(i-l+root+1,i+1,r);
        return node;
    }
}
