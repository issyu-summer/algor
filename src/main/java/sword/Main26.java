package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main26 {
    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null)&&(recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }

    private boolean recur(TreeNode t,TreeNode st){
        if(st==null){
            return true;
        }
        if(t==null||t.val!=st.val){
            return false;
        }
        return recur(t.left,st.left)&&recur(t.right,st.right);
    }
}
