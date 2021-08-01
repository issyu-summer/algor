package shopee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main257 {

    List<String> res;
    StringBuilder sb;
    public List<String> binaryTreePaths(TreeNode root) {
        res=new ArrayList<>();
        this.sb=new StringBuilder();
        backTrace(root);
        return res;
    }

    private void backTrace(TreeNode root){
        if(root==null){
            return;
        }
        //通过暂存来回溯到上一个状态,无懈可击
        StringBuilder tmp=new StringBuilder(sb);
        sb.append(root.val);
        if(root.right==null&&root.left==null){
            res.add(sb.toString());
        }
        if(root.right!=null||root.left!=null){
            sb.append("->");
        }
        backTrace(root.left);
        backTrace(root.right);
        sb=tmp;
    }
}
