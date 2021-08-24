package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main26 {

    //树的子结构
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return A!=null&&B!=null&&
        (sub(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }

    private boolean sub(TreeNode t,TreeNode st){
        if(st==null){
            return true;
        }
        if(t==null){
            return false;
        }
        return st.val==t.val&&sub(t.left,st.left)&&sub(t.right,st.right);
    }
}
