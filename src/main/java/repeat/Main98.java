package repeat;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/validate-binary-search-tree/">98.验证二叉搜索树</a><br/>
 * Long pre=Long.MIN_VALUE、if(root.val<=pre) return false
 */
public class Main98 {

    Long pre=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(root.val<=pre){
            return false;
        }
        pre=(long)root.val;
        return isValidBST(root.right);
    }
}
