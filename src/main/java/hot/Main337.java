package hot;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main337 {

    //最大权值,不选择父子关系的。
    private Map<TreeNode,Integer> f=new HashMap<>();
    private Map<TreeNode,Integer> g=new HashMap<>();
    public int rob(TreeNode root) {
       dfs(root);
       return Math.max(f.get(root),g.get(root));
    }

    private void dfs(TreeNode root) {
        if(root==null){
            return;
        }
        dfs(root.left);
        dfs(root.right);
        f.put(root,root.val+g.getOrDefault(root.left,0)+g.getOrDefault(root.right,0));
        g.put(root,
                Math.max(f.getOrDefault(root.left,0),g.getOrDefault(root.left,0))+
                Math.max(f.getOrDefault(root.right,0),g.getOrDefault(root.right,0)));
    }
}
