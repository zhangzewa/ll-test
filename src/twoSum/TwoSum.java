package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出和为目标值的那两个整数，
 * 并返回它们的数组下标。
 * @author：Wen
 * @version：1.0
 * @date：2021/4/28 9:58
 * @copyright 老九学堂
 * @remark TODO
 */
public class TwoSum {
    /**
     * 方法一 - 暴力枚举
     * 传入数组和目标数，返回下标
     * @param nums 给定的一个数组
     * @param target 目标值的数
     * @return 两个数组元素相加得到目标值的数的下标
     */
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[]{0, 1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * 方法二 - 哈希映射
     * 1.遍历数组 nums，i 为当前下标，每个值都判断map中是否存在 target-nums[i] 的 key 值
     * 2.如果存在则找到了两个值，如果不存在则将当前的 (nums[i],i) 存入 map 中，继续遍历直到找到为止
     * 3.如果最终都没有结果则抛出异常
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumV2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
