package runningSum;

/**
 * 给你一个数组 nums 。
 * 数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i])
 * 请返回 nums 的动态和。
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 15:44
 * @copyright 力扣
 * @remark TODO
 */
public class RunningSum {
    public int[] runningSum(int[] nums){
        int[] sumArray = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length > 2){
                sum += nums[i];
                sumArray[i] = sum;
            }
        }
        return sumArray;
    }
}
