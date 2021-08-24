package code_top.byte_dance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main103 {

    List<List<Integer>> res;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>(){{
            add(root);
        }};
        while (!queue.isEmpty()){
            LinkedList<Integer> tmp=new LinkedList<>();
            int len=queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if((res.size()&1)==0){
                    tmp.addLast(node.val);
                }else {
                    tmp.addFirst(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(new ArrayList<>(tmp));
        }
        return res;
    }
}

