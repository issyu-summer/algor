package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main27 {
    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
    public TreeNode mirrorTree(TreeNode root) {
        return recur(root);
    }

   private TreeNode recur(TreeNode node){
        if(node==null){
            return null;
        }
        TreeNode tmp=node.left;
        node.left=recur(node.right);
        node.right=recur(tmp);
        return node;
   }
}
