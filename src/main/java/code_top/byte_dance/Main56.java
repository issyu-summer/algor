package code_top.byte_dance;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main56 {


    //合并区间
    public int[][] merge(int[][] intervals) {
        //按照左边界排序
        Arrays.sort(intervals,(ar1,ar2)->(ar1[0]-ar2[0]));
        int [][]res=new int[intervals.length][2];
        int index=-1;
        for (int []interval:intervals) {
            //为空或者当前区间左边界大于结果区间中有边界则说明无交叉，直接放入当前区间
            if(index==-1||interval[0]>res[index][1]){
                res[++index]=interval;
                //合并区间，右边界为较大的一个
            }else {
                res[index][1]=Math.max(res[index][1],interval[1]);
            }
        }
        return Arrays.copyOf(res,index+1);
    }
}
