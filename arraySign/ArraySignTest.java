package arraySign;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 10:19
 * @copyright 力扣
 * @remark TODO
 */
public class ArraySignTest {
    public static void main(String[] args) {
        ArraySign arraySign = new ArraySign();
        int[] array1 = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign.arraySign(array1));

        int[] array2 = {1,5,0,2,-3};
        System.out.println(arraySign.arraySign(array2));

        int[] array3 = {-1,1,-1,1,-1};
        System.out.println(arraySign.arraySign(array3));
    }
}
