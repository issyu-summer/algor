package to;

import java.util.Queue;

import java.util.LinkedList;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main37 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "[]";
        }
        Queue<TreeNode> queue= new LinkedList<TreeNode>() {{
            add(root);
        }};
        StringBuilder sb=new StringBuilder("[");
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node!=null){
                sb.append(node.val).append(",");
                queue.add(node.left);
                queue.add(node.right);
            }else {
                sb.append("null").append(",");
            }
        }
        return sb.deleteCharAt(sb.length()-1).append("]").toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")){
            return null;
        }
        String []ar=data.substring(1,data.length()-1).split(",");
        TreeNode root=new TreeNode(Integer.parseInt(ar[0]));
        Queue<TreeNode> queue=new LinkedList<>(){{
            add(root);
        }};
        int i=1;
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
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
