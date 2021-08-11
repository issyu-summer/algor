package sword;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main37 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public String serialize(TreeNode root) {
        if(root==null){
            return "[]";
        }
        StringBuilder sb=new StringBuilder("[");
        Queue<TreeNode> queue=new LinkedList<>(){{
            add(root);
        }};
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node!=null){
                sb.append(node.val).append(",");
                queue.add(node.left);
                queue.add(node.right);
            }else {
                sb.append("null").append(",");
            }
        }
        sb.deleteCharAt(sb.length()-1).append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] ar = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(ar[0]));
        Queue<TreeNode> queue=new LinkedList<>(){{
            add(root);
        }};
        int i=1;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(!ar[i].equals("null")){
                node.left=new TreeNode(Integer.parseInt(ar[i]));
                queue.add(node.left);
            }
            i++;
            if(!ar[i].equals("null")){
                node.right=new TreeNode(Integer.parseInt(ar[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}
