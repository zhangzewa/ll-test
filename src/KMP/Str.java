package KMP;

/**
 * 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 -1。
 * 暴力匹配/KMP算法
 * @author：Wen
 * @version：1.0
 * @date：2021/4/20 10:56
 * @copyright 力扣
 * @remark TODO
 */
public class Str {
    //暴力匹配
//    public int strStr(String haystack, String needle){
//        /**
//         * haystack字符串的长度
//         */
//        int n = haystack.length();
//        /**
//         * needle字符串的长度
//         */
//        int m = needle.length();
//        for (int i = 0; i + m <= n; i++) {
//            boolean flag = true;
//            for (int j = 0; j < m; j++) {
//                if (haystack.charAt(i + j) != needle.charAt(j)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                return i;
//            }
//        }
//        return -1;
//    }


    //KMP算法
    public int strStr(String haystack, String needle){
        /**
         * haystack字符串的长度
         */
        int n = haystack.length();
        /**
         * needle字符串的长度
         */
        int m = needle.length();
        //判断为空字符串时
        if (m == 0){
            return 0;
        }
        /**
         * 定义一个needle长度的数组，来保存下标
         */
        int[] pi = new int[m];
        //字符匹配 - 核心算法

        for (int i = 1,j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)){
                j  = pi[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)){
                j++;
            }
            pi[i] = j;
        }
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = pi[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if (j == m){
                return i - m + 1;
            }
        }
        return - 1;
    }
}
