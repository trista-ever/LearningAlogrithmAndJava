package LeetCode;
import java.util.LinkedList;
import java.util.List;
/**
 * 2017/5/2 22:20
 *
 * @author weiyu si
 */
public class DifferentWaystoAddParentheses {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer>  result = new LinkedList<>();
        int len = input.length();
        for(int i=0;i<len;i++){
            char a=input.charAt(i);
            if(a =='+'||a == '-'||a=='*'){
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1,len));
                for(int n: left){
                    for(int m:right){
                        if(a=='+') result.add(n+m);
                        else if(a=='-') result.add(n-m);
                        else result.add(n*m);
                    }
                }

            }
        }
        if(result.size()==0) result.add(Integer.parseInt(input));
        return result;
    }
}
