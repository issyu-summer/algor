package sword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main32sb2 {
    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    public List<List<Integer>> levelOrder(TreeNode root) {
          if(root==null){
              return new ArrayList<>();
          }
        Queue<TreeNode> queue= new LinkedList<>() {{
            add(root);
        }};
        List<List<Integer>> list=new ArrayList<>();
        while (!queue.isEmpty()){
            List<Integer> tmp=new ArrayList<>();
            for (int i = queue.size(); i >0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                //当执行完size次以下语句,新的size将被确定。保证每次的数量
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            list.add(tmp);
        }
        return list;
    }
}
