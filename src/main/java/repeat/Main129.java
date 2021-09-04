package repeat;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/">129.根到叶子几点数字之和</a><br/>
 */
public class Main129 {

    int tmp,res;
    public int sumNumbers(TreeNode root) {
        tmp=0;
        res=0;
        backTrace(root);
        return res;
    }

    private void backTrace(TreeNode root){
        if(root==null){
            return;
        }
        tmp=10*tmp+root.val;
        if(root.left==null&&root.right==null){
            res+=tmp;
        }
        backTrace(root.left);
        backTrace(root.right);
        tmp/=10;
    }
}
