package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main98 {
    public  boolean isValidBST(TreeNode root) {
        return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }


    private boolean dfs(TreeNode root,long l,long h){
        if(root==null){
            return true;
        }
        if(root.val<=l||root.val>=h){
            return false;
        }
        return dfs(root.left,l,root.val)&&dfs(root.right,root.val,h);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(6);
        System.out.println(new Main98().isValidBST(root));
    }

}
