package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main98 {

    //验证二叉搜索树
    Long pre=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        //越过叶子节点，则是BST
        if(root==null){
            return true;
        }
        //递归左子树
        if(!isValidBST(root.left)){
            return false;
        }
        //中序遍历是升序，如果有降序，则不是BST
        if(root.val<=pre){
            return false;
        }
        pre= (long) root.val;
        //递归右子树
        return isValidBST(root.right);
    }
}
