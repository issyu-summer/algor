package sword;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main54 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    private List<Integer> list;
    private int res=0,k;
    public int kthLargest(TreeNode root, int k) {
        list=new ArrayList<>();
        this.k=k;
        recur(root);
        return list.get(k-1);
    }


    private void recur(TreeNode root){
        if(root==null){
            return;
        }
        recur(root.right);
        list.add(root.val);
        recur(root.left);
    }

    private void recur2(TreeNode root){
        if(k==0||root==null){
            return;
        }
        recur2(root.right);
        if(--k==0){
            res=root.val;
        }
        recur2(root.left);
    }
}
