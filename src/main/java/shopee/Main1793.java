package shopee;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1793 {
    public int maximumScore(int[] nums, int k) {
        int score=0;
        for (int i = 0; i <=k; i++) {
            int lastMin=min(nums,i,k-1);
            for (int j = k; j < nums.length; j++) {
                int min=Math.min(lastMin,nums[j]);
                score=Math.max(min*(j-i+1),score);
                lastMin=min;
            }
        }
        return score;
    }

    private int min(int []ar,int i,int j){
        int min=ar[i];
        for (int k = i+1; k <j+1; k++) {
            min=Math.min(min,ar[k]);
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println( new Main1793().maximumScore(new int[]{
                6569,9667,3148,7698,1622,2194,793,9041,1670,1872
        },5));;
    }
}
