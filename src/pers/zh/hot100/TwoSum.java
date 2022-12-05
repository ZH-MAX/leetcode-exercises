package pers.zh.hot100;

/**
 * //1
 *
 * @author zhanghu
 * @date 2022/12/5 22:45
 */
public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = solution.twoSum(nums, target);
        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            if (i == res.length-1){
                System.out.print(res[i]);
            }else {
                System.out.print(res[i]+",");
            }

        }
        System.out.print("]");
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
