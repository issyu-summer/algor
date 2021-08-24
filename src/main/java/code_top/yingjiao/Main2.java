package code_top.yingjiao;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main2 {

     static class TreeNode {
      int val = 0;
      TreeNode left = null;
      TreeNode right = null;
      public TreeNode(int val) {
        this.val = val;
      }
    }
    int res=1;
    public int maxHuffman (TreeNode root) {
        // write code here
        recur(root);
        return res;
    }

    private void recur(TreeNode root){
        if(root==null){
            return;
        }
        maxHuffman(root.left);
        if(huffman(root)){
            res=Math.max(res,count(root));
        };
        maxHuffman(root.right);
    }
    private int count(TreeNode root){
         if(root==null){
             return 0;
         }
         return 1+count(root.left)+count(root.right);
    }
    private boolean huffman(TreeNode root){
        if(root.left==null&&root.right==null){
            return true;
        }
        if(root.left==null||root.right==null){
            return false;
        }
        return root.val==root.left.val+root.right.val&&huffman(root.left)&&huffman(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        TreeNode treeNode=new TreeNode(5);
        root.right=treeNode;
        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(3);
        treeNode.right.left=new TreeNode(1);
        treeNode.right.right=new TreeNode(2);
        System.out.println(new Main2().huffman(root));
        System.out.println(new Main2().count(root));
        System.out.println(new Main2().maxHuffman(root));
    }
}
