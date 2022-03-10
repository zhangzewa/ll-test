package removeVowels;

/**
 * 给你一个字符串 S，请你删去其中的所有元音字母
 *（ 'a'，'e'，'i'，'o'，'u'），并返回这个新字符串。
 * @author：Wen
 * @version：1.0
 * @date：2021/4/27 15:04
 * @copyright 老九学堂
 * @remark TODO
 */
public class RemoveVowels {
    public String removeVowels(String s){
        for (String c:new String[]{"a", "e", "i", "o", "u"}
             ) {
            s = s.replace(c,"");
        }
        return s;
    }
}
