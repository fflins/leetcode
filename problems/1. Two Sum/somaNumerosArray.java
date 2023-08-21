public class somaNumerosArray {
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = {0,0};
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if (j==i) continue;
                else{
                    if((nums[i]+nums[j]) == target) {
                    ans[0]=i;
                    ans[1]=j;
                    break;
                    }
                }
           }
        }
        return ans;
    }
}

