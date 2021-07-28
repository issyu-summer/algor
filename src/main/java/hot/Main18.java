package hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                //进入下一轮循环
                continue;
            }
            //获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏,直接跳出循环
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }

            //获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏
            if (nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target) {
                continue;
            }
            //三数之和
            int sum = target - nums[i];

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    //进入下一轮循环
                    continue;
                }
                //获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏,直接跳出循环
                if (nums[j] + nums[j + 1] + nums[j + 2] > sum) {
                    break;
                }

                //获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏
                if (nums[j] + nums[n - 1] + nums[n - 2] < sum) {
                    continue;
                }

                //两数之和
                int twosum = sum - nums[j];
                //定义c的指针：three  d的指针：four
                int three = j + 1;
                int four = n - 1;
                while (three < four) {
                    int ss = nums[three] + nums[four];
                    if (ss == twosum) {
                        ans.add(List.of(nums[i],nums[j],nums[three],nums[four]));
                    }

                    if (nums[three] + nums[four] < twosum) {
                        three++;
                        //判断是否为不同元素
                        while (three < four && nums[three - 1] == nums[three]) {
                            three++;
                        }
                    } else {
                        four--;
                        //判断是否为不同元素
                        while (three < four && nums[four] == nums[four + 1]) {
                            four--;
                        }
                    }
                }
            }
        }
        return ans;
    }

    private int sum(Integer... ar){
        int sum=0;
        for (int i:ar) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Main18().sum(1,2,3,4,5));;
    }
}
