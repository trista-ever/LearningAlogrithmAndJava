package LeetCode;
import java.util.List;

/**
 * 2017/5/9 22:29
 * dp思想，是否可以放入空格space，dp数组的长度为s.length()+1,表示字符串可以插入的空格的数量
 * List中有contains方法
 * 满足条件后，break退出。
 * 该方法只是判断是否可以放space
 * @author weiyu si
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i+1))){
                    dp[i+1]=true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
}
