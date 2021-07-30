package sword;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main32sb1 {

    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }

    //想出队先暂存
    public int[] levelOrder(TreeNode root) {
       Queue<TreeNode> queue= new LinkedList<>() {{
           add(root);
       }};
       List<Integer> list=new LinkedList<>();
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            list.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i]=list.get(i);
        }
        return ints;
    }
}
