package shopee;

import java.util.LinkedList;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1792 {

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int len=classes.length;
        double avg=0,tmp = 0;
        for (int i = 0; i < len; i++) {
            classes[i][0]+=extraStudents;
            classes[i][1]+=extraStudents;
            for (int []ar:classes) {
                tmp+=ar[0]/(ar[1]*1.0);
            }
            avg=Math.max(avg,tmp/(len*1.0));
            tmp=0;
            classes[i][0]-=extraStudents;
            classes[i][1]-=extraStudents;
        }
       return avg;
    }

    public static void main(String[] args) {
        int[][] ar = new int[3][2];
        ar[0]=new int[]{
                2,4
        };
        ar[1]=new int[]{
                3,9
        }; ar[2]=new int[]{
                4,5
        };ar[3]=new int[]{
                2,10
        };
        new Main1792().maxAverageRatio(ar,2);
    }
}
