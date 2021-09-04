package repeat;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/check-completeness-of-a-binary-tree/">二叉树的完全性校验</a><br/>
 * 层序遍历时，null不能出现在非null的前面
 */
public class Main958 {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>(){{
            add(root);
        }};
        boolean reachNull=false;
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node==null){
                reachNull=true;
            }else {
                if(reachNull){
                    return false;
                }
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return true;
    }
}
