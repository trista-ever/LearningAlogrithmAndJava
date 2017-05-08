package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * 2017/5/8 21:36
 *
 * @author weiyu si
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        int m = matrix.length-1;
        int n= matrix[0].length-1;
        int r=0;
        int c=0;
        while(r<=m||c<=n){
            for(int i=c;i<=n;i++) res.add(matrix[r][i]); //注意开始和结束的值
            r++;
            for(int i=r;i<=m;i++) res.add(matrix[i][n]);
            n--;
            if(r<m){
                for(int i=n;i>=c;i--) res.add(matrix[m][i]);
            }
            m--; //为啥这个m没有包含在if语句块中，因为有while的判断条件
            if(c<n){
                for(int i=m ;i>=r;i--) res.add(matrix[i][c]);
            }
            c++;
        }
        return res;

    }
}
