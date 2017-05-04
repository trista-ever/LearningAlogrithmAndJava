package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 2017/5/4 22:53
 * 由于x^x^x = x，无法直接利用I的方法来解。异或
 但可以应用类似的思路，即利用位运算来消除重复3次的数。以一个数组[14 14 14 9]为例，
 将每个数字以二进制表达：
 1110
 1110
 1110
 1001
 _____
 4331    对每一位进行求和
 1001    对每一位的和做%3运算，来消去所有重复3次的数
 *
 * @author weiyu si
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!a.containsKey(nums[i])){
                a.put(nums[i],1);
            }else{
                a.put(nums[i],a.get(nums[i])+1); //get(key)
            }
        }
        for(int key : a.keySet()){     //a.keySet()
            if(a.get(key)!=3) return key;
        }
        return -1;
    }

    public int singleNumberII(int[] nums) {
        int result=0;
        for(int i=31;i>=0;i--){
            int sum=0;
            int temp= 1<<i;
            for(int j=0;j<nums.length;j++){
                if((nums[j]&temp)!=0) sum++;
            }
            result=(result<<1)+sum%3;
        }
        return result;
    }
}

