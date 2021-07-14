package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main33 {

    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }
    //i是首,j是尾巴(即根)
    private boolean recur(int []postorder,int i,int j){
        if(i>=j){
            return true;
        }
        int p=i;

        //经过此循环,i~m-1一定比j小,即满足左子树比根小
        while (less(postorder,p,j)){
            p++;
        }
        int m=p;
        //使用此循环判断右子树（m~j-1）是否比根大,即是否满足右子树比根大
        while (less(postorder,j,p)){
            p++;
        }
        //能够到达根的位置,则以上两条都成立
        return p==j&&recur(postorder,i,m-1)&&recur(postorder,m,j-1);
    }

    private boolean less(int []ar,int i,int j){
        return ar[i]<ar[j];
    }
}
