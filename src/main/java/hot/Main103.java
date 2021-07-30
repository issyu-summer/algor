package hot;

import java.util.LinkedList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        LinkedList<TreeNode> queue=new LinkedList<>(){{
            add(root);
        }};
        while (!queue.isEmpty()){
            LinkedList<Integer> tmp=new LinkedList<>();
            int len=queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.removeFirst();
                //奇数
                if((res.size()&1)==1){
                    tmp.addFirst(node.val);
                }else {
                    tmp.addLast(node.val);
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
