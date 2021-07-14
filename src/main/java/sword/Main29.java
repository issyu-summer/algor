package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main29 {

    public int[] spiralOrder(int[][] matrix) {
        int l=0,r=matrix[0].length-1,t=0,b= matrix.length-1;
        int []ar=new int[(r+1)*(b+1)];
        int index=0;
        while (true){
            //向右
            for (int i = l; i <=r ; i++) {
                ar[index++]=matrix[t][i];
            }
            //准备向下
            if(++t>b){
                break;
            }
            //向下
            for (int i = t; i <=b ; i++) {
                ar[index++]=matrix[i][r];
            }
            //准备向左
            if(--r<l){
                break;
            }
            //向左
            for (int i = r; i >=l ; i--) {
                ar[index++]=matrix[b][i];
            }
            //准备向上
            if(--b<t){
                break;
            }
            for (int i = b; i >=t ; i--) {
                ar[index++]=matrix[i][l];
            }
            if(++l>r){
                break;
            }
        }
        return ar;
    }
}
