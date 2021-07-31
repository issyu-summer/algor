package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main114 {

    public void flatten(TreeNode root) {
       while (root!=null){
           if (root.left != null) {
               TreeNode pre = root.left;
               while (pre.right != null) {
                   pre = pre.right;
               }
               pre.right = root.right;
               root.right = root.left;
               root.left = null;
           }
           root=root.right;
       }
    }

    private void recur(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode left=root.left;
        TreeNode right=root.right;
        root.right=root.left;
        recur(left);
        recur(right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        new Main114().flatten(root);
    }
}
