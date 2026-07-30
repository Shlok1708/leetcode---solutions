class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int arraySum = 0;
        int totalSum = n*(n+1)/2;
        for(int i = 0;i<n;i++){
        arraySum = arraySum+nums[i];

        }

        return totalSum-arraySum;
    }
}