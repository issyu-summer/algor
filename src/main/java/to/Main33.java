package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main33 {

    //二叉搜索树的后序遍历
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }

    private boolean recur(int[] postorder, int l, int r) {
        //数组长度是1
        if(l>=r){
            return true;
        }
        int i=l;
        while (i<=r&&postorder[i]<postorder[r]){
            i++;
        }
        int m=i;
        while (i<=r&&postorder[i]>postorder[r]){
            i++;
        }
        return i==r&&recur(postorder,l,m-1)&&recur(postorder,m,r-1);
    }
}
