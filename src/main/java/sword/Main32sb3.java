package sword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main32sb3 {
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
        LinkedList<TreeNode> queue= new LinkedList<>() {{
            add(root);
        }};
        List<List<Integer>> list=new LinkedList<>();
        while (!queue.isEmpty()){
            LinkedList<Integer> tmp=new LinkedList<>();
            for (int i = queue.size(); i >0 ; i--) {
                TreeNode node=queue.removeFirst();
                //偶数层,第0层放哪里都可以
                if((list.size()&1)==0){
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
                //奇数层,下一层是偶数层

            }
            list.add(tmp);
        }
        return list;
    }
}
