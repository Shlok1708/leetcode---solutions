class Solution {
    public int maxSubArray(int[] nums) {
        int currentValue = nums[0];
        int maxShlok = nums[0];
        for(int i = 1;i<nums.length;i++){
            currentValue = Math.max(nums[i],currentValue + nums[i]);
            maxShlok = Math.max(maxShlok , currentValue);
        }
        return maxShlok;
    }
}