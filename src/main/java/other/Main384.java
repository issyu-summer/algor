package other;

import java.util.Random;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/shuffle-an-array/">384.打乱数组</a><br/>
 */
public class Main384 {

    class Solution {
        int [] ar;
        int []origin;
        Random random;
        public Solution(int[] nums) {
            this.ar =nums;
            this.origin=nums.clone();
            random=new Random();
        }
        public int[] reset() {
            this.ar =origin;
            origin=origin.clone();
            return origin;
        }
        public int[] shuffle() {
            for (int i = 0; i < ar.length; i++) {
                swap(i, randRange(i, ar.length));
            }
            return ar;
        }
        private void swap(int i, int j) {
            int tmp=ar[i];
            ar[i]=ar[j];
            ar[j]=tmp;
        }
        private int randRange(int i, int j) {
            return random.nextInt(j-i)+i;
        }
    }
}
