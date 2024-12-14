class Solution {
    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];       
        sum[0] =  nums[0];
        for(int i = 1;i<=nums.length-1;i++){
            for(int j = i;j>=0;j--){
                sum[i] += nums[j];                                     
            }
     } 
        return sum;
    }
}