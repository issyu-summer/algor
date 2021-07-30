package hot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>() {{
            offer(root);
        }};
        while (!queue.isEmpty()) {
            List<Integer> tmp=new ArrayList<>();
            int len=queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
