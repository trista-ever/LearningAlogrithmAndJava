package LeetCode;

/**
 * 2017/5/3 23:07
 *
 * @author weiyu si
 */
public class ReverseWordsInString {
    public String reverseWords(String s) {
        if (s.length()==0) return "";
        String trimed = s.trim();
        if (trimed.length()==0) return "";   //发现是否只包含空格
        String[] strings = trimed.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (int i=strings.length-1; i>=0; i--){
            builder.append(strings[i]+" ");   //从后往前遍历，就不需要加入reverse
        }
        return builder.toString().trim();
    }
}
