package twoSum;

import java.util.Arrays;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/28 10:07
 * @copyright 老九学堂
 * @remark TODO
 */
public class TwoSumTest {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        TwoSum twoSum = new TwoSum();

        System.out.println(Arrays.toString(twoSum.twoSum(nums,9)));
    }
}
