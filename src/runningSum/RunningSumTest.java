package runningSum;


import java.util.Arrays;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 15:54
 * @copyright 老九学堂
 * @remark TODO
 */
public class RunningSumTest {
    public static void main(String[] args) {
        RunningSum runningSum = new RunningSum();
        int[] num1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum.runningSum(num1)));

        int[] num2 = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum.runningSum(num2)));

        int[] num3 = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(runningSum.runningSum(num3)));

    }
}
