package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main129 {

    //根到叶子节点的数字之和
    int res;
    int tmp;
    public int sumNumbers(TreeNode root) {
        res=0;
        tmp=0;
        backTrace(root);
        return res;
    }

    private void backTrace(TreeNode root){
        if(root==null){
            return;
        }
        //计算值要放在前面
        tmp=10*tmp+root.val;
        if(root.left==null&&root.right==null){
            res+=tmp;
        }
        backTrace(root.left);
        backTrace(root.right);
        tmp/=10;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(9);
        root.right=new TreeNode(0);
        root.left.right=new TreeNode(1);
        System.out.println(new Main129().sumNumbers(root));
    }
}
