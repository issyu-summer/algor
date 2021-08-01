package shopee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main199 {

    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        res=new ArrayList<>();
        bfs(root);
        return res;
    }

    private void bfs(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>(){{
            add(root);
        }};
        while (!queue.isEmpty()){
            int len=queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if(i==len-1){
                    res.add(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
    }

    private void dfs(TreeNode root,int depth){
        if(root==null){
            return;
        }
        if(res.size()==depth){
            res.add(root.val);
        }
        dfs(root.right,depth+1);
        dfs(root.left,depth+1);
    }
}
