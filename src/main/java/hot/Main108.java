package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main108 {

    private int []ar;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.ar=nums;
        return recur(0,ar.length-1);
    }

    private TreeNode recur(int l,int r){
        if(l>r){
            return null;
        }
        //换成位运算会无限递归
        int mid=l+(r-l)/2;
        TreeNode node=new TreeNode(ar[mid]);
        node.left=recur(l,mid-1);
        node.right=recur(mid+1,r);
        return node;
    }

    public static void main(String[] args) {
        new Main108().sortedArrayToBST(new int[]{
                -10,-3,0,5,9
        });
    }
}
