package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main48 {

    public void rotate(int[][] matrix) {
        int len=matrix.length;
        if(len==0){
            return;
        }
        //对角线反转
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix,i,j);
            }
        }
        //水平翻转
        for (int[] ints : matrix) {
            int l = 0, r = ints.length - 1;
            while (l < r) {
                swap(ints, l, r);
                l++;
                r--;
            }
        }
    }

    private void swap(int[][] ar, int i, int j){
        int tmp=ar[i][j];
        ar[i][j]=ar[j][i];
        ar[j][i]=tmp;
    }

    private void swap(int []ar,int l,int r){
        int tmp=ar[l];
        ar[l]=ar[r];
        ar[r]=tmp;
    }
}
