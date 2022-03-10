package arraySign;

/**
 * 已知函数 signFunc(x) 将会根据 x 的正负返回特定值：
 * 如果 x 是正数，返回 1
 * 如果 x 是负数，返回 -1
 * 如果 x 是等于 0 ，返回 0
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 10:14
 * @copyright 力扣
 * @remark TODO
 */
public class ArraySign {
    public int arraySign(int[] nums){
        /**
         * 记录负数的个数
         */
        int count = 0;
        //遍历整个数组，找0和负数的个数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                return 0;
            }else if (nums[i] < 0){
                count++;
            }
        }
        if(count % 2 == 0){
            return 1;
        }else {
            return -1;
        }
    }
}
