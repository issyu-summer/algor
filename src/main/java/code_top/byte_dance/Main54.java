package code_top.byte_dance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main54 {
    //顺时针打印矩阵
    List<Integer> res;
    public List<Integer> spiralOrder(int[][] matrix) {
        res=new ArrayList<>();
        int l=0,r=matrix[0].length-1,t=0,b=matrix.length-1;
        while (true){
            for (int i = l; i <=r; i++) {
                res.add(matrix[t][i]);
            }
            if(++t>b){
                break;
            }
            for (int i = t; i < b; i++) {
                res.add(matrix[i][r]);
            }
            if(--r<l){
                break;
            }
            for (int i = r; i>=l ; i--) {
                res.add(matrix[b][i]);
            }
            if(--b<t){
                break;
            }
            for (int i = b; i >=t ; i--) {
                res.add(matrix[i][l]);
            }
            if(++l>r){
                break;
            }
        }
        return res;
    }


}
