package code_top.byte_dance;

import com.sun.source.tree.BreakTree;

import java.util.Queue;

import java.util.LinkedList;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main958 {

    //二叉树的完全性校验，如果是，则null节点一定是最后被访问到
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>(){{
            add(root);
        }};
        boolean reachNull=false;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node==null){
                reachNull=true;
            }else {
                //非null节点在null之后被访问到，则false
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
